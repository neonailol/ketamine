package nnl.rocks.ketamine.models.security

/**
 * OAuthFlow
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#oauthFlowsObject"
 */

class OAuthFlow(
    private val authorizationUrl: String? = null,
    private val tokenUrl: String? = null,
    private val refreshUrl: String? = null,
    private val scopes: Scopes? = null,
    private val extensions: Map<String, Any>? = null
) {

}

