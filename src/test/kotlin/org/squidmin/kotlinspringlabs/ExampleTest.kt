package org.squidmin.kotlinspringlabs

import ExampleComponent
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class ExampleTest {

    @Autowired
    lateinit var exampleComponent: ExampleComponent

    @Nested
    inner class ExampleComponentTests {
        @Test
        fun `exampleComponent should not be null`() {
            assertNotNull(exampleComponent)
        }

        @Test
        fun `examplePrintFunction(), when invoked, should print the value of its injected field`() {
            exampleComponent.examplePrintFunction()
        }

        @Test
        fun `exampleReturnFunction(), when invoked, should return the value of its injected field`() {
            assertEquals("val", exampleComponent.injectedField)
        }
    }

    @Autowired
    lateinit var exampleService: ExampleService

    @Nested
    inner class ExampleServiceTest {
        @Test
        fun `exampleService should not be null`() {
            assertNotNull(exampleService)
        }

        @Test
        fun `serviceFunction1(), when invoked, should return expected value`() {
            assertEquals("kotlin string template! :)", exampleService.serviceFunction1())
        }

        @Test
        fun `serviceFunction2(), when invoked, should return expected value`() {
            assertEquals("kotlin string template! \\uD83D\\uDC0B", exampleService.serviceFunction2())
        }
    }

}
