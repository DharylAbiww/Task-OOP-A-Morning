package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    val a: Int = 100
    val b: Int = 45
    val result: Int = try {
        a / b
    } catch (exception: ArithmeticException) {
        -1
    }
    println("Hasil dari $a/$b adalah: $result")

}