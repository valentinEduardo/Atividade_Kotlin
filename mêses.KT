fun main() {
  val entrada: String? = readLine()
  
  // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
  // Referência: https://kotlinlang.org/docs/destructuring-declarations.html
  val (dia, mes, ano) = entrada!!.split("/")
  
    val mesPorExtenso = when (mes.toInt()) {
      in 1..12 -> when(mes.toInt()) {
          1-> "Janeiro"
          2-> "Fevereiro"
          3-> "Março"
          4-> "Abril"
          5-> "Maio"
          6-> "Junho"
          7-> "Julho"        
          8-> "Agosto"
          9-> "Setembro"
          10-> "Outubro"
          11->"Novembro"
          12->"Dezembro"
          else -> println("")
      }  //TODO("Criar as condições para cada mês")
      else -> "Mês Inválido!"
  }
  println("$dia de $mesPorExtenso de $ano")
  //TODO("Imprimir a saída: $dia de $mesPorExtenso de $ano")
}
  
  //TODO("Imprimir a saída: $dia de $mesPorExtenso de $ano")
