package nnl.rocks.ketamine.models.parameters

import nnl.rocks.ketamine.models.parameters.Parameter

/**
 * PathParameter
 */

class PathParameter(private val `in`: String = "path",
                    private val required: Boolean = true
) : Parameter() {

}

