package nnl.rocks.ketamine.samples

import nnl.rocks.ketamine.models.Ketamine
import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.modules.Module
import nnl.rocks.ketamine.models.modules.Modules
import nnl.rocks.ketamine.models.operations.GetOperation
import nnl.rocks.ketamine.models.operations.Operations
import nnl.rocks.ketamine.models.request.Path
import nnl.rocks.ketamine.models.request.PathParam
import nnl.rocks.ketamine.models.request.PathParams
import nnl.rocks.ketamine.models.servers.Server
import nnl.rocks.ketamine.models.types.UUIDType

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
                    GetOperation(
                        name = "GetIssues",
                        summary = Summary("Get all issues"),
                        description = Description(""),
                        path = Path("/issues")
                    ),
                    GetOperation(
                        name = "GetIssue",
                        summary = Summary("Get issue by id"),
                        description = Description(""),
                        path = Path(
                            value = "/issues/{id}",
                            params = PathParams(
                                PathParam(
                                    name = "id",
                                    type = UUIDType()
                                )
                            )
                        )
                    )
                )
            )
        )
    )
}
