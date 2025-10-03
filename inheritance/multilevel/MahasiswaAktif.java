package inheritance.multilevel;

public class MahasiswaAktif extends Mahasiswa {
    public int semester;

    public void infoMahasiswaAktif() {
        infoMahasiswa(); // panggil method dari Mahasiswa
        System.out.println("Semester: " + this.semester);
    }
}
