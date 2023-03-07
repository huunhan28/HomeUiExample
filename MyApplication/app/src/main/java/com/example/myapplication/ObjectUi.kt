package com.example.myapplication

data class ObjectUi (
    var id: String? = null,
    var type: String? = null,
    var attributes: Attributes? = null,
    var items: List<ObjectUi>? = null
)

data class Attributes (
    var color: String? = null,
    var text: String? = null
)

enum class TypeItemObjectHome(val value: String) {
    Modem("Modem")
}