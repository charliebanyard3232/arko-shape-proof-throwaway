package com.acme.portal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Uses PathGuard.resolveSafe (another file) for containment.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class HelperAssetService {
    private final File base = new File("/srv/assets");
    public byte[] load(String rel) throws IOException {
        File t = PathGuard.resolveSafe(base, rel);
        return Files.readAllBytes(t.toPath());
    }
}
