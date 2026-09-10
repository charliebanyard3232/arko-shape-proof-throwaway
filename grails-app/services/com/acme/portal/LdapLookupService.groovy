package com.acme.portal

import javax.naming.directory.DirContext
import javax.naming.directory.SearchControls

/**
 * Directory lookup (vulnerable — filter built by concatenation).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class LdapLookupService {

    DirContext ctx

    def findByUid(String uid) {
        def filter = "(uid=" + uid + ")"
        def controls = new SearchControls()
        return ctx.search('ou=people,dc=acme,dc=com', filter, controls)
    }
}
