package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * ArraySchema
 */

class ArraySchema(
    private val type: String = "array",
    private val items: Schema<*>? = null
) : Schema<Any>() {

}

