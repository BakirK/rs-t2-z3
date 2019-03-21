import java.util.Scanner;
public class Treci {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        String recenica = new String();
        String najduza_rijec = new String("");
        recenica = ulaz.nextLine();
        int index;
        for (String rijec: recenica.split(" ") ) {
            if (rijec.length() > najduza_rijec.length()) {
                najduza_rijec = rijec;
                index = recenica.indexOf(najduza_rijec);
            }
        }


        for (String rijec: recenica.split(" ")) {
            if (rijec.equals(najduza_rijec)) {
                System.out.print(rijec.toUpperCase());
            } else {
                System.out.print(rijec);
            }
            System.out.print(" ");
        }

        //System.out.println("Najduza rijec je: " + najduza_rijec);


    }
}
