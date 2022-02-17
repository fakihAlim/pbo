package classstring;
import java.util.Random;
import java.util.Scanner;
public class ClassRandom {
public static void nilaiAcak(){
    Random acak = new Random();
//    int nilaiacak = acak.nextInt();
//    System.out.println("nilai acak yg dibuat: "+nilaiacak);

//double nilaiD = acak.nextDouble();
//    System.out.println("Nilai acak tipe double: "+nilaiD);
//int nilaiacaklagi = acak.nextInt(10);
//    System.out.println("nilai acak max(10): "+nilaiacaklagi);
//
//int nilaiAcakTertentu = acak.nextInt(6) + 5;
//    System.out.println("nilai acak dari 5-10: "+nilaiAcakTertentu);

//Scanner numberScanner = new Scanner(System.in);
//System.out.print("Enter a number between 1 and 10: ");
//int userNum = numberScanner.nextInt();
//Random rnd = new Random();
//int winningNum = rnd.nextInt(10) + 1;
//System.out.println("Your Number: " + userNum);
//System.out.println("The winning number is: " + winningNum);
//if (userNum == winningNum){
//    System.out.println("SELAMAT ANDA MENANG!!!!");
//} else {
//    System.out.println("Anda belum beruntung... Silahkan coba lagi");
//}

Random rand = new Random(20L);
System.out.println("Random Number 1: " + rand.nextInt(100));
System.out.println("Random Number 2: " + rand.nextInt(100));
System.out.println("Random Number 3: " + rand.nextInt(100));
System.out.println("Changing seed to change to sequence");
rand.setSeed(5L);
System.out.println("Random Number 4: " + rand.nextInt(100));
System.out.println("Random Number 5:  " + rand.nextInt(100));
System.out.println("Nomor Acak 6: "+ rand.nextInt(100));
System.out.println("Setting seed 20 produce previous sequence");
rand.setSeed(20L);
System.out.println("Random Number 7: " + rand.nextInt(100));
System.out.println("Random Number 8: " + rand.nextInt(100));
System.out.println("Random Number 9: " + rand.nextInt(100));
rand.setSeed(5L);
System.out.println("Random Number 10: " + rand.nextInt(100));
System.out.println("Random Number 11:  " + rand.nextInt(100));
System.out.println("Nomor Acak 12: "+ rand.nextInt(100));

}    
}
