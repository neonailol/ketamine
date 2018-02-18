package nnl.rocks.ketamine.models

/**
 * ExternalDocumentation
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#externalDocumentationObject"
 */

class ExternalDocumentation(
    private val description: String? = null,
    private val url: String? = null,
    private val extensions: Map<String, Any>? = null
) {

}

