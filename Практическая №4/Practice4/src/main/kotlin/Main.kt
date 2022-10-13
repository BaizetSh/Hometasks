import kotlin.math.sqrt

    // Задание №1
fun main(args: Array<String>)
{
    fun printFullName (firstName:String, lastName:String)
    {
        println("$firstName" + " " + "$lastName")
    }

    // Задание №2
    printFullName(firstName = "Байзет", lastName = "Шхалахов")

    // Задание №4
    fun calculateFullName(fullName:String,nameLenght:Int): Pair<String,Int>
    {
        return Pair(fullName,nameLenght)
    }

    // Задание №3
    val fullName = calculateFullName(fullName = "Байзет Шхалахов", nameLenght = "Байзет Шхалахов".length)
    println(fullName)

    // Задание №5
    fun divisible(number:Int,divisor:Int):Boolean
    {
        return number%divisor==0
    }
    fun prim(number:Int):Boolean
    {
        if (number<0)
        {
            return false
        }
        if (number<=1)
        {
            return true
        }
        val doubleNumber=number.toDouble()
        val root =(sqrt(doubleNumber)).toInt()
        for (divisor in 2..root)
        {
            if (divisible(number, divisor))
            {
                return false
            }
        }
        return true
    }
    println(prim(4))
    println(prim(17))


    // Задание №6
    fun fibonacci(number: Int): Int
    {
        if (number<=0)
        {
            return 0
        }
        if (number==1 || number==2)
        {
            return 1
        }
        return fibonacci(number-1) + fibonacci(number-2)
    }
    println(fibonacci(9))

}