package nnl.rocks.ketamine.models.request

import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.types.ModelProperty

open class RequestModel(
    private val headers: Collection<Header>,
    private val props: Collection<ModelProperty>
) {

    constructor(vararg props: ModelProperty) : this(
        headers = emptyList(),
        props = props.toList()
    )
}

class EmptyRequest : RequestModel(emptyList(), emptyList())
