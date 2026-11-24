package KGebicz;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchWithSentinel {
    private int[] arr;
    private Scanner sc;
    public SearchWithSentinel(int n, Scanner sc){
        this.sc = sc;
        arr = new int[n];
        arr = generateTab(arr);
        System.out.print("Tablica przed sortowaniem: ");
        printTab(arr);
        try {
            System.out.print("Podaj liczbe szukana: ");
            int searchNum = this.sc.nextInt();
            int indexSearchNum =searchWithSentinel(arr,searchNum);
            if(indexSearchNum == -1){
                System.out.println("Szukana liczba jest pod indexem: Nie znaleziono liczby");
            }else{
                System.out.println("Szukana liczba jest pod indexem: " + indexSearchNum);
            }


        }catch (InputMismatchException e){
            System.out.println("Liczba musi byc liczba calkowita");
        }
    }
    public static int searchWithSentinel(int[] tab, int searchNum){
        int sentinel = -1;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == searchNum){
                sentinel = i;
                return sentinel;
            }
        }
        return sentinel;
    }
    public static void printTab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if(i != (tab.length-1)){
                System.out.print(tab[i]+", ");
            }else {
                System.out.println(tab[i]);
            }
        }
    }
    public int[] generateTab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            tab[i] =  (int)(Math.random() * 100) + 1;
        }
        return tab;
    }
}