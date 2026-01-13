import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, level;
        int xp;

        System.out.println(">>>|HERO LEVEL CLASSIFICATION SYSTEM|<<<");

        System.out.print("Hero's name: ");
        name = sc.nextLine();

        System.out.print("Amount of experience (XP): ");
        while (true) {
            if (sc.hasNextInt()) {
                xp = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid entry. Please enter only numbers!");
                System.out.print("Try again: ");
                sc.next();
            }
        }

        if (xp < 1000) {
            level = "Iron";

        } else if (xp <= 2000) {
            level = "Bronze";

        } else if (xp <= 5000) {
            level = "Silver";

        } else if (xp <= 7000) {
            level = "Gold";

        } else if (xp <= 8000) {
            level = "Platinum";

        } else if (xp <= 9000) {
            level = "Ascending";

        } else if (xp <= 10000) {
            level = "Immortal";

        } else {
            level = "Radiant";
        }

        System.out.printf(">>The hero named %s is at the %s level", name, level);

        sc.close();
    }
}
