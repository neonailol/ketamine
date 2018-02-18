package nnl.rocks.ketamine.models.media

import java.math.BigDecimal

/**
 * NumberSchema
 */

class NumberSchema(private val type: String = "number") : Schema<BigDecimal>() {

}

