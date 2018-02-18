package nnl.rocks.ketamine.models.security

import java.util.LinkedHashMap

/**
 * SecurityRequirement
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#securityRequirementObject"
 */

class SecurityRequirement : LinkedHashMap<String, List<String>>()

class SecurityRequirements : ArrayList<SecurityRequirement>()
