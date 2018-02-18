package nnl.rocks.ketamine.models.security

/**
 * SecurityScheme
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#securitySchemeObject"
 */

class SecurityScheme(
    private val type: Type? = null,
    private val description: String? = null,
    private val name: String? = null,
    private val `$ref`: String? = null,
    private val `in`: In? = null,
    private val scheme: String? = null,
    private val bearerFormat: String? = null,
    private val flows: OAuthFlows? = null,
    private val openIdConnectUrl: String? = null,
    private val extensions: Map<String, Any>? = null
) {


    enum class Type(private val value: String) {

        API_KEY("apiKey"),
        HTTP("http"),
        OAUTH2("oauth2"),
        OPENID_CONNECT("openIdConnect");

        override fun toString(): String = value
    }

    enum class In(private val value: String) {
        COOKIE("cookie"),
        HEADER("header"),
        QUERY("query");

        override fun toString(): String = value
    }

}

