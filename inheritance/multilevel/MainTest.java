package inheritance.multilevel;

public class MainTest {
    public static void main(String[] args) {
        MahasiswaAktif mhs1 = new MahasiswaAktif();
        mhs1.nama = "Rafly";
        mhs1.usia = 20;
        mhs1.nim = "12345678";
        mhs1.semester = 5;

        mhs1.infoMahasiswaAktif(); 
    }
}
