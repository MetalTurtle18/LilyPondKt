package com.dekolis.lilypondkt

class HeaderContext {
    var title = ""
    var composer = ""

    fun title(title: String) {
        this.title = title
    }

    fun composer(composer: String) {
        this.composer = composer
    }
}

class Header(val context: HeaderContext)