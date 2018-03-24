package {{ cookiecutter.library_package_name }} 

import kotlin.test.*

class HttpTest {
    @Test
    fun testGetPlatform() {
        val platform = Platform("DEF")
        assertEquals("KN-iOS DEF", platform.get())
    }
}
