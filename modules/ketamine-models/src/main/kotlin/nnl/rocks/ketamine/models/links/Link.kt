package nnl.rocks.ketamine.models.links

import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.parameters.RequestBody
import nnl.rocks.ketamine.models.servers.Server

/**
 * Link
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#linkObject"
 */

class Link(
    private val operationRef: String? = null,
    private val operationId: String? = null,
    private val parameters: Map<String, String>? = null,
    private val requestBody: RequestBody? = null,
    private val headers: Map<String, Header>? = null,
    private val description: String? = null,
    private val `$ref`: String? = null,
    private val extensions: Map<String, Any>? = null,
    private val server: Server? = null
) {

}

