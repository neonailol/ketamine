package nnl.rocks.ketamine.models.types

open class ValueType(
    private val type: String,
    private val format: String
)

class UUIDType : ValueType(type = "string", format = "uuid")
