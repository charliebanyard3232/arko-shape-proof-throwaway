package com.acme.portal;


/**
 * Shared RFC-4515 filter escaper.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class LdapEncoder {
    public static String escape(String v) {
        if (v == null) return "";
        return v.replace("\\", "\\5c").replace("*", "\\2a")
                .replace("(", "\\28").replace(")", "\\29");
    }
}
