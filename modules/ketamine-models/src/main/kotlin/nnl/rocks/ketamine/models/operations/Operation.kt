package nnl.rocks.ketamine.models.operations

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.HttpMethod
import nnl.rocks.ketamine.models.domain.Summary

/**
 * Represents an atomic rest request
 */
class Operation(
    private val summary: Summary,
    private val description: Description,
    private val method: HttpMethod,
    private val path: String
)
