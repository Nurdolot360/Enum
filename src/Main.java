import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Raspisanie rki = Raspisanie.valueOf(scanner.nextLine().toUpperCase());
        switch (rki) {
            case PANIDELNIK -> System.out.println(Raspisanie.PANIDELNIK);
            case FTORNIK -> System.out.println(Raspisanie.FTORNIK);
            case CREDA -> System.out.println(Raspisanie.CREDA);
            case CHETVERT -> System.out.println(Raspisanie.CHETVERT);
            case PIATNISA -> System.out.println(Raspisanie.PIATNISA);
            case SUBOTA -> System.out.println(Raspisanie.SUBOTA);
            case VOSKRESENIE -> System.out.println(Raspisanie.VOSKRESENIE);
        }


    }
}