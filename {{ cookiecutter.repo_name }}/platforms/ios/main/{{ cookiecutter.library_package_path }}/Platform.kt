package {{ cookiecutter.library_package_name }} 

actual class Platform actual constructor(
  private val url: String
) {
  actual fun get():String {
    return "KN-iOS $url"
  }
}