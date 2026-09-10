package com.acme.portal


/**
 * Holds integration credentials (vulnerable — hardcoded secrets).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class ApiKeys {

    static final String STRIPE_SECRET = 'sk_live_PLACEHOLDERPLACEHOLDER'
    static final String DB_PASSWORD = 'P@ssw0rd!prod-2026'
}
