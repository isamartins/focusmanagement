package Exercicios

fun main(args: Array<String>) {

    println("Digite a quantidade de signos que a Array terá: ")
    val qtd = readLine()?.toInt() ?:0

    val signos = Array(qtd,{""})

    for(i in 0..qtd -1){
        println("Digite um signo: ")
        signos[i] = readLine()?: ""
    }

    print("A quantidade de signos é: $qtd e os signos informados são: ")

    signos.filter{i -> i
            .any()} //traz todos
            .sortedBy{it} //Ordena
            .forEach {print("$it ")} //Imprime o resultado do filtro
}