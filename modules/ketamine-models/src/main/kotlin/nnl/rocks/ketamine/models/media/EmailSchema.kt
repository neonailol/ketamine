package nnl.rocks.ketamine.models.media

/**
 * EmailSchema
 */

class EmailSchema(
    private val type: String = "string",
    private val format: String = "email"
) : Schema<String>() {

}

