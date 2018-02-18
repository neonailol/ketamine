package nnl.rocks.ketamine.openapi.models.media

import java.time.LocalDateTime

/**
 * DateTimeSchema
 */

class DateTimeSchema(
    private val type: String = "string",
    private val format: String = "date-time"
) : Schema<LocalDateTime>() {

}

