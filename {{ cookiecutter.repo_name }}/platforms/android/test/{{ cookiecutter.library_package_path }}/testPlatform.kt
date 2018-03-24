package {{ cookiecutter.library_package_name }} 

import kotlin.test.*

class HttpTest {
    @Test
    fun testGetPlatform() {
        val platform = Platform("ABC")
        assertEquals("KN-Android ABC", platform.get())
    }
}
