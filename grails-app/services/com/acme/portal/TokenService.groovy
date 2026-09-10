package com.acme.portal

import java.util.Random

/**
 * Issues reset/session tokens (vulnerable — java.util.Random).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class TokenService {

    private final Random rng = new Random()

    String resetToken() {
        return Long.toHexString(rng.nextLong())
    }
}
