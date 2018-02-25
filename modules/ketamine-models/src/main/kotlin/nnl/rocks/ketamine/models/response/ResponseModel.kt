package nnl.rocks.ketamine.models.response

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.types.ValueType
import nnl.rocks.ketamine.models.validation.Validations

open class ResponseModel(
    private val headers: Collection<Header>,
    private val props: Collection<ResponseProperty>
)

class EmptyResponse : ResponseModel(emptyList(), emptyList())

class ResponseProperty(
    private val name: String,
    private val type: ValueType,
    private val summary: Summary = EmptySummary(),
    private val description: Description = EmptyDescription(),
    private val validations: Validations
)
