package com.acme.portal

import org.springframework.web.util.HtmlUtils

/**
 * Safe twin — HTML-encodes the reflected value.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class ProfileSafeController {

    def show() {
        def nick = params.nick
        render(text: "<h1>Welcome " + HtmlUtils.htmlEscape(nick) + "</h1>", contentType: 'text/html')
    }
}
