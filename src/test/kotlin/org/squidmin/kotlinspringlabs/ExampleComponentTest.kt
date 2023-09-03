package org.squidmin.kotlinspringlabs

import ExampleComponent
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class ExampleComponentTest {

    @Autowired
    lateinit var exampleComponent: ExampleComponent

    @Test
    fun `my component should not be null`() {
        assertNotNull(exampleComponent)
    }

    @Test
    fun `exampleFunction(), when invoked, should print the value of its injected field`() {
        exampleComponent.examplePrintFunction()
    }

    @Test
    fun `exampleReturnFunction(), when invoked, should return the value of its injected field`() {
        assertEquals("val", exampleComponent.injectedField)
    }

}
