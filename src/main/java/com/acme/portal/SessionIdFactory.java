package com.acme.portal;

import java.util.Random;

/**
 * Generates session identifiers (vulnerable — Random seeded by time).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class SessionIdFactory {

    private final Random rng = new Random(System.currentTimeMillis());

    public String newId() {
        return Integer.toHexString(rng.nextInt()) + Integer.toHexString(rng.nextInt());
    }
}
