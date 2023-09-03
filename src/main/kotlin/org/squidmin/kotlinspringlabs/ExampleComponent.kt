import lombok.Getter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class ExampleComponent {

    @Value("\${injected-field:this_is_a_default_value}")
    @Getter
    lateinit var injectedField: String

    fun examplePrintFunction() {
        println(injectedField)
    }

}
