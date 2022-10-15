fun main(args: Array<String>) {
    var poly = Polygon(List<Point>(3){Point()})

    poly.Points.forEach {
        println(it.X.toString() + " " + it.Y.toString())
    }

    poly.MoveXY(5.0, -4.0)

    poly.Points.forEach {
        println(it.X.toString() + " " + it.Y.toString())
    }
}
open class Point
{
    constructor()
    {
        this.X = 0.0
        this.Y = 0.0
    }
    constructor(X: Double, Y: Double)
    {
        this.X = X
        this.Y = Y
    }

    var X: Double
    var Y: Double

    override fun toString(): String
    {
        return super.toString()
    }
}
class ColoredPoint: Point {
    constructor() : super() {
        this.Color = "#000000"
    }
    constructor(X: Double, Y: Double, Color: String) : super(X, Y) {
        this.Color = Color
    }

    var Color: String

    override fun toString(): String {
        return super.toString()
    }
}
open class Line(A: Point, B: Point)
{
    var A: Point = A
    var B: Point = B

    override fun toString(): String
    {
        return super.toString()
    }
}
class ColoredLine(A: Point, B: Point, Color: String): Line(A, B)
{
    var Color: String = Color

    override fun toString(): String
    {
        return super.toString()
    }
}
class Polygon(Points: List<Point>)
{
    var Points: List<Point> = Points

    open fun MoveX(AmountX: Double)
    {
        Points.forEach {
            it.X += AmountX
        }
    }
    open fun MoveY(AmountY: Double)
    {
        Points.forEach {
            it.Y += AmountY
        }
    }
    open fun MoveXY(AmountX: Double, AmountY: Double) {
        Points.forEach {
            it.X += AmountX
            it.Y += AmountY
        }
    }

    override fun toString():String
    {
        return super.toString()
    }
}