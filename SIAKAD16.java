import java.util.Scanner;

    public class SIAKAD16 {
    public static void main(String[] args) {
        

Scanner sc = new Scanner(System.in);

String nama, nim, kelas, kualifikasi = "", huruf = "";
byte absen;
double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

System.out.print("Masukkan nama: ");
nama = sc.nextLine();
System.out.print("Masukkan NIM: ");
nim = sc.nextLine();
System.out.print("Masukkan kelas: ");
kelas = sc.nextLine();
System.out.print("Masukkan nomor absen: ");
absen = sc.nextByte();

System.out.print("Masukkan nilai kuis: ");
nilaiKuis = sc.nextDouble();
System.out.print("Masukkan nilai tugas: ");
nilaiTugas = sc.nextDouble();
System.out.print("Masukkan nilai Ujian: ");
nilaiUjian = sc.nextDouble();

nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

if (nilaiAkhir>80) {
kualifikasi = "Sangat baik";
huruf = "A";
}
else if (nilaiAkhir>73){
kualifikasi = "Lebih dari baik";
huruf = "B+";
}
else if (nilaiAkhir>65) {
kualifikasi = "Baik";
huruf = "B";
}
else if (nilaiAkhir>60) {
kualifikasi = "Lebih dari cukup";
huruf = "C+";
}
else if (nilaiAkhir>50) {
kualifikasi = "Cukup";
huruf = "C";
}
else if (nilaiAkhir>39) {
kualifikasi = "Kurang";
huruf = "D";
}
else if (nilaiAkhir<39) {
kualifikasi = "Gagal";
huruf = "E";
}

System.out.println("Mahasiswa dengan nama " + nama + " NIM " + nim + " kelas " + kelas + " no absen " + absen);
System.out.println("Nilai Akhir: " + nilaiAkhir);
System.out.println("Nilai akhir huruf: " + huruf);
System.out.println("Kualifikasi: " + kualifikasi);
    }
}
