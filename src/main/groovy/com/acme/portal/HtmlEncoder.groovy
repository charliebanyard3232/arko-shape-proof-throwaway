package com.acme.portal

import org.springframework.web.util.HtmlUtils

/**
 * Shared HTML output encoder.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class HtmlEncoder {
    static String enc(String v) { return HtmlUtils.htmlEscape(v ?: '') }
}
