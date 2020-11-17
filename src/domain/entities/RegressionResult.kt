package domain.entities

/**
 * y = ax + b
 */
class RegressionResult(
    val a: Double,
    val b: Double
) {

    fun calculateX(y: Double): Double {
        return (y - b) / a
    }

    fun calculateY(x: Double): Double {
        return a * x + b
    }

    override fun toString(): String {
        return "RegressionResult(a=$a, b=$b)"
    }
}