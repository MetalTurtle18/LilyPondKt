package com.dekolis.lilypondkt

class ScoreContext {
    var header: Header = Header(HeaderContext())

    fun header(block: HeaderContext.() -> Unit) {
        header = Header(HeaderContext().apply(block))
    }
}

class Score(context: ScoreContext) {

}