package nnl.rocks.ketamine.models.media

/**
 * XML
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#xmlObject"
 */

class XML(
    private val name: String? = null,
    private val namespace: String? = null,
    private val prefix: String? = null,
    private val attribute: Boolean? = null,
    private val wrapped: Boolean? = null,
    private val extensions: Map<String, Any>? = null
) {

}

