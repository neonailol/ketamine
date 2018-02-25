package nnl.rocks.ketamine.models.types

open class ValueType(
    private val type: String,
    private val format: String
)

class ObjectType(
    private val props: Collection<ValueType>
) : ValueType(type = "object", format = "model")

class StringType : ValueType(type = "string", format = "plain")

class UUIDType : ValueType(type = "string", format = "uuid")
