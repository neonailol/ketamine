package nnl.rocks.ketamine.models

import nnl.rocks.ketamine.models.modules.Modules
import nnl.rocks.ketamine.models.servers.Server

/**
 * Entry point for defining api
 */
class Ketamine(
    private val version: Version = Version.DRAFT,
    private val server: Server,
    private val modules: Modules
) {

    enum class Version {
        DRAFT
    }
}
