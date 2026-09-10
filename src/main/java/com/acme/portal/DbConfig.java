package com.acme.portal;


/**
 * JDBC configuration (vulnerable — embedded password and AWS key).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class DbConfig {

    public static final String JDBC_PASSWORD = "Sup3rS3cret-DbPass-2026";
    public static final String AWS_SECRET_ACCESS_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
}
