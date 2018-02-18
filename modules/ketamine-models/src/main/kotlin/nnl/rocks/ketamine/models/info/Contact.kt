package nnl.rocks.ketamine.models.info

/**
 * Contact
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#contactObject"
 */

class Contact(
    private val name: String? = null,
    private val url: String? = null,
    private val email: String? = null,
    private val extensions: Map<String, Any>? = null
) {

}

