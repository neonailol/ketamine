package nnl.rocks.ketamine.models.response

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.types.ValueType
import nnl.rocks.ketamine.models.validation.Validation
import nnl.rocks.ketamine.models.validation.Validations

open class ResponseModel(
    private val headers: Collection<Header>,
    private val props: Collection<ResponseProperty>
) {

    constructor(vararg props: ResponseProperty) : this(
        headers = emptyList(),
        props = props.toList()
    )
}

class EmptyResponse : ResponseModel(emptyList(), emptyList())

class ResponseProperty(
    private val name: String,
    private val type: ValueType,
    private val summary: Summary = EmptySummary(),
    private val description: Description = EmptyDescription(),
    private val validations: Validations
) {

    constructor(
        name: String,
        type: ValueType,
        vararg validations: Validation
    ) : this(
        name = name,
        type = type,
        summary = EmptySummary(),
        description = EmptyDescription(),
        validations = Validations(validations.toList())
    )
}
