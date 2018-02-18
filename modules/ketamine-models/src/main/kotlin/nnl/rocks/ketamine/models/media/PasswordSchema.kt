package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * PasswordSchema
 */

class PasswordSchema(
    private val type: String = "string",
    private val format: String = "password"
) : Schema<String>() {

}

