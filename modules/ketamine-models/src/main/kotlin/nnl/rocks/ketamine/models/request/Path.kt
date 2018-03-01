package nnl.rocks.ketamine.models.request

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.types.ValueType

open class Path(
    private val value: String,
    private val params: PathParams = EmptyPathParams()
)

open class PathParams(
    private val params: Collection<PathParam>
) : Collection<PathParam> by params {

    constructor(vararg params: PathParam) : this(params.toList())
}

class EmptyPathParams : PathParams(emptyList())

class PathParam(
    private val name: String,
    private val type: ValueType,
    private val summary: Summary = EmptySummary(),
    private val description: Description = EmptyDescription()
)
