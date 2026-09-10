package com.acme.portal


/**
 * Uses CommandAllowList.valid (another file) before exec.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class HelperCmdController {
    def run() {
        def name = params.reportName
        if (!CommandAllowList.valid(name)) { render status: 400; return }
        def out = ['generate-report', name].execute().text
        render out
    }
}
