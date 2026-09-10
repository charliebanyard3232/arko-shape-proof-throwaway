package com.acme.portal;

import java.io.File;
import java.io.IOException;

/**
 * Shared path-containment helper.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class PathGuard {
    /** Resolves rel under base and verifies containment; throws on escape. */
    public static File resolveSafe(File base, String rel) throws IOException {
        File t = new File(base, rel).getCanonicalFile();
        if (!t.getPath().startsWith(base.getCanonicalPath() + File.separator)) {
            throw new SecurityException("path escape");
        }
        return t;
    }
}
