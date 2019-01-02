package JavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        //SuperHeroes heroes = new SuperHeroes();
        List<SuperHeroes> csvFileReader = new ArrayList<SuperHeroes>();
        SuperHeroes hero = new SuperHeroes();

        String pseudonym, realName, description;
        int height, intelligenceRating, strengthRating, speedRating, agilityRating, fightingSkillsRating;

        File file = new File("/Users/hamzademzz/Desktop/superheroes.txt");
        Scanner sc = new Scanner(file);

        try {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();

                Scanner input = new Scanner(nextLine);
                input.useDelimiter(":");

                while (input.hasNext()) {
                    int i = 0;
                    pseudonym = input.next();

                    height = Integer.parseInt(input.next());
                    intelligenceRating = Integer.parseInt(input.next());
                    strengthRating = Integer.parseInt(input.next());
                    speedRating = Integer.parseInt(input.next());
                    agilityRating = Integer.parseInt(input.next());
                    fightingSkillsRating = Integer.parseInt(input.next());
                    realName = input.next();
                    description = input.next();

                    csvFileReader.add(i, new SuperHeroes(pseudonym, height, intelligenceRating, strengthRating, speedRating, agilityRating, fightingSkillsRating, realName, description));
                    System.out.println(csvFileReader.size());
                    i++;
                }
                input.close();


            }
            System.out.println(csvFileReader.size());
        } catch (NumberFormatException exp) {

        }



        System.out.println(csvFileReader.get(0));

    }

}
