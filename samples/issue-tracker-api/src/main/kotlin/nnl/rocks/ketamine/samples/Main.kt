package nnl.rocks.ketamine.samples

import nnl.rocks.ketamine.models.Ketamine
import nnl.rocks.ketamine.models.domain.*
import nnl.rocks.ketamine.models.headers.Header
import nnl.rocks.ketamine.models.modules.Module
import nnl.rocks.ketamine.models.modules.Modules
import nnl.rocks.ketamine.models.operations.GetOperation
import nnl.rocks.ketamine.models.operations.Operations
import nnl.rocks.ketamine.models.operations.PostOperation
import nnl.rocks.ketamine.models.operations.PutOperation
import nnl.rocks.ketamine.models.request.Path
import nnl.rocks.ketamine.models.request.PathParam
import nnl.rocks.ketamine.models.request.PathParams
import nnl.rocks.ketamine.models.request.RequestModel
import nnl.rocks.ketamine.models.response.ResponseModel
import nnl.rocks.ketamine.models.servers.Server
import nnl.rocks.ketamine.models.types.*
import nnl.rocks.ketamine.models.validation.NotBlank
import nnl.rocks.ketamine.models.validation.NotNull
import nnl.rocks.ketamine.models.validation.Validations

open class Identifiable : ModelProperty(
    name = "id",
    type = UUIDType(),
    summary = EmptySummary(),
    description = EmptyDescription(),
    validations = Validations(NotNull())
)

class IssueCommon : ModelProperties(
    Identifiable(),
    ModelProperty("title", StringType(), NotBlank())
)

class Issue : ResponseModel(
    IssueCommon(),
    ModelProperty("author", UUIDType(), NotNull()),
    ModelProperty("description", StringType(), NotBlank())
)

class Issues : ResponseModel(
    ModelProperty(
        "elements",
        CollectionType(
            ObjectType(
                IssueCommon()
            )
        )
    )
)

class CreateIssueCommand : RequestModel(
    ModelProperty(
        name = "title",
        type = StringType(),
        summary = EmptySummary(),
        description = EmptyDescription(),
        validations = Validations(NotBlank())
    ),
    ModelProperty(
        name = "description",
        type = StringType(),
        summary = EmptySummary(),
        description = EmptyDescription(),
        validations = Validations(NotBlank())
    )
)

class EditIssueCommand : RequestModel(
    ModelProperty(
        name = "title",
        type = StringType(),
        summary = EmptySummary(),
        description = EmptyDescription(),
        validations = Validations(NotBlank())
    ),
    ModelProperty(
        name = "description",
        type = StringType(),
        summary = EmptySummary(),
        description = EmptyDescription(),
        validations = Validations(NotBlank())
    )
)

class CreationResponse : ResponseModel(
    headers = listOf(
        Header(
            header = HttpHeader.LOCATION,
            type = UUIDType()
        )
    ),
    props = emptyList(),
    status = HttpStatus.CREATED
)

class IdPath(
    path: String
) : Path(
    value = "/$path/{id}",
    params = PathParams(
        PathParam(
            name = "id",
            type = UUIDType()
        )
    )
)

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
                        path = Path("/issues"),
                        response = Issues()
                    ),
                    GetOperation(
                        name = "GetIssue",
                        summary = Summary("Get issue by id"),
                        description = Description(""),
                        path = IdPath("issues"),
                        response = Issue()
                    ),
                    PostOperation(
                        name = "NewIssue",
                        summary = Summary("Create new issue"),
                        description = Description(""),
                        path = Path("/issues"),
                        request = CreateIssueCommand(),
                        response = CreationResponse()
                    ),
                    PutOperation(
                        name = "EditIssue",
                        summary = Summary("Edit existing issue"),
                        description = Description(""),
                        path = IdPath("issues"),
                        request = EditIssueCommand()
                    )
                )
            )
        )
    )
}
