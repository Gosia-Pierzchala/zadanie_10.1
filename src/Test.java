import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try{
        System.out.println("Podaj imię:");
        String imie = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko = scan.nextLine();
        System.out.println("Podaj wiek:");
        int wiek = scan.nextInt();
        scan.nextLine();
        System.out.println("Podaj pesel:");
        String pesel = scan.nextLine();
        scan.close();

        Person person = new Person(imie, nazwisko, wiek, pesel);
        System.out.println(person.toString());
        } catch (NameUndefinedException | IncorrectAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
