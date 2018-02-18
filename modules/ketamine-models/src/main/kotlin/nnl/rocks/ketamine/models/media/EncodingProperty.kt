package nnl.rocks.ketamine.openapi.models.media

import nnl.rocks.ketamine.models.headers.Header

/**
 * EncodingProperty
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#encodingPropertyObject"
 */

class EncodingProperty(
    private val contentType: String? = null,
    private val headers: Map<String, Header>? = null,
    private val style: StyleEnum? = null,
    private val explode: Boolean? = null,
    private val allowReserved: Boolean? = null,
    private val extensions: Map<String, Any>? = null
) {

    enum class StyleEnum(private val value: String) {
        FORM("form"),
        SPACE_DELIMITED("spaceDelimited"),
        PIPE_DELIMITED("pipeDelimited"),
        DEEP_OBJECT("deepObject");

        override fun toString(): String = value
    }

}
