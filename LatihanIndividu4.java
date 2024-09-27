import java.util.Scanner;
    public class LatihanIndividu4 {

     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
byte umur;
String kategori = "";

System.out.print("Masukkan umur: ");
umur = sc.nextByte();

if (umur <=13) {
kategori = "Anak";
}
else if (umur <=19) {
kategori = "Remaja";
}
else if (umur <=64) {
kategori = "Dewasa";
}
else if (umur >=65) {
kategori = "Lansia";   
}

System.out.println("Jika umur anda " + umur + " maka anda masuk dalam kategori " + kategori);
}  
}
