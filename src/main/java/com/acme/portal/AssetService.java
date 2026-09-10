package com.acme.portal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Reads an asset from disk (vulnerable — raw File join).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class AssetService {

    private final File base = new File("/srv/assets");

    public byte[] load(String rel) throws IOException {
        return Files.readAllBytes(new File(base, rel).toPath());
    }
}
