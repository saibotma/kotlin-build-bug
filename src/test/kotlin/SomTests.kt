import org.junit.jupiter.api.Test
import org.kodein.di.*

class SomTests {
    @Test
    fun `test something`() {
        val testService = object : TestService { override fun test() {} }
        DI { bindSingleton { testService } }
    }
}

interface TestService {
    fun test()
}
