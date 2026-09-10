package com.acme.portal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Safe twin — SHA-256 digest.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class HashServiceSafe {

    public byte[] digest(byte[] in) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(in);
    }
}
