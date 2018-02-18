package nnl.rocks.ketamine.models.media

import nnl.rocks.ketamine.models.media.Schema
import java.time.LocalDate

/**
 * DateSchema
 */

class DateSchema(
    private val type: String = "string",
    private val format: String = "date"
) : Schema<LocalDate>() {

}

