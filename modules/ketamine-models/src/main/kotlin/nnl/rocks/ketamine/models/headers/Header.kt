package nnl.rocks.ketamine.models.headers

import nnl.rocks.ketamine.models.examples.Example
import nnl.rocks.ketamine.models.media.Content
import nnl.rocks.ketamine.models.media.Schema

/**
 * Header
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#headerObject"
 */

class Header(
    private val description: String? = null,
    private val `$ref`: String? = null, // #/components/headers/
    private val required: Boolean? = null,
    private val deprecated: Boolean? = null,
    private val allowEmptyValue: Boolean? = null,
    private val style: StyleEnum? = null,
    private val explode: Boolean? = null,
    private val schema: Schema<*>? = null,
    private val examples: Map<String, Example>? = null,
    private val example: Any? = null,
    private val content: Content? = null,
    private val extensions: Map<String, Any>? = null
) {

    enum class StyleEnum(private val value: String) {
        SIMPLE("simple");

        override fun toString(): String = value
    }

}

