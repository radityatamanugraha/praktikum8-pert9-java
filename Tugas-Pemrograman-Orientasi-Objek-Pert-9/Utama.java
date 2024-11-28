abstract class BangunDatar {
    String warna;

    public abstract void gambar();
    public abstract float luas();
}

class Lingkaran extends BangunDatar {
    private int r; 

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar Lingkaran dengan jari-jari: " + r);
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
}

class Segitiga extends BangunDatar {
    private int alas, tinggi; 

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar Segitiga dengan alas: " + alas + " dan tinggi: " + tinggi);
    }

    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }
}

class Persegi extends BangunDatar {
    private float panjang, lebar; 

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar Persegi dengan panjang: " + panjang + " dan lebar: " + lebar);
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }
}

public class Utama {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(10, 5);
        BangunDatar persegi = new Persegi(4, 6);

        lingkaran.gambar();
        System.out.println("Luas Lingkaran: " + lingkaran.luas());

        segitiga.gambar();
        System.out.println("Luas Segitiga: " + segitiga.luas());

        persegi.gambar();
        System.out.println("Luas Persegi: " + persegi.luas());
    }
}
