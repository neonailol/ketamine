package nnl.rocks.ketamine.models

import nnl.rocks.ketamine.models.parameters.Parameter
import nnl.rocks.ketamine.models.servers.Server

/**
 * PathItem
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#pathItemObject"
 */

class PathItem(
    private val summary: String? = null,
    private val description: String? = null,
    private val get: Operation? = null,
    private val put: Operation? = null,
    private val post: Operation? = null,
    private val delete: Operation? = null,
    private val options: Operation? = null,
    private val head: Operation? = null,
    private val patch: Operation? = null,
    private val trace: Operation? = null,
    private val servers: List<Server>? = null,
    private val parameters: List<Parameter>? = null,
    private val `$ref`: String? = null,
    private val extensions: Map<String, Any>? = null
) {

}

