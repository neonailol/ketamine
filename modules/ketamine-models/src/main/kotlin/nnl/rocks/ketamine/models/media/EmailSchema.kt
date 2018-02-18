package nnl.rocks.ketamine.openapi.models.media

/**
 * EmailSchema
 */

class EmailSchema(
    private val type: String = "string",
    private val format: String = "email"
) : Schema<String>() {

}

