package nnl.rocks.ketamine.openapi.models.parameters

import nnl.rocks.ketamine.models.examples.Example
import nnl.rocks.ketamine.openapi.models.media.Content
import nnl.rocks.ketamine.openapi.models.media.Schema

/**
 * Parameter
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#parameterObject"
 */

open class Parameter(
    private val name: String? = null,
    private val `in`: String? = null,
    private val description: String? = null,
    private val required: Boolean? = null,
    private val deprecated: Boolean? = null,
    private val allowEmptyValue: Boolean? = null,
    private val `$ref`: String? = null,
    private val style: StyleEnum? = null,
    private val explode: Boolean? = null,
    private val allowReserved: Boolean? = null,
    private val schema: Schema<*>? = null,
    private val examples: Map<String, Example>? = null,
    private val example: Any? = null,
    private val content: Content? = null,
    private val extensions: Map<String, Any>? = null
) {


    /**
     * Gets or Sets style
     */
    enum class StyleEnum(private val value: String) {

        MATRIX("matrix"),
        LABEL("label"),
        FORM("form"),
        SIMPLE("simple"),
        SPACEDELIMITED("spaceDelimited"),
        PIPEDELIMITED("pipeDelimited"),
        DEEPOBJECT("deepObject");

        override fun toString(): String = value
    }

}

