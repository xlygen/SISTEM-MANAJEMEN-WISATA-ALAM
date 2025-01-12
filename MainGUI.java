
public class MainGUI {
    private static List<Pengunjung> pengunjungList = new ArrayList<>();//agregasi
    private static List<Pemandu> pemanduList = new ArrayList<>();  //agregsi
    private static LaporanPendapatan lpd = new LaporanPendapatan();
    private static List<zonaWisata> zonaList = new ArrayList<>();//agregasi
    private static Fasilitas fasilitas = new Fasilitas() {
        @Override
        public String getLayanan() {
            return "";
        }
    };
