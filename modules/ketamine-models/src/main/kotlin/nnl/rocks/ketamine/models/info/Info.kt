package nnl.rocks.ketamine.models.info

/**
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#infoObject"
 */

class Info(
    private val title: String? = null,
    private val description: String? = null,
    private val termsOfService: String? = null,
    private val contact: Contact? = null,
    private val license: License? = null,
    private val version: String? = null,
    private val extensions: MutableMap<String, Any>? = null
) {

}

