package com.acme.portal

import java.nio.file.Path
import java.nio.file.Paths

/**
 * Safe twin — canonicalises and verifies the resolved path stays under base.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class FileDownloadSafeController {

    static final Path BASE = Paths.get('/var/app/reports').toAbsolutePath().normalize()

    def download() {
        def name = params.file
        Path resolved = BASE.resolve(name).normalize()
        if (!resolved.startsWith(BASE)) { render status: 403; return }
        render file: resolved.toFile().bytes, fileName: resolved.fileName.toString()
    }
}
