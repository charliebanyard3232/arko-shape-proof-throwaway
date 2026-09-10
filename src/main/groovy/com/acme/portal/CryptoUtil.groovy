package com.acme.portal

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

/**
 * Field encryption (vulnerable — DES in ECB mode).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class CryptoUtil {

    static byte[] encrypt(byte[] key, byte[] data) {
        def cipher = Cipher.getInstance('DES/ECB/PKCS5Padding')
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, 'DES'))
        return cipher.doFinal(data)
    }
}
