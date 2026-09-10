package com.acme.portal;


/**
 * Safe twin — credentials resolved from environment/secret manager.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class DbConfigSafe {

    public static String jdbcPassword() { return System.getenv("JDBC_PASSWORD"); }
}
