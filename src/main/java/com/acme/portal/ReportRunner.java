package com.acme.portal;

import java.io.IOException;

/**
 * Runs a report binary (vulnerable — Runtime.exec with a shell string).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class ReportRunner {

    public Process run(String userArg) throws IOException {
        return Runtime.getRuntime().exec("/bin/sh -c 'render --set " + userArg + "'");
    }
}
