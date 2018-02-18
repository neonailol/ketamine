package nnl.rocks.ketamine.openapi.models.media

/**
 * ComposedSchema
 */

class ComposedSchema(
    private val allOf: List<Schema<*>>? = null,
    private val anyOf: List<Schema<*>>? = null,
    private val oneOf: List<Schema<*>>? = null
) : Schema<Any>() {

}

