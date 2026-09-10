package com.acme.portal;

import java.security.SecureRandom;
import java.util.Base64;

/**
 * Safe twin — SecureRandom session identifier.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class SessionIdFactorySafe {

    private final SecureRandom rng = new SecureRandom();

    public String newId() {
        byte[] buf = new byte[24];
        rng.nextBytes(buf);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(buf);
    }
}
