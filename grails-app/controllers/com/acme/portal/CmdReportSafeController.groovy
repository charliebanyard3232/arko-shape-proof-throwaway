package com.acme.portal


/**
 * Safe twin — argument vector, no shell, allow-list.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class CmdReportSafeController {

    private static final Set<String> ALLOWED = ['daily','weekly','monthly'] as Set

    def generate() {
        def name = params.reportName
        if (!ALLOWED.contains(name)) { render status: 400; return }
        def proc = ['generate-report', name].execute()  // argv form, no shell
        proc.waitFor()
        render proc.text
    }
}
