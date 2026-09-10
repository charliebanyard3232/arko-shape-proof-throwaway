package com.acme.portal;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Safe twin — ProcessBuilder argv plus input validation.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class ReportRunnerSafe {

    private static final Pattern SAFE = Pattern.compile("^[A-Za-z0-9_-]{1,40}$");

    public Process run(String userArg) throws IOException {
        if (!SAFE.matcher(userArg).matches()) { throw new IllegalArgumentException("bad arg"); }
        return new ProcessBuilder("render", "--set", userArg).start();
    }
}
