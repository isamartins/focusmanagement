package Exercicios

/* Um garoto está planejando montar um aquário de peixes japoneses. Para cada peixe, são necessários pelo menos 20
   litros de água. Além disso, o comprimento mínimo do aquário deve ser de 60cm. Faça um algorítimo que recebe como
   entrada o número de peixes desejados, o comprimento, a largura e a altura do aquário em centímetros, e mostra a
   mensagem "Aquário Inadequado!" */

//VOLUME = COMPRIMENTO * LARGURA * ALTURA

fun main(args: Array<String>) {

    var vol = 0
    var resp = 0
    println("Digite a quantidade de peixes que o aquário terá: ")
    val qtd = readLine()?.toInt() ?:0
    println("Digite o comprimento do aquário: ")
    val compr = readLine()?.toInt() ?:0
    println("Digite a largura do aquário: ")
    val larg = readLine()?.toInt() ?:0
    println("Digite a altura do aquário: ")
    val alt = readLine()?.toInt() ?:0

    vol = compr * larg * alt
    resp = vol/qtd

    if (compr < 60 || resp%qtd != 0){
        println("Aquário inadequado!")
    }else
        println("Aquário adequado!")

}

