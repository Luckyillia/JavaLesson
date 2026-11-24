import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) {
        String daneTxt = loadNote(".\\src\\tekst.txt");
        saveToFile(daneTxt, ".\\src\\tekst-kopia.txt");
    }

    private static void saveToFile(String dane, String FILE_NAME) {
        FileOutputStream fos = null;

        try {
            // Otwórz strumień wyjściowy do pliku w pamięci wewnętrznej
            fos = new FileOutputStream(FILE_NAME);
            fos.write(dane.getBytes());

        }catch (FileNotFoundException e) {
                System.out.println(
                        "File not found: Ensure 'file1.txt' exists in the working directory.");
        }catch (IOException e) {
                System.out.println(
                        "An error occurred while reading the file: "
                                + e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static String loadNote(String FILE_NAME) {
        FileInputStream fis = null;
        String dane = "";
        int hashSymbol;
        try {
            // Otwórz strumień wejściowy z pliku w pamięci wewnętrznej
            fis = new FileInputStream(FILE_NAME);

            while ((hashSymbol = fis.read()) != -1) {
                dane += (char) hashSymbol;
                System.out.print((char) hashSymbol);
            }
            return dane;
        }catch (FileNotFoundException e) {
                System.out.println(
                        "File not found: Ensure 'file1.txt' exists in the working directory.");
        }catch (IOException e) {
                System.out.println(
                        "An error occurred while reading the file: "
                                + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return dane;
    }
}
