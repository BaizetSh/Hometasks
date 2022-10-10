fun main(args: Array<String>)
{
    // Задание 1
    val age1: Double = 42.0
    val age2: Double = 21.0

    // Задание 2
    val avg1 = age1 + age2 / 2

    // Задание 3

    println("преобразовали в тип Double, поэтому всё получилось")

    // Задание 4
    val firstName:String = "Шехзеде Байзет"
    val lastName:String = "Хазретрели"

    // Задание 5
    val fullName:String = firstName + " " + lastName
    println(fullName)

    // Задание 6
    val myDetails:String = "Привет, меня зовут $fullName"
    println(myDetails)

    // Задание 7
    val dates = Triple (13,12,2004)

    // Задание 8
    val month = dates.first
    val day = dates.second
    val year = dates.third

    // Задание 9
    val monthAndYear = """
        |$month
        |
        |$year
        """.trimMargin()
    println(monthAndYear)

    // Задание 10
    val pair = Pair (10, year)

}