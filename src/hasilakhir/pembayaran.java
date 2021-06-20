package hasilakhir;

import daftarwarungmasakan.DaftarNamaHarga;
import model.WarungMasakanBanjar;

public class pembayaran {
    public static void main(String []args) {

        WarungMasakanBanjar k = new WarungMasakanBanjar();
        k.nama ="Nova Kumala Sari";
        k.npm="19630022";
        k.kelas="4C REGULER PAGI BANJARBARU";
        k.kasir();

        WarungMasakanBanjar mb = new WarungMasakanBanjar();
        mb.nk ="Rp.12.000";
        mb.nb = "Rp.8000";
        mb.nkh="Rp.18.000";
        mb.na="Rp.12.000";
        mb.nc="Rp.17.000";
        mb.hargamakanan();

        WarungMasakanBanjar hm = new WarungMasakanBanjar();
        hm.mh ="Rp.2.000";
        hm.me = "Rp.3000";
        hm.mj="Rp.5.000";
        hm.mk="Rp.8.000";
        hm.mn="Rp.5.000";
        mb.hargaminuman();

        WarungMasakanBanjar wd = new WarungMasakanBanjar();
        wd.wbt ="Rp.20.000";
        wd.wk = "Rp.12.000";
        wd.wps="Rp.15.000";
        wd.wk="Rp.10.000";
        wd.wd="Rp.3.000";
        wd.hargawadai();

        DaftarNamaHarga bn = new DaftarNamaHarga();
        bn.bonus ="MASKER";
        bn.bns();

        DaftarNamaHarga tk = new DaftarNamaHarga();
        tk.total ="Rp.37.000";
        tk.bayar="Rp.50.000";
        tk.kembalian="Rp.13.000";
        tk.akhir();
    }
}
