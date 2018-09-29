import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

   int smart = (int )(Math.random() * 52)+10;
        if (smart >30)
            smart=30;
   int leftover = 30-smart;
   int agility = (int )(Math.random() * leftover)+10;
   int str = 50-smart-agility;
    System.out.print("Your Agility Level is ");
    System.out.println(agility);
    System.out.print("Your Intelligence Level is ");
    System.out.println(smart);
    System.out.print("Your Strength Level is ");
    System.out.println(str);
    System.out.println(" ");
    double basedamage =5*smart;
    Random rand = new Random();
    double moddam = 0;
    double Totdam = 0;
    int Healthbar =1000;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 1st Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 2nd Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 3rd Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 4th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 5th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 6th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 7th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 8th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 9th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;
        moddam = 0.5+1*rand.nextDouble();
        Totdam = Math.round(moddam*basedamage);
        System.out.println("Your 10th Magic Missile Spell did " + Totdam + " damage!");
        Healthbar -=Totdam;

        System.out.println("\nThe Orc was left with, "+Healthbar+" Health\n");
        if (Healthbar <= 0)
            System.out.println("You have defeated the Orc!");
            else
            System.out.println("You have been vanquished");
            System.out.println(" - The intelligence level must be at least 19 in order to achieve a 60-70% win rate with a modifier of 0.5-1.5.\n" +
                    " - The base damage of the Magic Missile Spell must be at least level 10 to have a 60-70% win rate.\n" +
                    " - Out of 10 trials, 7 defeated the Orc.");
    }
}
