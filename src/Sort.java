public class Sort {
    private int[] arr;
    public Sort(int n){
        arr = new int[n];
        arr = generateTab(arr);
        System.out.print("Tablica przed sortowaniem: ");
        printTab(arr);
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tab[i] < tab[j]){
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        System.out.print("Tablica po sortowaniu: ");
        printTab(tab);
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
