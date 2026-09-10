package com.acme.portal;

import org.apache.commons.text.StringEscapeUtils;

/**
 * Safe twin — encodes body with commons-text HTML4 escaper.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class CommentRendererSafe {

    public String render(String body) {
        return "<div class='comment'>" + StringEscapeUtils.escapeHtml4(body) + "</div>";
    }
}
