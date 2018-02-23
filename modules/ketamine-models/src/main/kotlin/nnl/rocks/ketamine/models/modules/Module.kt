package nnl.rocks.ketamine.models.modules

import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.Summary

/**
 * Represents group of related functionality
 */
class Module(
    private val summary: Summary,
    private val description: Description,
    private val operations: Operations
)

class Operations
