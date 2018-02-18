package nnl.rocks.ketamine.openapi.models.media

/**
 * ByteArraySchema
 */

class ByteArraySchema(
    private val type: String = "string",
    private val format: String = "byte"
) : Schema<ByteArray>() {

}

