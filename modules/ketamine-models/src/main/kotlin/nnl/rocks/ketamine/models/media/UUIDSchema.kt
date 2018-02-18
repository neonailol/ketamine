package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema
import java.util.UUID

/**
 * UUIDSchema
 */

class UUIDSchema(
    private val type: String = "string",
    private val format: String = "uuid"
) : Schema<UUID>() {

}

