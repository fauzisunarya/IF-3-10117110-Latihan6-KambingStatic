
package pkgif.pkg3.pkg10117110.latihan6.kambingstatic;

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program penggabungan dua buah
 * class
 */

public class IF310117110Latihan6KambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memiliki Kambing sebanyak " + 
                            Mamalia.jumlahKambing);
    }
    
}
