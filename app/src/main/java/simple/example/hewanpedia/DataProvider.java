package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Ulat;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ulat> initDataUlat(Context ctx) {
        List<Ulat> ulats = new ArrayList<>();
        ulats.add(new Ulat("The Cinnabar Moth Caterpillar", "Selandia Baru",
                "Ulat ini memiliki warna tubuh belang-belang yang berkombinasi antara jingga dan hitam. Ulat yang satu ini juga tergolong ulat yang rakus. Bahkan jika kehabisan bahan makanan, ia akan memakan sesamanya", R.drawable.ulat_1));
        ulats.add(new Ulat("The Gipsy Moth Caterpillar", "Eropa Dan Asia",
                "Bulu-bulu ulat ini menjulur keluar di sekujur tubuhnya. Ia memiliki bulu yang banyak dan panjang hanya di kepalanya. Uniknya, di badan ulat tersebut, hanya sedikit yang ditumbuhi bulu atau ditumbuhi namun hanya pendek.", R.drawable.ulat_2));
        ulats.add(new Ulat("The Puss Caterpillar", "Amerika Utara",
                "Ulat ini bisa melepaskan asam pada apa pun yang menyentuhnya. Tidak hanya itu, ulat ini juga sarat dengan duri beracun di seluruh tubuhnya. Gejala dari sengatan ulat ini bisa bertahan beberapa hari termasuk sakit kepala hebat, mual, dan muntah. Karena itu, hati-hatilah dengan ulat yang seringkali dijumpai di pohon jeruk, elm, dan ek ini.", R.drawable.ulat_3));
        ulats.add(new Ulat("The Stinging Rose Caterpillar", "Amerika Utara Dan Eropa",
                "Tampilan ulat ini yakni kombinasi warna merah yang dominan, kuning, garis-garis tipis hitam dan putih, ditambah warna hijau yang cantik pada sepuluh batang yang menjulur bagai antena di tubuh ulat ini.", R.drawable.ulat_4));
        ulats.add(new Ulat("The Hickory Tussock Caterpillar", "Amerika Utara",
                "Ulat bulu ini memiliki racun yang akan berlangsung dan bekerja dengan cepat ketika terjadi kontak antara kulit kalian dengan rambut atau duri dari ulat ini. Racun ulat ini akan menyebabkan ruam kulit atau hipersensitivitas pada jaringan kulit kalian", R.drawable.ulat_5));
        ulats.add(new Ulat("The Io Moth Caterpillar", "Amerika Utara",
                "Sekujur tubuh ulat ini penuh dengan pigmen warna hijau. Ulat ini juga termasuk dalam daftar ulat berbahaya. Ulat tersebut memiliki dua jenis racun yang dilepaskan dari punggung ulat. Racun itu mengakibatkan rasa terbakar dan peradangan yang luar biasa.", R.drawable.ulat_6));
        return ulats;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataUlat(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
