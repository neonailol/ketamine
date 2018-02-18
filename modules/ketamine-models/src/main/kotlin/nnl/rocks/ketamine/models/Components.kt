package nnl.rocks.ketamine.models

import nnl.rocks.ketamine.models.callbacks.Callback
import nnl.rocks.ketamine.models.examples.Example
import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.links.Link
import nnl.rocks.ketamine.models.media.Schema
import nnl.rocks.ketamine.models.parameters.Parameter
import nnl.rocks.ketamine.models.parameters.RequestBody
import nnl.rocks.ketamine.models.responses.ApiResponse
import nnl.rocks.ketamine.models.security.SecurityScheme

/**
 * Components
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#componentsObject"
 */

class Components(
    private val schemas: Map<String, Schema<*>>? = null,
    private val responses: Map<String, ApiResponse>? = null,
    private val parameters: Map<String, Parameter>? = null,
    private val examples: Map<String, Example>? = null,
    private val requestBodies: Map<String, RequestBody>? = null,
    private val headers: Map<String, Header>? = null,
    private val securitySchemes: Map<String, SecurityScheme>? = null,
    private val links: Map<String, Link>? = null,
    private val callbacks: Map<String, Callback>? = null,
    private val extensions: Map<String, Any>? = null
) {

}

