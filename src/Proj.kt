fun main(){
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    println("Hola Mundo")
    printSum(a = 5,b = 10)


}
fun otrafuncion(){
    println("adios")
}
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
fun maxOff(a: Int, b: Int) = if (a > b) a else b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}