package com.ywlee.scenetransition.model

data class Image(
    var url: String,
    var type: Type = Type.LOCAL
) {
    enum class Type {
        API,
        LOCAL
    }
}