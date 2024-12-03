public class Pelatih extends Person {
    private String spesialisasi;

    public Pelatih(String nama, int umur, String spesialisasi) {
        super(nama, umur);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Spesialisasi: " + spesialisasi);
    }
}