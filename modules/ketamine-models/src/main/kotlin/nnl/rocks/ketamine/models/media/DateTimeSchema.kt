package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema
import java.time.LocalDateTime

/**
 * DateTimeSchema
 */

class DateTimeSchema(
    private val type: String = "string",
    private val format: String = "date-time"
) : Schema<LocalDateTime>() {

}

