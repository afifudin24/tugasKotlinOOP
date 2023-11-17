package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Afif"
    val namaAkhir = "Waliyudin"
    val umur = 20
    val single = true

    println("Nama : ${namaDepan} ${namaAkhir}")
    println("Umur : ${umur.toString()}")
    println(if(single){
        "Status : Single"
    }else{
        "Status : Berpasangan"
    })


}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return println("${groupId}, ${groupMember}, ${session}")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val groupMembers = listOf("Ardini Daniyah", "Alif Januantara P", "Yoga Pradana", "Dedi Afrizal", "M. Septian Rafi", "Roshans Aland H", "Irfan Rian Fahmi", "Afif Waliyudin", "Steffany", "Rizky Aprinanda" )
    val myName = groupMembers[7] // Mengambil nama Anda dari daftar anggota group

    return listOf(myName)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

    fun totalMember(): Int {
        val mentors = arrayOf("Jovian", "Imam")
        val groupMembers = arrayOf("Ardini Daniyah", "Alif Januantara P", "Yoga Pradana", "Dedi Afrizal", "M. Septian Rafi", "Roshans Aland H", "Irfan Rian Fahmi", "Afif Waliyudin", "Steffany", "Rizky Aprinanda" )

        val totalMentors = mentors.size
        val totalGroupMembers = groupMembers.size

        val total = totalMentors + totalGroupMembers
        return total
    }



fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("7", listOf("Ardini Daniyah", "Alif Januantara P", "Yoga Pradana", "Dedi Afrizal", "M. Septian Rafi", "Roshans Aland H", "Irfan Rian Fahmi", "Afif Waliyudin", "Steffany", "Rizky Aprinanda" ), "Siang")

}