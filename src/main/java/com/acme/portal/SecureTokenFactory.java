package com.acme.portal;

import java.security.SecureRandom;
import java.util.Base64;

/**
 * Shared CSPRNG token factory.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class SecureTokenFactory {
    private static final SecureRandom RNG = new SecureRandom();
    public static String token() {
        byte[] b = new byte[32]; RNG.nextBytes(b);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(b);
    }
}
