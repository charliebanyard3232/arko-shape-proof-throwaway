package com.acme.portal


/**
 * Shared input sanitisation helpers.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class InputSanitizer {
    /** Strips everything but a safe identifier charset. */
    static String cleanId(String v) { return v == null ? '' : v.replaceAll(/[^A-Za-z0-9_]/, '') }
}
