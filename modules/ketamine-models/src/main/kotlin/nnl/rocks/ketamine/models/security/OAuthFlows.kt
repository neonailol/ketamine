package nnl.rocks.ketamine.openapi.models.security

/**
 * OAuthFlows
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#oauthFlowsObject"
 */

class OAuthFlows(
    private val implicit: OAuthFlow? = null,
    private val password: OAuthFlow? = null,
    private val clientCredentials: OAuthFlow? = null,
    private val authorizationCode: OAuthFlow? = null,
    private val extensions: Map<String, Any>? = null
) {

}

