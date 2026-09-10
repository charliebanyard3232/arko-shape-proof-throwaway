package com.acme.portal


/**
 * Safe twin — pulls credentials from the environment at runtime.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class ApiKeysSafe {

    static String stripeSecret() { return System.getenv('STRIPE_SECRET') }
    static String dbPassword() { return System.getenv('DB_PASSWORD') }
}
