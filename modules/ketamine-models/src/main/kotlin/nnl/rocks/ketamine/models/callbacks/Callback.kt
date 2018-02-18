package nnl.rocks.ketamine.models.callbacks

import nnl.rocks.ketamine.models.PathItem

/**
 * Callback
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#callbackObject"
 */
class Callback(
    private val items: Map<String, PathItem>,
    private val extensions: Map<String, Any>
) {

    constructor(items: Map<String, PathItem>) : this(items, mapOf())

}
