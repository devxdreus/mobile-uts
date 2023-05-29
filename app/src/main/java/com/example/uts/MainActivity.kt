package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cokelatList = listOf<CokelatClass>(
            CokelatClass(
                R.drawable.foto1,
                cokelatname = "Es Coklat Kenangan",
                cokelatrate = "Rating: (4,5)",
                ratingbar = 4.5,
                cokelatdesc = "Deskripsi:Es Cokelat Kenangan: Kisah Sukses Brand Es Cokelat Lokal dari Banjarmasin\n" +
                        "\n" +
                        "Banjarmasin, sebuah kota yang terletak di Provinsi Kalimantan Selatan, tidak hanya terkenal dengan keindahan alamnya yang memukau, tetapi juga dengan kulinernya yang menggoda selera. Salah satu kuliner khas yang menjadi ikon kota ini adalah es cokelat kenangan, sebuah brand es cokelat lokal yang berasal dari inisiatif seorang mahasiswa. Dengan kreativitas dan kerja kerasnya, brand ini berhasil menarik perhatian masyarakat lokal dan menjadi peluang bisnis yang sukses.\n" +
                        "\n" +
                        "Cerita di balik es cokelat kenangan dimulai dari seorang mahasiswa bernama Ahmad. Semasa kuliah, ia memiliki minat dan passion yang besar terhadap kuliner. Ia merasa terinspirasi oleh cita rasa unik cokelat dan ingin menciptakan sesuatu yang istimewa bagi masyarakat Banjarmasin. Dengan semangat yang membara, Ahmad mulai bereksperimen dan mengembangkan resep es cokelat yang berbeda dari yang ada di pasaran.\n" +
                        "\n" +
                        "Setelah berbulan-bulan mencoba berbagai variasi resep, Ahmad akhirnya menemukan kombinasi rasa yang sempurna untuk es cokelat kenangan. Es cokelat tersebut memiliki rasa cokelat yang kaya dan lembut, dilengkapi dengan tambahan topping seperti keju parut, kacang, dan marshmallow. Keunikan dari es cokelat kenangan ini membuatnya begitu istimewa dan berbeda dari es cokelat pada umumnya.\n" +
                        "\n" +
                        "Tak lama setelah menemukan resep yang sempurna, Ahmad mulai menjual es cokelat kenangan di sekitar kampus dan lingkungan sekitar. Ia menggunakan media sosial sebagai sarana promosi utama, dengan membagikan foto dan testimoni para pelanggan yang puas dengan rasanya. Lambat laun, es cokelat kenangan mulai mendapatkan perhatian yang lebih luas dan semakin banyak orang yang tertarik untuk mencicipinya.\n" +
                        "\n" +
                        "Kesuksesan es cokelat kenangan tidak hanya berhenti di tingkat lokal. Ahmad kemudian mengambil langkah berani dengan membuka gerai pertamanya di pusat perbelanjaan terkenal di Banjarmasin. Dengan dukungan keluarga dan teman-temannya, usaha kecilnya tumbuh dan berkembang menjadi sebuah brand yang dikenal di seluruh kota. Es cokelat kenangan menjadi favorit tidak hanya di kalangan anak muda, tetapi juga semua kalangan usia.\n" +
                        "\n" +
                        "Tidak hanya memberikan kenangan lezat dalam setiap gigitannya, es cokelat kenangan juga memberikan dampak positif bagi masyarakat lokal. Ahmad menyadari pentingnya keberlanjutan dan tanggung jawab sosial, sehingga ia menggunakan bahan-bahan lokal yang berkualitas dalam pembuatan es cokelatnya. Hal ini tidak hanya mendukung petani dan produsen lokal, tetapi juga menjaga keunikan cita rasa yang khas dari Banjarmasin.\n" +
                        "\n" +
                        "Kisah sukses es cokelat kenangan memberikan inspirasi bagi banyak orang, terutama para mahasiswa yang memiliki impian untuk menjadi wirausahawan. Ahmad membuktikan bahwa dengan kerja keras, kreativitas, dan komitmen untuk memberikan yang terbaik, mimpi bisa menjadi kenyataan. Es cokelat kenangan adalah bukti bahwa karya lokal mampu bersaing dan menjadi peluang bisnis yang menguntungkan di tengah persaingan pasar yang ketat."),
            CokelatClass(
                R.drawable.foto2,
                cokelatname = "Cold Cokelat Kenangan",
                cokelatrate = "Rating: (4,0)",
                ratingbar = 4.0,
                cokelatdesc = "Deskripsi: Strategi Bisnis Es Cokelat Kenangan: Menaklukkan Pasar dengan Inovasi dan Pengalaman Pelanggan yang Menarik\n" +
                        "\n" +
                        "Keberhasilan Es Cokelat Kenangan sebagai brand es cokelat lokal dari Banjarmasin tidak hanya bergantung pada rasa yang lezat, tetapi juga pada strategi bisnis yang cerdas. Brand ini berhasil menaklukkan pasar dengan mengadopsi beberapa strategi yang inovatif dan fokus pada pengalaman pelanggan yang menarik. Berikut ini adalah beberapa strategi bisnis yang telah mereka terapkan:\n" +
                        "\n" +
                        "Inovasi Rasa dan Tampilan Produk: Es Cokelat Kenangan terus berinovasi dalam menciptakan variasi rasa dan tampilan produk yang menarik. Selain varian cokelat klasik, mereka juga menghadirkan rasa-rasa baru yang unik, seperti cokelat mint, cokelat stroberi, atau bahkan varian kopi cokelat. Selain itu, mereka juga memberikan sentuhan kreatif dalam tampilan es cokelat, seperti dekorasi topping yang menarik dan presentasi yang cantik. Inovasi ini memberikan kesan segar bagi pelanggan dan membuat Es Cokelat Kenangan selalu menjadi perbincangan di kalangan pecinta makanan.\n" +
                        "\n" +
                        "Pemanfaatan Media Sosial dan Pemasaran Digital: Es Cokelat Kenangan menggunakan media sosial sebagai salah satu alat pemasaran utama mereka. Mereka aktif di platform-platform media sosial seperti Instagram, Facebook, dan Twitter, dengan mengunggah foto-foto menggoda dari produk mereka dan berinteraksi dengan para pengikut mereka. Dengan strategi pemasaran digital yang efektif, mereka mampu menjangkau audiens yang lebih luas dan membangun komunitas online yang aktif, yang pada gilirannya membantu meningkatkan kesadaran merek dan meningkatkan penjualan.\n" +
                        "\n" +
                        "Kemitraan dengan Bisnis Lokal: Es Cokelat Kenangan juga menjalin kemitraan dengan bisnis lokal lainnya, seperti kafe, restoran, dan toko makanan. Mereka menawarkan produk mereka sebagai pilihan tambahan di menu mitra mereka, sehingga memperluas jangkauan distribusi dan meningkatkan visibilitas merek. Melalui kolaborasi semacam ini, mereka juga berkontribusi pada pertumbuhan dan keberlanjutan ekonomi lokal, serta memperkuat ikatan dengan komunitas di sekitarnya.\n" +
                        "\n" +
                        "Fokus pada Pengalaman Pelanggan: Es Cokelat Kenangan sangat memperhatikan pengalaman pelanggan. Selain menyajikan es cokelat yang lezat, mereka juga menciptakan atmosfer yang nyaman dan ramah di gerai mereka. Pelayanan pelanggan yang baik dan interaksi personal dengan pelanggan sangat ditekankan. Mereka juga memperhatikan desain interior yang menarik dan estetika yang menyenangkan untuk menciptakan lingkungan yang mengundang dan menggugah selera. Fokus pada pengalaman pelanggan ini membantu mereka membangun hubungan jangka panjang dengan pelanggan dan menciptakan loyalitas merek.\n" +
                        "\n" +
                        "Komitmen terhadap Kualitas dan Keberlanjutan: Es Cokelat Kenangan selalu berkomitmen untuk menggunakan bahan-bahan berkualitas dalam pembuatan produk mereka. Mereka memilih bahan-bahan segar dan lokal sesuai dengan musim yang berkualitas tinggi. Selain itu, mereka juga memperhatikan aspek keberlanjutan dengan mengurangi penggunaan bahan kemasan sekali pakai dan memilih opsi yang lebih ramah lingkungan. Komitmen mereka terhadap kualitas dan keberlanjutan ini tidak hanya memberikan nilai tambah pada produk mereka, tetapi juga menarik bagi pelanggan yang peduli dengan lingkungan.\n" +
                        "\n" +
                        "Dengan strategi bisnis yang inovatif dan berfokus pada pengalaman pelanggan yang menarik, Es Cokelat Kenangan telah berhasil membangun brand yang sukses di Banjarmasin dan sekitarnya. Keberhasilan mereka menunjukkan bahwa dengan kreativitas, keberanian untuk berinovasi, dan fokus pada kepuasan pelanggan, sebuah brand lokal dapat tumbuh dan bersaing di pasar yang kompetitif."),

            CokelatClass(
                R.drawable.foto3,
                cokelatname = "Hot Cokelat Kenangan",
                cokelatrate = "Rating: (4,0)",
                ratingbar = 4.0,
                cokelatdesc = "Deskripsi: Es Cokelat Kenangan: Rasa yang Menggugah Kenangan Manis dalam Setiap Gigitannya\n" +
                        "\n" +
                        "Es Cokelat Kenangan, brand es cokelat lokal yang berasal dari Banjarmasin, telah berhasil merebut hati banyak pecinta makanan di kota tersebut. Dengan cita rasa yang lezat dan unik, es cokelat ini telah menerima berbagai ulasan positif dari pelanggan mereka. Mari kita lihat beberapa review yang menggambarkan pengalaman orang-orang dalam mencicipi es cokelat kenangan ini:\n" +
                        "\n" +
                        "Novita, seorang penggemar kuliner, mengatakan, \"Es cokelat kenangan adalah kejutan yang luar biasa! Rasanya begitu lembut dan kaya, dengan rasa cokelat yang autentik. Saya suka cara mereka mengkombinasikan tekstur es yang lembut dengan tambahan topping seperti keju parut dan marshmallow. Setiap gigitan membawa kenangan manis dalam setiap sensasi rasanya.\"\n" +
                        "\n" +
                        "Ridwan, seorang food blogger terkenal, menulis di blognya, \"Es cokelat kenangan dari Banjarmasin telah mengubah konsep es cokelat tradisional menjadi sesuatu yang istimewa. Rasa cokelat yang mereka tawarkan begitu mendalam dan memuaskan, tanpa menjadi terlalu manis. Topping yang disajikan juga memberikan variasi tekstur yang menyenangkan. Saya benar-benar merekomendasikan untuk mencicipi es cokelat kenangan ini.\"\n" +
                        "\n" +
                        "Maria, seorang wisatawan yang berkunjung ke Banjarmasin, berkomentar, \"Saya sangat beruntung bisa menemukan es cokelat kenangan saat berada di kota ini. Rasanya begitu nikmat dan mengingatkan saya pada cokelat panas masa kecil saya. Tidak hanya itu, tempatnya yang nyaman dan desainnya yang menarik membuat pengalaman makan saya semakin lengkap. Es cokelat kenangan benar-benar memberikan 'kenangan' yang tak terlupakan.\"\n" +
                        "\n" +
                        "Rizki, seorang mahasiswa setempat, berbagi pengalamannya, \"Es cokelat kenangan adalah favorit saya di kota ini. Saya selalu kembali untuk mencicipi rasa cokelat yang autentik dan segarnya es yang mereka sajikan. Harganya juga terjangkau untuk ukuran porsi yang besar. Saya sudah merekomendasikan kepada teman-teman saya, dan mereka juga menyukainya!\"\n" +
                        "\n" +
                        "Indah, seorang ibu rumah tangga, mengatakan, \"Es cokelat kenangan adalah penyelamat di hari panas. Rasanya begitu memanjakan dan cocok untuk dinikmati bersama keluarga. Anak-anak saya juga sangat menyukainya. Saya senang melihat brand lokal seperti ini berkembang dengan baik di kota kita.\"\n" +
                        "\n" +
                        "Review-review di atas hanya sebagian kecil dari banyak testimoni positif yang diberikan oleh para pelanggan Es Cokelat Kenangan. Kesamaan yang dapat ditemukan dalam semua ulasan adalah pujian untuk rasa cokelat yang lezat, keunikan tekstur es, serta pengalaman yang menyenangkan ketika mengunjungi gerai mereka. Es Cokelat Kenangan benar-benar telah menciptakan sensasi yang manis dan menggugah kenangan dalam setiap gigitannya.\n" +
                        "\n" +
                        "Dengan kualitas produk yang konsisten dan perhatian mereka terhadap kepuasan pelanggan, Es Cokelat Kenangan terus menjadi favorit di kalangan masyarakat Banjarmasin. Brand ini memberikan pengalaman yang tak terlupakan dan membuktikan bahwa cita rasa lokal juga mampu bersaing dengan brand-brand internasional."),


        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CokelatAdapter(this,cokelatList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}