package nnl.rocks.ketamine.models.tags

import nnl.rocks.ketamine.models.ExternalDocumentation

/**
 * Tag
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#tagObject"
 */

class Tag(
    private val name: String? = null,
    private val description: String? = null,
    private val externalDocs: ExternalDocumentation? = null,
    private val extensions: Map<String, Any>? = null
) {

}

class Tags : ArrayList<Tag>()
