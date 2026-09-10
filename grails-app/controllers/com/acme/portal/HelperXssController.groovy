package com.acme.portal


/**
 * Uses HtmlEncoder.enc (another file) before rendering.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class HelperXssController {
    def show() {
        def nick = params.nick
        render(text: "<h1>" + HtmlEncoder.enc(nick) + "</h1>", contentType: 'text/html')
    }
}
