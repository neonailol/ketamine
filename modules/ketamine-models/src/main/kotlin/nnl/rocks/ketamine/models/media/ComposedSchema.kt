package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * ComposedSchema
 */

class ComposedSchema(
    private val allOf: List<Schema<*>>? = null,
    private val anyOf: List<Schema<*>>? = null,
    private val oneOf: List<Schema<*>>? = null
) : Schema<Any>() {

}

