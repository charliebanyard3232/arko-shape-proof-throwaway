package com.acme.portal;

import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.NamingException;
import javax.naming.NamingEnumeration;
import javax.naming.directory.SearchResult;

/**
 * Safe twin — parameterised search with escaped filter arguments.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class DirectorySearchSafe {

    private final DirContext ctx;
    public DirectorySearchSafe(DirContext ctx) { this.ctx = ctx; }

    public NamingEnumeration<SearchResult> byMail(String mail) throws NamingException {
        return ctx.search("ou=people,dc=acme,dc=com", "(mail={0})", new Object[]{ mail }, new SearchControls());
    }
}
