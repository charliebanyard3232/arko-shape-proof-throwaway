package com.acme.portal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Safe twin — canonical path containment check.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class AssetServiceSafe {

    private final File base = new File("/srv/assets");

    public byte[] load(String rel) throws IOException {
        File target = new File(base, rel).getCanonicalFile();
        if (!target.getPath().startsWith(base.getCanonicalPath() + File.separator)) {
            throw new SecurityException("path escape");
        }
        return Files.readAllBytes(target.toPath());
    }
}
