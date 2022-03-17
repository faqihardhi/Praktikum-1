fun main(args: Array<String>) {
    //Elemen String
    val myName: String = "Nurul Akmal"
    for(chr in myName){
        print(chr)
    }
    print('\n')
    //Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +, sehingga tipe data yang digabung otomatis akan melebur kedalam String.
    val s = "abc" + 1
    println(s + "def")

    //Raw String
    //Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan raw String yang dipisahkan dengan triple quotes (""").
    var texts = """
    for (c in "foo")
        print(c)
    """
        println(texts)

    //menghapus spasi yang tidak diperlukan dalam raw String
    var text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
    println(text)
}