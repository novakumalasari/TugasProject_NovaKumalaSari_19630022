package daftarwarungmasakan;

import model.WarungMasakanBanjar;

public class DaftarNamaHarga extends WarungMasakanBanjar {
    public String bayar, total, bonus, kembalian;

    public void bns () {
        System.out.println("Dikarenakan belanja diatas Rp. 30.000 anda mendapatkan FREE  : "+bonus );

    }
    public void akhir () {
        System.out.println("Total Harga : "+total);
        System.out.println("Bayar : "+bayar);
        System.out.println("Kembalian : "+kembalian);
    }
}
