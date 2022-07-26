package com.dekolis.lilypondkt

class LilyPondContext {
    val version = "2.20.0" // TODO: maybe store this somewhere else
    var header: Header = Header(HeaderContext())
    val scores = mutableListOf<Score>()

    fun header(block: HeaderContext.() -> Unit) {
        header = Header(HeaderContext().apply(block))
    }

    fun score(block: ScoreContext.() -> Unit) {
        scores += Score(ScoreContext().apply(block))
    }
}

class LilyPond(val context: LilyPondContext)

fun LilyPond(block: LilyPondContext.() -> Unit): LilyPond =
    LilyPond(LilyPondContext().apply(block))
