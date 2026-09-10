package com.acme.portal;


/**
 * Uses SecureTokenFactory.token (another file) instead of java.util.Random.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class HelperTokenController {
    public String issue() {
        return SecureTokenFactory.token();
    }
}
