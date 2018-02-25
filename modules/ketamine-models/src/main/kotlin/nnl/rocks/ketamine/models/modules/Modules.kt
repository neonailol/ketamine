package nnl.rocks.ketamine.models.modules

/**
 * Represents a collection of different modules
 */
class Modules(
    private val modules: Collection<Module>
) : Collection<Module> by modules {

    constructor(vararg modules: Module) : this(modules.asList())
}
