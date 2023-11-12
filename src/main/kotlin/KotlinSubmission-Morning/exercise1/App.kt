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

fun myProfile(namaDepan: String, namaBelakang: String, umur: Int, status: Boolean = true ): String {
    return "Nama saya adalah $namaDepan $namaBelakang, umur saya $umur tahun, dan status saya single $status"
}



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return "Saya berada dalam grub $groupId, dengan anggota $groupMember, dan kami berada pada sesi $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val namaTeam = listOf<Any>("Dharyl Abi", "Muhammad Nur Muiz", "Muhammad Aldiansyah", "Andini", "Diva", "Zhaki")
    return listOf(namaTeam[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Raihan", "Kak Fateh")
    val countOfGroup = arrayOf<String>("Dharyl Abi", "Muiz", "Aldiansyah", "Andini", "Diva", "Zhaki", "Yuda", "Sadam", "Midil", "Halizah", "Aras")

    val jumlah = mentor.size + countOfGroup.size
    return (jumlah)
}

fun main() {

    val myProfile = myProfile("Dharyl", "Abi", 20, )
    println("$myProfile")


    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    val groupDetail = groupDetail("CollaboraCrew", listOf(myTeam), "Morning")
    println("$groupDetail")

}