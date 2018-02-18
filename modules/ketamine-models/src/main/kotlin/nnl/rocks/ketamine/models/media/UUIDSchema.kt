package nnl.rocks.ketamine.openapi.models.media

import java.util.UUID

/**
 * UUIDSchema
 */

class UUIDSchema(
    private val type: String = "string",
    private val format: String = "uuid"
) : Schema<UUID>() {

}

