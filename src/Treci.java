import java.util.Scanner;
public class Treci {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        String recenica = new String();
        String najduza_rijec = new String("");
        recenica = ulaz.nextLine();
        for (String rijec: recenica.split(" ") ) {
            if (rijec.length() > najduza_rijec.length()) {
                najduza_rijec = rijec;
            }
        }
        System.out.println("Najduza rijec je: " + najduza_rijec);


    }
}
