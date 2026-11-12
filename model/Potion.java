package model;



public class Potion extends LelangItem {
    private int hpRestore;
    private int manaRestore;

    public Potion(String nama, int totalUnit, double totalHarga, int hpRestore, int manaRestore) {
        super(nama, totalUnit, totalHarga);
        this.hpRestore = hpRestore;
        this.manaRestore = manaRestore;
    }

    @Override
    public String getKategori() {
        return "Potion";
    }

    public int getHpRestore() { return hpRestore; }
    public int getManaRestore() { return manaRestore; }
}