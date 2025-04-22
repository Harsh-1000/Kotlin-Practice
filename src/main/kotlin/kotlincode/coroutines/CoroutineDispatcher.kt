package kotlincode.coroutines

/**
 * The coroutine context includes a coroutine dispatcher (see CoroutineDispatcher) that determines
 * what thread or threads the corresponding coroutine uses for its execution.
 * The coroutine dispatcher can confine coroutine execution to a specific thread,
 * dispatch it to a thread pool, or let it run unconfined.
 * What is a Coroutine Dispatcher?
 * A Coroutine Dispatcher is a component in the coroutine context that decides:
 *
 * 🧠 “Where (on which thread or threads) will this coroutine actually run?”
 *
 * It’s like saying:
 *
 * "Run this on the main thread"
 *
 * "Use a background thread pool"
 *
 * "I don’t care, do it wherever"
 *
 *Why does it matter?
 * Because:
 *
 * Some work must run on the main/UI thread (like updating UI in Android)
 *
 * Other tasks (like network/database calls) should run in the background
 *
 * Controlling the dispatcher avoids freezing or wasting threads
 */

fun simple(): List<Int> = listOf(1, 2, 3)

fun main() {
    simple().forEach { println(it) }
}