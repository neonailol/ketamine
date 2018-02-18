package nnl.rocks.ketamine.openapi.models.media

import nnl.rocks.ketamine.models.ExternalDocumentation
import java.math.BigDecimal

/**
 * Schema
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#schemaObject"
 */

open class Schema<T>(
    protected var _default: T? = null,
    private val name: String? = null,
    private val title: String? = null,
    private val multipleOf: BigDecimal? = null,
    private val maximum: BigDecimal? = null,
    private val exclusiveMaximum: Boolean? = null,
    private val minimum: BigDecimal? = null,
    private val exclusiveMinimum: Boolean? = null,
    private val maxLength: Int? = null,
    private val minLength: Int? = null,
    private val pattern: String? = null,
    private val maxItems: Int? = null,
    private val minItems: Int? = null,
    private val uniqueItems: Boolean? = null,
    private val maxProperties: Int? = null,
    private val minProperties: Int? = null,
    private val required: List<String>? = null,
    private val type: String? = null,
    private val not: Schema<*>? = null,
    private val properties: Map<String, Schema<*>>? = null,
    private val additionalProperties: Any? = null,
    private val description: String? = null,
    private val format: String? = null,
    private val `$ref`: String? = null,
    private val nullable: Boolean? = null,
    private val readOnly: Boolean? = null,
    private val writeOnly: Boolean? = null,
    protected var example: T? = null,
    private val externalDocs: ExternalDocumentation? = null,
    private val deprecated: Boolean? = null,
    private val xml: XML? = null,
    private val extensions: Map<String, Any>? = null,
    protected var _enum: List<T>? = null,
    private val discriminator: Discriminator? = null
) {

}

