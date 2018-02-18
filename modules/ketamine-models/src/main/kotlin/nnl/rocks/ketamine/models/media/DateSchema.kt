package nnl.rocks.ketamine.openapi.models.media

import java.time.LocalDate
import java.util.Date

/**
 * DateSchema
 */

class DateSchema(
    private val type: String = "string",
    private val format: String = "date"
) : Schema<LocalDate>() {

}

