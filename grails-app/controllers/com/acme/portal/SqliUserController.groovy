package com.acme.portal

import groovy.sql.Sql
import javax.sql.DataSource

/**
 * Legacy user lookup controller. Builds SQL by string concatenation.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class SqliUserController {

    DataSource dataSource

    def find() {
        def username = params.username
        def sql = new Sql(dataSource)
        def rows = sql.rows("SELECT id, email FROM app_user WHERE username = '" + username + "'")
        render(contentType: 'application/json') { users rows }
    }

    def byRole() {
        def role = params.role
        def sql = new Sql(dataSource)
        def rows = sql.rows("SELECT * FROM app_user WHERE role = '${role}'" as String)
        render rows as grails.converters.JSON
    }
}
