public class PESSEL {
    private String Pesel;

    public PESSEL(String PESSEL) {
        if(PESSEL.length() != 11){
            throw new RuntimeException("Niepoprawna dlugosc");
        }
        if(PESSEL.matches("^[0-9]$")){
            throw new RuntimeException("PESSEL nie moze zawierac nic oprocz liczb");
        };
        if(!czyPoprawnyPessel(PESSEL)){
            throw new RuntimeException("Niepoprawna suma kontrolna");
        }
        this.Pesel = PESSEL;
    }
    private static boolean czyPoprawnyPessel(String PESSEL){
        if(PESSEL.length() != 11){
            return false;
        }
        if(PESSEL.matches("^[0-9]$")){
            return false;
        };
        int[] tabLiczb = new int[11];
        for (int i = 0; i < PESSEL.length(); i++) {
            tabLiczb[i] = PESSEL.charAt(i)-'0';
        }
        int suma =
                tabLiczb[0] +
                tabLiczb[1] * 3 +
                tabLiczb[2] * 7 +
                tabLiczb[3] * 9 +
                tabLiczb[4] +
                tabLiczb[5] * 3 +
                tabLiczb[6] * 7 +
                tabLiczb[7] * 9 +
                tabLiczb[8]+
                tabLiczb[9] * 3;
        suma = suma % 10;
        suma = 10 - suma;
        if(suma == tabLiczb[10]) {
            return true;
        }else{
            return false;
        }
    }

    public String dateOfBirth (){
        String yearStr = "", monthStr = "", dayStr = "", dateOFBirthStr;
        for (int i = 0; i < Pesel.length(); i++) {
            if(i == 0 || i == 1) yearStr += Pesel.charAt(i);
            if(i == 2 || i == 3) monthStr += Pesel.charAt(i);
            if(i == 4 || i == 5) dayStr += Pesel.charAt(i);
        }
        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);
        if(month > 80){
            month -= 80;
            year += 1800;
        } else if(month > 60){
            month -= 60;
            year += 2200;
        } else if(month > 40){
            month -= 40;
            year += 2100;
        } else if(month > 20){
            month -= 20;
            year += 2000;
        }else{
            year += 1900;
        }
        dateOFBirthStr = day+"."+month+"."+year;
        return dateOFBirthStr;
    }
}
