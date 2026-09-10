package com.acme.portal

import groovy.sql.Sql
import javax.sql.DataSource
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Mixed controller — one genuinely vulnerable route and one correctly guarded route.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class MixedValidationController {
    DataSource dataSource
    static final Path BASE = Paths.get('/var/app/exports').toAbsolutePath().normalize()

    def lookup() {
        def code = params.code
        def sql = new Sql(dataSource)
        def rows = sql.rows("SELECT * FROM coupon WHERE code = '" + code + "'")
        render rows as grails.converters.JSON
    }

    def export() {
        def name = params.name
        Path resolved = BASE.resolve(name).normalize()
        if (!resolved.startsWith(BASE)) { render status: 403; return }
        render file: resolved.toFile().bytes, fileName: resolved.fileName.toString()
    }
}
