package model;

public class WarungMasakanBanjar {
    public String nama;
    public String npm;
    public String kelas;
    public String nk;
    public String nb;
    public String nkh;
    public String na;
    public String nc;
    public String mh;
    public String me;
    public String mj;
    public String mk;
    public String mn;
    public String wbt;
    public String wk;
    public String wd;
    public String wps;
    public String wa;

    public void kasir () {
        System.out.println("***************** KASIR PEMBAYARAN *****************");
        System.out.println("Nama " + nama);
        System.out.println("NPM " + npm);
        System.out.println("Kelas " + kelas);
    }
    public void hargamakanan () {
        System.out.println("***************** HARGA MAKANAN BANJAR *****************");
        System.out.println("Nasi Kuning" + nk);
        System.out.println("Nasi Masak Bastik" + nb);
        System.out.println("Nasi Masak Karih" + nkh);
        System.out.println("Nasi Sop Ayam" + na);
        System.out.println("Nasi Campur" + nc);
    }

    public void hargaminuman () {
        System.out.println("***************** HARGA MINUMAN *****************");
        System.out.println("Teh Hangat/Panas " + mh);
        System.out.println("Teh Es " + me);
        System.out.println("Es Jeruk " + mj);
        System.out.println("Kopi " + mk);
        System.out.println("Es Nyiur " + mn);
    }

    public void hargawadai () {
        System.out.println("***************** HARGA WADAI KHAS BANJAR *****************");
        System.out.println("Bingka Tapai" + wbt);
        System.out.println("Klepon " + wk);
        System.out.println("Pais Sagu " + wps);
        System.out.println("Apam" + wa);
        System.out.println("Dodol" + wd);
    }

}