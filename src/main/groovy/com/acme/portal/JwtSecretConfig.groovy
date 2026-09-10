package com.acme.portal


/**
 * JWT signing configuration — a hardcoded signing key and its env-sourced twin.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class JwtSecretConfig {
    static final String HMAC_SIGNING_KEY = 'a3f1c9e7b5d2486093aa7c1e4f6b8d02f17e9c3a5b7d9f11'
    static String signingKey() { return System.getenv('JWT_HMAC_KEY') }
}
