package konan

/**
 * Forces the compiler to use specified symbol name for the target `external` function.
 *
 * TODO: changing symbol name breaks the binary compatibility,
 * so it should probably be allowed on `internal` and `private` functions only.
 */
//@Target(AnnotationTarget.FUNCTION)
//@Retention(AnnotationRetention.SOURCE)
annotation class SymbolName(val name: String)

