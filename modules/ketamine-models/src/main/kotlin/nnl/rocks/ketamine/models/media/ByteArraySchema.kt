package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * ByteArraySchema
 */

class ByteArraySchema(
    private val type: String = "string",
    private val format: String = "byte"
) : Schema<ByteArray>() {

}

