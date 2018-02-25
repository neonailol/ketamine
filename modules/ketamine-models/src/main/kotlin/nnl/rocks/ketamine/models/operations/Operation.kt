package nnl.rocks.ketamine.models.operations

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.EmptyDescription
import nnl.rocks.ketamine.models.domain.EmptySummary
import nnl.rocks.ketamine.models.domain.HttpMethod
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.request.EmptyQueryParams
import nnl.rocks.ketamine.models.request.EmptyRequest
import nnl.rocks.ketamine.models.request.Path
import nnl.rocks.ketamine.models.request.QueryParams
import nnl.rocks.ketamine.models.request.RequestModel
import nnl.rocks.ketamine.models.response.EmptyResponse
import nnl.rocks.ketamine.models.response.ResponseModel

/**
 * Represents an atomic rest request
 */
sealed class Operation(
    private val name: String,
    private val summary: Summary,
    private val description: Description,
    private val method: HttpMethod,
    private val path: Path,
    private val query: QueryParams,
    private val request: RequestModel,
    private val response: ResponseModel
)

class GetOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path,
    query: QueryParams = EmptyQueryParams(),
    response: ResponseModel = EmptyResponse()
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.GET,
    path = path,
    query = query,
    request = EmptyRequest(),
    response = response
)

class PostOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path,
    request: RequestModel,
    response: ResponseModel
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.POST,
    path = path,
    query = EmptyQueryParams(),
    request = request,
    response = response
)

class PutOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path,
    request: RequestModel
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.PUT,
    path = path,
    query = EmptyQueryParams(),
    request = request,
    response = EmptyResponse()
)

class PathOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path,
    request: RequestModel
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.PATH,
    path = path,
    query = EmptyQueryParams(),
    request = request,
    response = EmptyResponse()
)

class DeleteOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.PATH,
    path = path,
    query = EmptyQueryParams(),
    request = EmptyRequest(),
    response = EmptyResponse()
)

class OptionsOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path,
    query: QueryParams = EmptyQueryParams(),
    response: ResponseModel = EmptyResponse()
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.OPTIONS,
    path = path,
    query = query,
    request = EmptyRequest(),
    response = response
)

class HeadOperation(
    name: String,
    summary: Summary = EmptySummary(),
    description: Description = EmptyDescription(),
    path: Path,
    query: QueryParams = EmptyQueryParams(),
    response: ResponseModel = EmptyResponse()
) : Operation(
    name = name,
    summary = summary,
    description = description,
    method = HttpMethod.HEAD,
    path = path,
    query = query,
    request = EmptyRequest(),
    response = response
)
