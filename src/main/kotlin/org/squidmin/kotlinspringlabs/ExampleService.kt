package org.squidmin.kotlinspringlabs

import lombok.Getter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class ExampleService {

    @Value("\${service-field-1:default_field_1_val}")
    @Getter
    lateinit var serviceField1: String

    @Value("\${service-field-2:default_field_2_val}")
    @Getter
    lateinit var serviceField2: String

    fun serviceFunction1(): String {
        return "kotlin string template! $serviceField1"
    }

    fun serviceFunction2(): String {
        val differentExample = "kotlin"
        return "$differentExample string template! $serviceField2"
    }

}
