package nnl.rocks.ketamine.models.modules

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.operations.Operations

/**
 * Represents group of related functionality
 */
class Module(
    private val name: String,
    private val summary: Summary,
    private val description: Description,
    private val operations: Operations
)

