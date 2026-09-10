package com.acme.portal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Stores preferences in session (vulnerable — raw request header to session).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class PreferencesController {

    public void save(HttpServletRequest req) {
        HttpSession s = req.getSession();
        String tenant = req.getHeader("X-Tenant");
        s.setAttribute("tenant", tenant);
    }
}
