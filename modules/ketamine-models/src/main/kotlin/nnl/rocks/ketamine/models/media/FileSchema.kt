package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema

/**
 * FileSchema
 */

class FileSchema(
    private val type: String = "string",
    private val format: String = "binary"
) : Schema<String>() {

}

