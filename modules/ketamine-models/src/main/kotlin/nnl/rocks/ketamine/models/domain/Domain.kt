package nnl.rocks.ketamine.models.domain

/**
 * Brief summary
 */
open class Summary(
    private val value: String
)

class EmptySummary : Summary("")

/**
 * Detailed description in markdown format
 */
open class Description(
    // language=Markdown
    private val value: String
)

class EmptyDescription : Description("")
