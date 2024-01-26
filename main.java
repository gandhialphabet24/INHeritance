package inheritance;

public class main {
    public static void main(String[] args) {
        
        // membuat object bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //membuat object persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        //membuat object lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        //membuat object persegi panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        //membuat object segitiga dan mengisi nilai properti
        Segitiga msegitiga = new Segitiga();
        msegitiga.alas = 12;
        msegitiga.tinggi = 8;

        //memanggil method luas dan keliling 
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.luas();

        msegitiga.luas();
        msegitiga.luas();
    }

}
