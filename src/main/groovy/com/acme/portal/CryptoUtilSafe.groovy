package com.acme.portal

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import javax.crypto.spec.GCMParameterSpec

/**
 * Safe twin — AES-256/GCM authenticated encryption.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class CryptoUtilSafe {

    static byte[] encrypt(byte[] key, byte[] iv, byte[] data) {
        def cipher = Cipher.getInstance('AES/GCM/NoPadding')
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, 'AES'), new GCMParameterSpec(128, iv))
        return cipher.doFinal(data)
    }
}
