package nnl.rocks.ketamine.openapi.models.parameters

/**
 * PathParameter
 */

class PathParameter(private val `in`: String = "path",
                    private val required: Boolean = true
) : Parameter() {

}

