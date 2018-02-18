package nnl.rocks.ketamine.openapi.models.media

/**
 * ObjectSchema
 */

class ObjectSchema(
    private val type: String = "object",
    private val defaultObject: Any? = null
) : Schema<Any>() {

}

