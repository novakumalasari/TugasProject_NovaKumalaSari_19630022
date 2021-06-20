package daftarwarungmasakan;

import model.WarungMasakanBanjar;

public class DaftarNamaHarga extends WarungMasakanBanjar {
    public String bayar, total, bonus, kembalian;

    @Override
    public void hargamakanan() {
        super.hargamakanan();
    }

    @Override
    public void hargaminuman() {
        super.hargaminuman();
    }

    public String getBayar() {
        return bayar;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getKembalian() {
        return kembalian;
    }

    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    }

    public void bns () {
        System.out.println("Dikarenakan belanja diatas Rp. 30.000 anda mendapatkan FREE  : "+bonus );

    }
    public void akhir () {
        System.out.println("Total Harga : "+total);
        System.out.println("Bayar : "+bayar);
        System.out.println("Kembalian : "+kembalian);
    }
}
