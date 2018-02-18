package nnl.rocks.ketamine.openapi.models.media

/**
 * IntegerSchema
 */

class IntegerSchema(
    private val type: String = "integer",
    private val format: String = "int32"
) : Schema<Number>() {

}

