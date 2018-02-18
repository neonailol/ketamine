package nnl.rocks.ketamine.openapi.models.media

/**
 * FileSchema
 */

class FileSchema(
    private val type: String = "string",
    private val format: String = "binary"
) : Schema<String>() {

}

