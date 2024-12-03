import java.util.ArrayList;

public class Klub {
    private String namaKlub;
    private Pelatih pelatih;
    private ArrayList<Anggota> anggotaList;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }

    public String getnamaKlub() {
        return namaKlub;
    }

    public void setPelatih(Pelatih pelatih) {
        this.pelatih = pelatih;
    }

    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    public void tampilkanKlub() {
        System.out.println("\nKlub: " + namaKlub);
        if (pelatih != null) {
            System.out.println("Pelatih:");
            pelatih.displayInfo();
        } else {
            System.out.println("Pelatih belum ditentukan.");
        }
        System.out.println("Daftar Anggota:");
        for (int i = 0; i < anggotaList.size(); i++) {
            System.out.print((i + 1) + ". ");
            anggotaList.get(i).displayInfo();
        }
    }
}
