package com.acme.portal

import javax.naming.directory.DirContext
import javax.naming.directory.SearchControls

/**
 * Safe twin — RFC 4515 escaping of the filter value.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class LdapLookupSafeService {

    DirContext ctx

    static String escape(String v) {
        v.replace('\\','\\5c').replace('*','\\2a').replace('(','\\28').replace(')','\\29').replace('\0','\\00')
    }

    def findByUid(String uid) {
        def filter = "(uid=" + escape(uid) + ")"
        return ctx.search('ou=people,dc=acme,dc=com', filter, new SearchControls())
    }
}
