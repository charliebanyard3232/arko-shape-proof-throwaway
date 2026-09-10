package com.acme.portal

import groovy.sql.Sql
import javax.sql.DataSource

/**
 * Uses InputSanitizer.cleanId (another file) before building SQL fragment.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class HelperSqlController {
    DataSource dataSource
    def find() {
        def raw = params.id
        def id = InputSanitizer.cleanId(raw)
        def sql = new Sql(dataSource)
        def rows = sql.rows("SELECT * FROM app_user WHERE id = '" + id + "'")
        render rows as grails.converters.JSON
    }
}
