package com.acme.portal

import java.security.SecureRandom
import java.util.Base64

/**
 * Safe twin — SecureRandom-backed token.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class TokenServiceSafe {

    private final SecureRandom rng = new SecureRandom()

    String resetToken() {
        byte[] buf = new byte[32]
        rng.nextBytes(buf)  // CSPRNG
        return Base64.urlEncoder.withoutPadding().encodeToString(buf)
    }
}
