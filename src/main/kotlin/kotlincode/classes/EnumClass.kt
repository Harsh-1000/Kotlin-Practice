package kotlincode.classes

enum class Network(val enabled: Boolean){
    CONNECTED(true),
    DISCONNECTED(false)
}

fun getNetwork(network: Network):Boolean{
    return when(network){
        Network.CONNECTED -> network.enabled
        Network.DISCONNECTED -> network.enabled
    }
}

fun main(args: Array<String>) {
    val res = getNetwork(Network.CONNECTED)
    println(res)
}