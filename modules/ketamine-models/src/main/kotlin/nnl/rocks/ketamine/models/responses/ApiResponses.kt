package nnl.rocks.ketamine.openapi.models.responses

import java.util.LinkedHashMap

/**
 * ApiResponses
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#responsesObject"
 */

class ApiResponses(private val extensions: Map<String, Any>? = null) : LinkedHashMap<String, ApiResponse>() {

}

