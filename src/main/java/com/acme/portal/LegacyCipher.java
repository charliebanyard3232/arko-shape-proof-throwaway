package com.acme.portal;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;

/**
 * Legacy ciphers (vulnerable — Blowfish and DESede/3DES).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class LegacyCipher {

    public Cipher blowfish(byte[] key) throws GeneralSecurityException {
        Cipher c = Cipher.getInstance("Blowfish");
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "Blowfish"));
        return c;
    }

    public Cipher tripleDes(byte[] key) throws GeneralSecurityException {
        Cipher c = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "DESede"));
        return c;
    }
}
