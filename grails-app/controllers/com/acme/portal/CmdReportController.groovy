package com.acme.portal


/**
 * Invokes an external report generator via the shell (vulnerable).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class CmdReportController {

    def generate() {
        def name = params.reportName
        def proc = ["/bin/sh", "-c", "generate-report " + name].execute()
        proc.waitFor()
        render proc.text
    }

    def ping() {
        def host = params.host
        def out = "ping -c 1 ${host}".execute().text
        render out
    }
}
