package nnl.rocks.ketamine.openapi.models.media

/**
 * PasswordSchema
 */

class PasswordSchema(
    private val type: String = "string",
    private val format: String = "password"
) : Schema<String>() {

}

