package TugasScanner;
/**
 *
 * @author RANGGA
 */
public class LatScannerrAksi {
    public static void main(String[] args) {
         LatScannerr scan = new LatScannerr();
      scan.inputScanner();
        System.out.println("\nPROGRAM NILAI MAHASISWA");
        System.out.println("=========================");
        System.out.println("Nim: " + scan.ambilnim());
        System.out.println("Nama: " + scan.ambilnama());
        System.out.println("Nilai Absen : "+ scan.absen());
        System.out.println("Nilai Tugas : " + scan.tugas());
        System.out.println("Nilai UTS : " + scan.utees());
        System.out.println("Nilai UAS : " + scan.uasges());
        System.out.println("=========================");
        System.out.println("Nilai Akhir: " + scan.rata());
        System.out.println("Passing Grade Anda : " + scan.getKet());
        System.out.println("Keterangan : " + scan.isLulus());
        
    }
}
