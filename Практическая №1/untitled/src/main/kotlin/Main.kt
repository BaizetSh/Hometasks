
import kotlin.math.*

fun main(args: Array<String>) {
    // задание 1
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved += 1
    // задание 2
    var age:Int = 17
    println(age)
    exercisesSolved += 1
    // задание 3
    var average:Double=17.0
    average=(average+30)/2
    println(average)
    exercisesSolved += 1
    // задание 4
    val testNumber:Int=3242
    val evenOdd:Double=testNumber%2.0
    println(evenOdd)
    exercisesSolved += 1
    // задание 5
    var answer:Int=0
    answer=((answer+1+10)*10) shr 3
    println(answer)
    exercisesSolved += 1
    // задание 6
    age=16
    println(age)
    age=30
    println(age)
    exercisesSolved += 1
    // задание 7
    val a:Double=46.0
    val b:Double=10.0
    val answer1=a*100+b
    println(answer1)
    val answer2=a*100+b*100
    println(answer2)
    val answer3=a+100+b/10
    println(answer3)
    exercisesSolved += 1
    // задание 8
    println("BMW = " + (5*3-4/2*2))
    exercisesSolved += 1
    // задание 9
    average = (a+b)/2
    exercisesSolved += 1
    // задание 10
    val fahrenheit:Double=180.0
    var celcius:Double=(180.0-32.0)/1.8
    println(celcius)
    exercisesSolved += 1
    // задание 11
    val pozicion: Int = 45
    val row: Int = pozicion / 8
    val cul: Int = pozicion % 8
    println(pozicion)
    println(row)
    println(cul)
    // задание 12
    val degrees:Double=60.0
    val radians:Double=PI*degrees/180.0
    println(radians)
    exercisesSolved += 1
    // задание 13
    val x1:Double=3.0
    val x2:Double=7.0
    val y1:Double=4.0
    val y2:Double=9.0
    val distance:Double=sqrt  ((x2-x1).pow(2))+((y2-y1).pow(2))
    println(distance)
    exercisesSolved += 1
    println(exercisesSolved)
}















