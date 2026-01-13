import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {

        String name;
        String level = "";
        int xp;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hero's name: ");
        name = sc.nextLine();

        System.out.print("Amount of experience (XP): ");
        xp = sc.nextInt();

        if (xp < 1000) {
            level = "Iron";

        } else if (xp >= 1001 && xp <= 2000) {
            level = "Bronze";

        } else if (xp >= 2001 && xp <= 5000) {
            level = "Silver";

        } else if (xp >= 5001 && xp <= 7000) {
            level = "Gold";

        } else if (xp >= 7001 && xp <= 8000) {
            level = "Platinum";

        } else if (xp >= 8001 && xp <= 9000) {
            level = "Ascending";

        } else if (xp >= 9001 && xp <= 10000) {
            level = "Immortal";

        } else if (xp >= 10001) {
            level = "Radiant";
        }

        System.out.printf("The hero named %s is at the %s level", name, level);
    }
}
