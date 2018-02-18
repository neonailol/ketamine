package nnl.rocks.ketamine.models

import nnl.rocks.ketamine.models.info.Info
import nnl.rocks.ketamine.openapi.models.security.SecurityRequirement
import nnl.rocks.ketamine.openapi.models.servers.Server
import nnl.rocks.ketamine.openapi.models.tags.Tag

/**
 * OpenAPI
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md"
 */

class OpenAPI(
    private val openapi: String = "3.0.1",
    private val info: Info? = null,
    private val externalDocs: ExternalDocumentation? = null,
    private val servers: List<Server>? = null,
    private val security: List<SecurityRequirement>? = null,
    private val tags: List<Tag>? = null,
    private val paths: Paths? = null,
    private val components: Components? = null,
    private val extensions: Map<String, Any>? = null
) {

}

