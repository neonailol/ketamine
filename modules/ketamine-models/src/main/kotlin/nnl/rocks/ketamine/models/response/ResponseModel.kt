package nnl.rocks.ketamine.models.response

import nnl.rocks.ketamine.models.domain.HttpStatus
import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.types.ModelProperty

open class ResponseModel(
    private val headers: Collection<Header>,
    private val props: Collection<ModelProperty>,
    private val status: HttpStatus
) {

    constructor(vararg props: ModelProperty) : this(
        headers = emptyList(),
        props = props.toList(),
        status = HttpStatus.OK
    )

    constructor(
        status: HttpStatus,
        vararg props: ModelProperty
    ) : this(
        headers = emptyList(),
        props = props.toList(),
        status = status
    )
}

class EmptyResponse : ResponseModel(emptyList(), emptyList(), HttpStatus.OK)
