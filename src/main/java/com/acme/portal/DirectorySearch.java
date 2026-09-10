package com.acme.portal;

import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.NamingException;
import javax.naming.NamingEnumeration;
import javax.naming.directory.SearchResult;

/**
 * Directory search (vulnerable — concatenated filter).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class DirectorySearch {

    private final DirContext ctx;
    public DirectorySearch(DirContext ctx) { this.ctx = ctx; }

    public NamingEnumeration<SearchResult> byMail(String mail) throws NamingException {
        String filter = "(mail=" + mail + ")";
        return ctx.search("ou=people,dc=acme,dc=com", filter, new SearchControls());
    }
}
