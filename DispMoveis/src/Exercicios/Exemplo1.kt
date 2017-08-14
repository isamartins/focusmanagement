package Exercicios

fun main(args: Array<String>) {
    val a: Int = 6
    val b = 5

    println("A soma de 3 + 5 é ${soma(a,b)}")
    imprimirSub(a,b)
    val result = if(a<5) -1 else 1
    println("$result")
}

fun soma(a:Int, b:Int): Int = a+b
fun imprimirSub(a:Int, b:Int):Unit = println("A Subtração de $a - $b é ${a-b}")