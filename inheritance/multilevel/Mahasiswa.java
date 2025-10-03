package inheritance.multilevel;

public class Mahasiswa extends Orang {
    public String nim;

    public void infoMahasiswa() {
        info(); // panggil method dari Orang
        System.out.println("NIM: " + this.nim);
    }
}
