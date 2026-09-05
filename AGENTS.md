# Chisel development rules

- Treat the Chisel dependency version declared in `build.sbt` as the required Chisel version for this workspace.
- Before generating or modifying Chisel code, inspect `build.sbt` and use only APIs and syntax compatible with that Chisel version.
- Do not assume a newer Chisel version or introduce dependencies that are not declared in `build.sbt`.
- If `build.sbt` does not declare a Chisel version, ask the user for the required version before generating Chisel code.
- When version-sensitive behavior is relevant, state the assumed Chisel version in the response or code comment.
