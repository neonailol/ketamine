package nnl.rocks.ketamine.models.validation

class Validations(
    private val props: Collection<Validation>
)

open class Validation

class NotNull : Validation()

class NotEmpty : Validation()

class NotBlank : Validation()
