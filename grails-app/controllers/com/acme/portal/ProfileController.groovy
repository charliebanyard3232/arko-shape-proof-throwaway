package com.acme.portal


/**
 * Renders profile HTML (vulnerable — reflects raw request data).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class ProfileController {

    def show() {
        def nick = params.nick
        render(text: "<h1>Welcome " + nick + "</h1>", contentType: 'text/html')
    }
}
