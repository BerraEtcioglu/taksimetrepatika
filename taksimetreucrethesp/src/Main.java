import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double ucret;
        int minücret=20;

               Scanner input = new Scanner(System.in);
               System.out.print("Kaç kilometre gittiğinizi giriniz : ");
               km= input.nextInt();
               ucret=10+(km*2.2);
               System.out.print("Ödemeniz gereken ücret" + (ucret>20?ucret:minücret));


    }
}


//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.