package org.squidmin.kotlinspringlabs

import ExampleComponent
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class IntegrationTestConfig {

    @Bean
    fun exampleComponent(): ExampleComponent {
        return ExampleComponent()
    }

}
