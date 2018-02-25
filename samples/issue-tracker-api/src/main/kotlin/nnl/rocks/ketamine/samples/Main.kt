package nnl.rocks.ketamine.samples

import nnl.rocks.ketamine.models.Ketamine
import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.HttpMethod
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.modules.Module
import nnl.rocks.ketamine.models.modules.Modules
import nnl.rocks.ketamine.models.operations.Operation
import nnl.rocks.ketamine.models.operations.Operations
import nnl.rocks.ketamine.models.request.Path
import nnl.rocks.ketamine.models.servers.Server

fun main(args: Array<String>) {
    val ketamine = Ketamine(
        server = Server(
            url = "http://localhost:8080/api",
            description = Description("production server")
        ),
        modules = Modules(
            Module(
                name = "Issues",
                summary = Summary("Provides api to read and modify issues"),
                description = Description("""Need to put here some detailed text in _markdown_ formatting."""),
                operations = Operations(
                    Operation(
                        name = "GetIssues",
                        summary = Summary("Simple get all issues"),
                        description = Description(""),
                        method = HttpMethod.GET,
                        path = Path("/issues")
                    )
                )
            )
        )
    )
}
