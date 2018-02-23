package nnl.rocks.ketamine.samples

import nnl.rocks.ketamine.models.Ketamine
import nnl.rocks.ketamine.models.domain.Description
import nnl.rocks.ketamine.models.domain.Summary
import nnl.rocks.ketamine.models.modules.Module
import nnl.rocks.ketamine.models.modules.Modules
import nnl.rocks.ketamine.models.modules.Operations
import nnl.rocks.ketamine.models.servers.Server

fun main(args: Array<String>) {
    val ketamine = Ketamine(
        server = Server(
            url = "http://localhost:8080/api",
            description = Description("production server")
        ),
        modules = Modules(
            listOf(
                Module(
                    summary = Summary(""),
                    description = Description(""),
                    operations = Operations(

                    )
                )
            )
        )
    )
}
