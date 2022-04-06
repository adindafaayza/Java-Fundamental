public class Barang {
    String kode_barang;
    String nama_barang;
    private final int stok;

    public int getStok() {
        return stok;
    }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk+20;
    }
}