package nnl.rocks.ketamine.openapi.models.media

import java.math.BigDecimal

/**
 * NumberSchema
 */

class NumberSchema(private val type: String = "number") : Schema<BigDecimal>() {

}

