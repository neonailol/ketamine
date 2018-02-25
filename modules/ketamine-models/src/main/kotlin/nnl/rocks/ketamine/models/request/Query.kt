package nnl.rocks.ketamine.models.request

import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.types.ValueType

class QueryParam(
    private val name: String,
    private val type: ValueType,
    private val summary: Summary = EmptySummary(),
    private val description: EmptyDescription = EmptyDescription()
)

open class QueryParams(
    private val params: Collection<QueryParam>
) : Collection<QueryParam> by params

class EmptyQueryParams : QueryParams(emptyList())
