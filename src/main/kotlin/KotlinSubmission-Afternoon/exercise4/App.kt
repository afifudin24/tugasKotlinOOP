package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    val userInput = "123a"

    try {
        val number = userInput.toInt()
        println("Angka yang diubah: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan konversi: '${userInput}' bukan angka yang valid.")
    }
}