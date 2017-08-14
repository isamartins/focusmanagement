package Exercicios

fun main(args: Array<String>) {
    val a: Int = 10
    val b = 5
    val c:Int? = null // O ? força que seja atribuido à variável nulo "", caso não seja informado nenhum valor.
    val frutas = listOf("Banana", "Maça", "Pêra", "Mamão")
    var index = 0
    val s:Any = 2 //Any é o OU do Java
    val t:Any = 5

    println("A Soma de $a + $b é ${soma(a,b)}")
    println("$c")

    for(f in frutas){
        print("$f ")
    }
    println("")

    for(j in 1..10){
        print("$j ")
    }
    println("")

    for(j in 1..10 step 2){
        print("..$j ")
    }
    println("")

    for(k in 10 downTo 1 step 2){
        print("**$k ")
    }
    println("")

    while (index < frutas.size){
        println(frutas[index])
        index += 1
    }

    //when é o switch do java
    when(s){
        2 -> println("2")
        is String -> println("Variável do tipo String")
        (a ==10|| a == 20) -> println("O valor de s é igual a 10 ou 20")
    }

    when(setOf(s, t)){
        setOf(2,3) -> println("2 e 3")
        setOf(5,7) -> println("5 e 7")
        setOf(2,5) -> println("2 e 5")
    }

    //Verificar se tem banana
    when{
        "Banana" in frutas -> println("Tem banana!")
        else -> println ("Não tem banana!")
    }

    //Listar somente as frutas que comecem com a letra M, colocando em ordem alfabetica e todas as letras maiusculas
    frutas.filter{i -> i
          .startsWith('M')}
          .sortedBy {it}
          .map{it.toUpperCase()}
          .forEach {println(it)}
}