package nnl.rocks.ketamine.models

import arrow.core.None
import arrow.core.Option
import nnl.rocks.ketamine.models.info.Info
import nnl.rocks.ketamine.models.servers.Servers
import nnl.rocks.ketamine.models.tags.Tags
import nnl.rocks.ketamine.models.security.SecurityRequirements

/**
 * Entry point for defining api
 */
class Ketamine private constructor(
    private val version: Version = Version.DRAFT,
    private val info: Option<Info> = None,
    private val externalDocs: Option<ExternalDocumentation> = None,
    private val servers: Option<Servers> = None,
    private val security: Option<SecurityRequirements> = None,
    private val tags: Option<Tags> = None,
    private val paths: Option<Paths> = None,
    private val components: Option<Components> = None,
    private val extensions: Option<Extensions> = None
) {

    enum class Version {
        DRAFT
    }
}

class Extensions : HashMap<String, Any>()
