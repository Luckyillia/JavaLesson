import java.util.Scanner;

public class TablicaLiczbCalkowitych {
    int size;
    int[] tab;
    public TablicaLiczbCalkowitych(int len) {
        size = len;
        tab = new int[len];
    }

    public void TablicaPrint() {
        System.out.print("Tablica liczb calkowitych: ");
        for (int i = 0; i < size; i++) {
            if(i == size-1){
                System.out.println(tab[i]);
            }else{
                System.out.print(tab[i]+", ");
            }
        }
    }

    public void TablicaWczytaj(Scanner sc) {
        for (int i = 0; i < size; i++) {
            System.out.print("Podaj liczbe do "+i+" elementa tablicy: ");
            int a = sc.nextInt();
            tab[i] = a;
        }
    }
}
