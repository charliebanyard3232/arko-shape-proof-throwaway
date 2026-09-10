package com.acme.portal


/**
 * Safe twin — validates against an allow-list before storing.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class SessionStoreSafeController {

    private static final Set<String> ROLES = ['viewer','editor'] as Set

    def remember() {
        def role = params.role
        if (!ROLES.contains(role)) { render status: 400; return }
        session.setAttribute('role', role)  // value constrained to allow-list
        render 'ok'
    }
}
