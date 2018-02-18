package nnl.rocks.ketamine.openapi.models.media

/**
 * BinarySchema
 */

class BinarySchema(
    private val type: String = "string",
    private val format: String = "binary"
) : Schema<ByteArray>() {

}

