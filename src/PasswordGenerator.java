
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String name = scan.next();
        scan.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String surname = scan.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        String color = scan.next();

        
        System.out.println("La tua password è " + name + "-" + surname.replace(" ", "") + "-" + color);
    }
}
