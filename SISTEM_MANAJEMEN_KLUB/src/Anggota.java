public class Anggota extends Person {
    private String posisi;

    public Anggota(String nama, int umur, String posisi) {
        super(nama, umur);
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Posisi: " + posisi);
    }
}