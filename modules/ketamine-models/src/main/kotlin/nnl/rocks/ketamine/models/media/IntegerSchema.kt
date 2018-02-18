package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * IntegerSchema
 */

class IntegerSchema(
    private val type: String = "integer",
    private val format: String = "int32"
) : Schema<Number>() {

}

