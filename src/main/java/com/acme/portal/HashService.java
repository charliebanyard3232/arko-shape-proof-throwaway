package com.acme.portal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Password/token hashing (vulnerable — MD5 and SHA-1).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class HashService {

    public byte[] digestMd5(byte[] in) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return md.digest(in);
    }

    public byte[] digestSha1(byte[] in) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        return md.digest(in);
    }
}
