package model;

public abstract class LelangItem {
    private String nama;
    private int totalUnit;
    private double totalHarga;

    public LelangItem(String nama, int totalUnit, double totalHarga) {
        this.nama = nama;
        this.totalUnit = totalUnit;
        this.totalHarga = totalHarga;
    }

    public String getNama() { return nama; }
    public int getTotalUnit() { return totalUnit; }
    public double getTotalHarga() { return totalHarga; }

    public double getHargaSatuan() {
        if (totalUnit == 0) return 0;
        return totalHarga / totalUnit;
    }

    public abstract String getKategori();
}