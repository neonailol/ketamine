package nnl.rocks.ketamine.models

import nnl.rocks.ketamine.models.callbacks.Callback
import nnl.rocks.ketamine.openapi.models.parameters.Parameter
import nnl.rocks.ketamine.openapi.models.parameters.RequestBody
import nnl.rocks.ketamine.openapi.models.responses.ApiResponses
import nnl.rocks.ketamine.openapi.models.security.SecurityRequirement
import nnl.rocks.ketamine.openapi.models.servers.Server

/**
 * Operation
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#operationObject"
 */

class Operation(
    private val tags: List<String>? = null,
    private val summary: String? = null,
    private val description: String? = null,
    private val externalDocs: ExternalDocumentation? = null,
    private val operationId: String? = null,
    private val parameters: List<Parameter>? = null,
    private val requestBody: RequestBody? = null,
    private val responses: ApiResponses? = null,
    private val callbacks: Map<String, Callback>? = null,
    private val deprecated: Boolean? = null,
    private val security: List<SecurityRequirement>? = null,
    private val servers: List<Server>? = null,
    private val extensions: Map<String, Any>? = null
) {

}

