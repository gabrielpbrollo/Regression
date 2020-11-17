import domain.fake.FakeSamples
import domain.usecase.LinearRegressionUseCase
import kotlin.jvm.JvmStatic

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val abForFive = LinearRegressionUseCase().calculate(FakeSamples.getNFive())
        println(abForFive)

        val abForForty = LinearRegressionUseCase().calculate(FakeSamples.getNForty())
        println(abForForty)

        println(abForForty.calculateY(29.0))
        println(abForForty.calculateX(188.49))
    }
}