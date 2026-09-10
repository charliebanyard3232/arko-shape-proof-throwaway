package com.acme.portal;

import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.NamingException;
import javax.naming.NamingEnumeration;
import javax.naming.directory.SearchResult;

/**
 * Uses LdapEncoder.escape (another file) before building the filter.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class HelperDirectorySearch {
    private final DirContext ctx;
    public HelperDirectorySearch(DirContext ctx) { this.ctx = ctx; }
    public NamingEnumeration<SearchResult> byUid(String uid) throws NamingException {
        String filter = "(uid=" + LdapEncoder.escape(uid) + ")";
        return ctx.search("ou=people,dc=acme,dc=com", filter, new SearchControls());
    }
}
