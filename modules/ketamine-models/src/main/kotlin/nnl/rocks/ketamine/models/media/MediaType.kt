package nnl.rocks.ketamine.openapi.models.media

import nnl.rocks.ketamine.models.examples.Example

/**
 * MediaType
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#mediaTypeObject"
 */

class MediaType(
    private val schema: Schema<*>? = null,
    private val examples: Map<String, Example>? = null,
    private val example: Any? = null,
    private val encoding: Map<String, Encoding>? = null,
    private val extensions: Map<String, Any>? = null
) {

}

