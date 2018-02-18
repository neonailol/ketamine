package nnl.rocks.ketamine.models.examples

/**
 * Example
 */
class Example(
    private val summary: String,
    private val description: String,
    private val value: Any? = null,
    private val externalValue: String? = null,
    private var `$ref`: String? = null, // #/components/examples/
    private var extensions: Map<String, Any> = mapOf()
) {

}

