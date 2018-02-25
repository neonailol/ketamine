package nnl.rocks.ketamine.models.operations

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.HttpMethod
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.request.EmptyQueryParams
import nnl.rocks.ketamine.models.request.Path
import nnl.rocks.ketamine.models.request.QueryParams
import nnl.rocks.ketamine.models.request.RequestModel

/**
 * Represents an atomic rest request
 */
class Operation(
    private val name: String,
    private val summary: Summary = EmptySummary(),
    private val description: Description = EmptyDescription(),
    private val method: HttpMethod,
    private val path: Path,
    private val query: QueryParams = EmptyQueryParams(),
    private val request: RequestModel
)
