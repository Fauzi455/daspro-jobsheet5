import java.util.Scanner;
    public class PemilihanHariDenganIf16 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

int dayNumber;

System.out.print("Input a number: ");
dayNumber = sc.nextInt();

if (dayNumber >= 1 && dayNumber <= 5) {
    System.out.println(" Hari ini adalah Weekday");
} 
else if (dayNumber == 6 || dayNumber == 7) {
    System.out.println(" Hari ini adalah Weekend");
} 
else {
    System.out.println("Invalid Number");
}
}
}
    

    

