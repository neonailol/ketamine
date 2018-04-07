import org.gradle.api.Project

inline fun <reified T : Any> Project.prop(name: String): T {
    return project.property(name) as T
}
