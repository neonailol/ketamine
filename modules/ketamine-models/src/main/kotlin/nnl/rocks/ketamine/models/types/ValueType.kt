package nnl.rocks.ketamine.models.types

import nnl.rocks.ketamine.models.response.ResponseProperty

open class ValueType(
    private val type: String,
    private val format: String
)

class ObjectType(
    private val props: Collection<ResponseProperty>
) : ValueType(type = "object", format = "model") {

    constructor(vararg props: ResponseProperty) : this(
        props.toList()
    )
}

class StringType : ValueType(type = "string", format = "plain")

class UUIDType : ValueType(type = "string", format = "uuid")

class CollectionType(
    private val element: ValueType
) : ValueType(type = "collection", format = "array")
