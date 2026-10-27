import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        TablicaLiczbCalkowitych tab = new TablicaLiczbCalkowitych(5);
//        tab.TablicaWczytaj(sc);
//        tab.TablicaPrint();
//        Interfece.main(args);
//        Kalkulator.main(args);
//        int a = 0, b = 0;
//        System.out.println("Podaj dwie liczby calkowite dodatnich: ");
//        try{
//            a = sc.nextInt();
//            b = sc.nextInt();
//            if(a < 0 || b < 0){
//                System.out.println("Wprowadzone liczby musza byc dodatnie");
//                return;
//            }
//            System.out.println("Najwiekszy dzielnik dla liczb "+a+" "+b+" to: "+nwd(a,b));
//        } catch (InputMismatchException e){
//            System.out.println("Wprowqdzone dane musza byc liczbami clakowitymi");
//        }

        PESSEL p1 = new PESSEL("07272111773");
        System.out.println(p1.dateOfBirth());
    }

}