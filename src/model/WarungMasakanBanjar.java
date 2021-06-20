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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNk() {
        return nk;
    }

    public void setNk(String nk) {
        this.nk = nk;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }

    public String getNkh() {
        return nkh;
    }

    public void setNkh(String nkh) {
        this.nkh = nkh;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getMh() {
        return mh;
    }

    public void setMh(String mh) {
        this.mh = mh;
    }

    public String getMe() {
        return me;
    }

    public void setMe(String me) {
        this.me = me;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getWbt() {
        return wbt;
    }

    public void setWbt(String wbt) {
        this.wbt = wbt;
    }

    public String getWk() {
        return wk;
    }

    public void setWk(String wk) {
        this.wk = wk;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getWps() {
        return wps;
    }

    public void setWps(String wps) {
        this.wps = wps;
    }

    public String getWa() {
        return wa;
    }

    public void setWa(String wa) {
        this.wa = wa;
    }

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

    //constructor
    public WarungMasakanBanjar() {
        this.nama = "Nova Kumala Sari";
        this.npm = "19630022";
        this.kelas = "4C TI REG PAGI BANJARBARU";
    }
}


