import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String level;
        String name;
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

        level = classifyLevel(xp);

        System.out.printf("The hero named %s is at the %s level.", name, level);

        sc.close();
    }

    public static String classifyLevel(int xp) {
        if (xp < 1000) {
            return "Iron";

        } else if (xp <= 2000) {
            return "Bronze";

        } else if (xp <= 5000) {
            return "Silver";

        } else if (xp <= 7000) {
            return "Gold";

        } else if (xp <= 8000) {
            return "Platinum";

        } else if (xp <= 9000) {
            return "Ascending";

        } else if (xp <= 10000) {
            return "Immortal";

        } else {
            return "Radiant";
        }
    }
}
