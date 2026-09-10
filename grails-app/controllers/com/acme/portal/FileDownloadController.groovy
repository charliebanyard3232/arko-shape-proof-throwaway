package com.acme.portal

import java.nio.file.Paths

/**
 * Serves files from a data directory (vulnerable — no canonicalisation).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class FileDownloadController {

    static final String BASE = '/var/app/reports'

    def download() {
        def name = params.file
        def f = new File(BASE + '/' + name)
        render file: f.bytes, fileName: name
    }
}
