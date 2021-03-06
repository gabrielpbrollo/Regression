package domain.fake

import domain.entities.Sample

class FakeSamples {

    companion object {

        fun getNFive() = mutableListOf<Sample>().apply {
            add(Sample(27.8, 180.3))
            add(Sample(25.7, 175.3))
            add(Sample(26.7, 184.8))
            add(Sample(25.9, 177.8))
            add(Sample(26.4, 182.3))
        }

        fun getNForty() = mutableListOf<Sample>().apply {
            add(Sample(27.8, 180.3))
            add(Sample(25.7, 175.3))
            add(Sample(26.7, 184.8))
            add(Sample(25.9, 177.8))
            add(Sample(26.4, 182.3))
            add(Sample(29.2, 185.4))
            add(Sample(26.8, 180.3))
            add(Sample(28.1, 175.3))
            add(Sample(25.4, 177.8))
            add(Sample(27.9, 185.4))
            add(Sample(27.5, 190.5))
            add(Sample(28.8, 195.0))
            add(Sample(26.7, 175.3))
            add(Sample(26.5, 180.3))
            add(Sample(25.1, 172.7))
            add(Sample(28.7, 182.9))
            add(Sample(29.2, 189.2))
            add(Sample(27.9, 185.4))
            add(Sample(28.6, 193.7))
            add(Sample(26.0, 177.8))
            add(Sample(23.8, 167.6))
            add(Sample(25.1, 168.3))
            add(Sample(25.4, 165.7))
            add(Sample(21.9, 165.1))
            add(Sample(26.2, 165.1))
            add(Sample(23.8, 165.1))
            add(Sample(22.2, 152.4))
            add(Sample(24.6, 162.6))
            add(Sample(24.6, 179.1))
            add(Sample(23.7, 175.9))
            add(Sample(25.6, 166.4))
            add(Sample(24.1, 167.6))
            add(Sample(23.8, 162.6))
            add(Sample(23.3, 167.6))
            add(Sample(23.2, 165.1))
            add(Sample(24.3, 166.4))
            add(Sample(23.5, 165.1))
            add(Sample(25.1, 172.7))
            add(Sample(24.1, 157.5))
            add(Sample(23.8, 167.6))
        }
    }
}