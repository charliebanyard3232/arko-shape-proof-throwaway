package com.acme.portal;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.GCMParameterSpec;
import java.security.GeneralSecurityException;

/**
 * Safe replacement for the legacy Blowfish path — AES-256/GCM.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class BlowfishSafeCipher {
    public Cipher enc(byte[] key, byte[] iv) throws GeneralSecurityException {
        Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new GCMParameterSpec(128, iv));
        return c;
    }
}
