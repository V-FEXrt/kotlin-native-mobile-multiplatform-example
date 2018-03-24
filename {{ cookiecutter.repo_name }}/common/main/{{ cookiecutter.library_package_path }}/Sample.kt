package {{ cookiecutter.library_package_name }}

class Sample {
  fun checkPlatform():String {
    val platform = Platform("google.com")
    return platform.get()
  }
}