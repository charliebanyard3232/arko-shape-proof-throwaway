package com.acme.portal


/**
 * Stashes request-supplied values into the HttpSession (vulnerable).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class SessionStoreController {

    def remember() {
        def role = params.role
        session.setAttribute('role', role)
        render 'ok'
    }
}
