package nnl.rocks.ketamine.models.parameters

import nnl.rocks.ketamine.models.media.Content

/**
 * RequestBody
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#requestBodyObject"
 */

class RequestBody(
    private val description: String? = null,
    private val content: Content? = null,
    private val required: Boolean? = null,
    private val extensions: Map<String, Any>? = null,
    private val `$ref`: String? = null
) {

}

