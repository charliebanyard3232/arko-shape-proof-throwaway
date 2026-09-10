package com.acme.portal

import groovy.sql.Sql
import javax.sql.DataSource

/**
 * Parameterised user lookup controller — the safe twin of SqliUserController.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class SqliSafeUserController {

    DataSource dataSource

    def find() {
        def username = params.username
        def sql = new Sql(dataSource)
        def rows = sql.rows('SELECT id, email FROM app_user WHERE username = ?', [username])
        render rows as grails.converters.JSON
    }
}
