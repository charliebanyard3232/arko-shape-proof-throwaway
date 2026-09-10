package com.acme.portal


/**
 * Shared command allow-list helper.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class CommandAllowList {
    private static final Set<String> OK = ['daily','weekly','monthly'] as Set
    static boolean valid(String v) { return OK.contains(v) }
}
