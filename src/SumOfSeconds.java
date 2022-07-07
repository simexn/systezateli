import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("1vi");
        int racer1 = Integer.parseInt(reader.nextLine());
        System.out.println("2ri:");
        int racer2 = Integer.parseInt(reader.nextLine());
        System.out.println("3ti:");
        int racer3 = Integer.parseInt(reader.nextLine());


        while ((racer1 < 0 || racer1 > 50) || (racer2 < 0 || racer2 > 50) || (racer3 < 0 || racer3 > 50)) {

            if (racer1 > 50 || racer2 > 50 || racer3 > 50) {
                System.out.println("Nqkoy mnogo se e zabavil!");
            }

            System.out.println("1vi");
            racer1 = Integer.parseInt(reader.nextLine());
            System.out.println("2ri");
            racer2 = Integer.parseInt(reader.nextLine());
            System.out.println("3ti");
            racer3 = Integer.parseInt(reader.nextLine());

        }
        int saCombined = racer1 + racer2 + racer3;

        if (saCombined % 60 < 10) {
            System.out.println("Obshto vreme: " + saCombined / 60 + ":0" + saCombined % 60);
        } else {
            System.out.println("Obshto vreme: " + saCombined / 60 + ":5" + saCombined % 60);
        }
    }
}