package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * BinarySchema
 */

class BinarySchema(
    private val type: String = "string",
    private val format: String = "binary"
) : Schema<ByteArray>() {

}

