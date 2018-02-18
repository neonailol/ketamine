package nnl.rocks.ketamine.models.responses

import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.links.Link
import nnl.rocks.ketamine.models.media.Content

/**
 * ApiResponse
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#responseObject"
 */

class ApiResponse(
    private val description: String? = null,
    private val headers: Map<String, Header>? = null,
    private val content: Content? = null,
    private val links: Map<String, Link>? = null,
    private val extensions: Map<String, Any>? = null,
    private val `$ref`: String? = null
) {

}

