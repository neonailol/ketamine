package nnl.rocks.ketamine.models.types

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.validation.Validation
import nnl.rocks.ketamine.models.validation.Validations

class ModelProperty(
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
