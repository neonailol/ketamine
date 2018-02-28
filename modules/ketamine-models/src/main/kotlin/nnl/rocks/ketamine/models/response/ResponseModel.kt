package nnl.rocks.ketamine.models.response

import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.types.ModelProperty

open class ResponseModel(
    private val headers: Collection<Header>,
    private val props: Collection<ModelProperty>
) {

    constructor(vararg props: ModelProperty) : this(
        headers = emptyList(),
        props = props.toList()
    )
}

class EmptyResponse : ResponseModel(emptyList(), emptyList())
