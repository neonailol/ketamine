package nnl.rocks.ketamine.models.response

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.types.ValueType
import nnl.rocks.ketamine.models.validation.Validations

class ResponseModel(
    private val props: List<ResponseProperty>

)

class ResponseProperty(
    private val name: String,
    private val type: ValueType,
    private val summary: Summary = EmptySummary(),
    private val description: Description = EmptyDescription(),
    private val validations: Validations
)
