package nnl.rocks.ketamine.models.request

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.types.ValueType
import nnl.rocks.ketamine.models.validation.Validations

open class RequestModel(
    private val headers: Collection<Header>,
    private val props: List<RequestProperty>
)

class EmptyRequest : RequestModel(emptyList(), emptyList())

class RequestProperty(
    private val name: String,
    private val type: ValueType,
    private val summary: Summary = EmptySummary(),
    private val description: Description = EmptyDescription(),
    private val validations: Validations
)
