package classstring;
public class ClassString {
    public static void main(String[] args) {
        String nama = "Yodi keren";
//        int panjangNama = nama.length();
//        System.out.println("Panjang Karakter nama: "+panjangNama); //9
//
// methode indexOf -> untuk mencari nomor index pada suatu karakter
//        String ind = "belajar.pbo 123";
//        int idx1 = ind.indexOf('a');
//        System.out.println("nomor index huruf a: "+idx1);// hasilnya = 3
//        int idx2 = ind.indexOf('1',5);  
//        System.out.println("titik dari index ke 4: "+idx2);// hasilnya = 12
//
// methode charAt() -> untuk menampilkan isi dari karakter index yg dimasukkan
//        char hurufnya = nama.charAt(7);
//        System.out.println("isi dari karakter index ke3: "+hurufnya);
//
// methode substring() -> untuk mengahsilkan substring (bagian kata) dari sebuah string
//        String tampung = nama.substring(5);
//        System.out.println("isi dari substring idx no 5 hingga selesai: "+tampung); //keren
//        String tampung2 = nama.substring(0, 3);
//        System.out.println("isi dari substring idx no 0 hingga 3: "+ tampung2);//yod -> idx no 3 tidak termasuk
//
//// methode replace() -> untuk mengganti string tertentu dalam sebuah kata
//        String ganti = nama.replace('e', 'E');
//        System.out.println("Hasil ganti huruf: "+ganti);// Yodi KErEn
//          String ganti2 = nama.replace("keren", "Keren Sekali Lho!");
//          System.out.println("Hasil ganti pattern: "+ganti2); //Yodi Keren Sekali Lho!

//        String namaSaya = "yodi"+"keren"+"sekali";
//        System.out.println("isi nama saya: "+namaSaya);
//        String satu = "satu1 ", dua = "dua2 ", tiga = "tiga3 ";
//        String gabungan = "ini gabungan ";
//        gabungan = gabungan.concat(satu+dua+tiga);
//        System.out.println("isi gabungan: "+gabungan);
//
//        int nilaiPerbandingan = "kere".compareTo("keren");
//        System.out.println("nilai perbandingan: "+nilaiPerbandingan);
// 
// coba methode equals
//        String namaku = "yodi", namaSaya = "yodi";
//        boolean hasilPerbandingan = namaku.equals(namaSaya);
//        System.out.println("hasil perbandingan nama: "+hasilPerbandingan);

//ClassRandom rd = new ClassRandom();
//rd.nilaiAcak();

ClassMath cm = new ClassMath();
cm.classMath();


    }
    
}
