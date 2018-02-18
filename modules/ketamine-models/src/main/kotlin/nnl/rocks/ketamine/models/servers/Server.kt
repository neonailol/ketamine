package nnl.rocks.ketamine.openapi.models.servers

/**
 * Server
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#serverObject"
 */

class Server(
    private val url: String? = null,
    private val description: String? = null,
    private val variables: ServerVariables? = null,
    private val extensions: Map<String, Any>? = null
) {

}

