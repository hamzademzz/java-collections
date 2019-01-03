package JavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {

        List<SuperHeroes> csvFileReader = new ArrayList<SuperHeroes>();
        SuperHeroes heroes = new SuperHeroes();

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
                    i++;
                }
                input.close();
            }


        }
        catch (NumberFormatException exp) {

        }
        List<Integer> heights = new ArrayList<Integer>();
        for(int i=0; i<csvFileReader.size(); i++){
            heights.add(csvFileReader.get(i).getHeight());
        }


        Collections.sort(heights);
        Collections.reverse(heights);

        List<Integer> topScores = new ArrayList<Integer>();
        for(int i=0; i<5; i++){
            topScores.add(heights.get(i));
        }


        List<Integer> heights2= new ArrayList<Integer>();
        for(int i=0; i<csvFileReader.size(); i++){
            heights2.add(csvFileReader.get(i).getHeight());
        }

        for(int i=0; i<5; i++){
            System.out.println("Pseudonym " + csvFileReader.get(heights2.indexOf(topScores.get(i))).getPseudonym() +" (" + csvFileReader.get(heights2.indexOf(topScores.get(i))).getRealName()+ ")," + " Height = " + topScores.get(i) +" centimetres");

        }


        System.out.println("");

        List<Integer> strenthRatings = new ArrayList<Integer>();
        for(int i=0; i<csvFileReader.size(); i++){
            strenthRatings.add(csvFileReader.get(i).getStrengthRating());
        }



        Collections.sort(strenthRatings);



        List<Integer> lowScores = new ArrayList<Integer>();
        for(int i=0; i<5; i++){
            lowScores.add(strenthRatings.get(i));
        }


        List<Integer> strenthRatings2= new ArrayList<Integer>();
        for(int i=0; i<csvFileReader.size(); i++){
            strenthRatings2.add(csvFileReader.get(i).getStrengthRating());
        }


        for(int i=0; i<5; i++){
            System.out.println("Pseudonym " + csvFileReader.get(strenthRatings2.indexOf(lowScores.get(i))).getPseudonym() +" (" + csvFileReader.get(strenthRatings2.indexOf(lowScores.get(i))).getRealName()+ ")," + " Strength Rating = " + lowScores.get(i));
        }



    }

}


