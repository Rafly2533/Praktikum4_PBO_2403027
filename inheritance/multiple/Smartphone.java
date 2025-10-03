package inheritance.multiple;

public class Smartphone implements AlatKomunikasi, AlatHiburan {
    private String merek;

    public Smartphone(String merek) {
        this.merek = merek;
    }

    @Override
    public void telepon(String nomor) {
        System.out.println(merek + " sedang menelpon ke nomor " + nomor);
    }

    @Override
    public void mainGame(String namaGame) {
        System.out.println(merek + " sedang memainkan game " + namaGame);
    }

    public void info() {
        System.out.println("Smartphone merek " + merek);
    }
}
