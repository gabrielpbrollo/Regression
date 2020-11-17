package domain.usecase

import domain.entities.RegressionResult
import domain.entities.Sample
import java.lang.Exception
import kotlin.math.pow

/**
 * Calcula o valor dos coeficientes a e b para a reta
 * y = ax + b
 * Onde:
 * a = ((n.∑xy) - (∑x.∑y)) / ((n.∑x²) - (∑x)²)
 * b = ((∑y.∑x²) - (∑x.∑xy)) / ((n.∑x²) - (∑x)²)
 */
class LinearRegressionUseCase {

    fun calculate(samples: List<Sample>): RegressionResult {
        val n = samples.size
        if (n == 0) {
            throw EmptySampleListException
        }

        var xySum = 0.0
        var xSum = 0.0
        var ySum = 0.0
        var xPowSum = 0.0

        for (sample in samples) {
            with(sample) {
                xySum += (x * y)
                xSum += x
                ySum += y
                xPowSum += x.pow(2)
            }
        }

        val a = ((n * xySum) - (xSum * ySum)) / ((n * xPowSum) - xSum.pow(2))

        val b = ((ySum * xPowSum) - (xSum * xySum)) / ((n * xPowSum) - xSum.pow(2))

        return RegressionResult(a, b)
    }

    object EmptySampleListException: Exception("Sample list must not be empty")
}