package nnl.rocks.ketamine.models.operations

/**
 * Represents a collection of different operations
 */
class Operations(
    private val operations: Collection<Operation>
) : Collection<Operation> by operations
