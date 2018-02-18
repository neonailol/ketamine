package nnl.rocks.ketamine.openapi.models.media

/**
 * ArraySchema
 */

class ArraySchema(
    private val type: String = "array",
    private val items: Schema<*>? = null
) : Schema<Any>() {

}

