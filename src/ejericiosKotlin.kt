/*
* Ejericio: Verificar cadena
* Nombre: Fernando Acosta Fajardo
* ID: 00000216555
* */


fun esFina(cadena: String): Boolean{
    var cadena = cadena.lowercase()

    var regex = "^.*[aeicadenaou].*[aeiou].*[aeiou].*\$".toRegex()

    var regex2 = "^.*(.)\\1.*\$".toRegex()

    var regex3 = "^.*(bu|ba|be).*\$".toRegex()


    if(!cadena.matches(regex) || !cadena.matches(regex2) && cadena.matches(regex3)){
        return false
    }
    return true

}

fun verificarCadena(cad: String): Boolean {

    val regex = Regex("^[a-zA-Z_]{1}[a-zA-Z0-9_]*$")

    return regex.matches(cad)

}



fun main(args: Array<String>){

    println(verificarCadena("nombre"))
    println(verificarCadena("_nombre"))
    println(verificarCadena("_12"))
    println(verificarCadena(""))
    println(verificarCadena("_$%"))
    println(verificarCadena("3ombre"))
    println(verificarCadena("3ombre-"))
    println(verificarCadena("012"))
    println(verificarCadena("no$"))
    println(verificarCadena("no#"))
    println(verificarCadena("s_@"))

    println(esFina("bac"))
    println(esFina("aza"))
    println(esFina("abaca"))
    println(esFina("baaaa"))
    println(esFina("aaaab"))
    println(esFina("bamiau"))
    println(esFina("zzzz"))
    println(esFina("abba"))
    println(esFina("abbaa"))
    println(esFina("bu"))
    println(esFina("buu"))
    println(esFina("abuu"))


}



