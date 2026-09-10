package com.acme.portal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * Safe twin — validates the header shape before storing.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class PreferencesSafeController {

    private static final Pattern TENANT = Pattern.compile("^[a-z0-9-]{2,32}$");

    public void save(HttpServletRequest req) {
        HttpSession s = req.getSession();
        String tenant = req.getHeader("X-Tenant");
        if (tenant == null || !TENANT.matcher(tenant).matches()) { return; }
        s.setAttribute("tenant", tenant);
    }
}
