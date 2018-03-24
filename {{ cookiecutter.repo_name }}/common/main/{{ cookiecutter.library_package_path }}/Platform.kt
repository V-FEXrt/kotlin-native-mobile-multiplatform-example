package {{ cookiecutter.library_package_name }}

expect class Platform(
  url: String
) {
  fun get():String
}