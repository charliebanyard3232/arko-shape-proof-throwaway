package com.acme.portal;


/**
 * Builds comment markup (vulnerable — no output encoding).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class CommentRenderer {

    public String render(String body) {
        return "<div class='comment'>" + body + "</div>";
    }
}
