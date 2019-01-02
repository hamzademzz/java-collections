package JavaAssignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task1 {


    public static void main(String[] args) {
        SuperHeroes heroes = new SuperHeroes();

        File file = new File("/Users/hamzademzz/Desktop/superheroes.txt");
        Scanner input = null;



        try{
            input = new Scanner(file);
            while (input.hasNextLine()){
                String nextLine = input.nextLine();
                parse(nextLine);

            }

        }
        catch(IOException exp){
            //what is this for?
            exp.printStackTrace();
        }



    }


    public static void parse(String string){
        List<SuperHeroes> csvFileReader = new ArrayList<SuperHeroes>();


        String pseudonym, realName , description;
        int height, intelligenceRating, strengthRating, speedRating, agilityRating, fightingSkillsRating;
        Scanner input = new Scanner(string);
        input.useDelimiter(":");


        while(input.hasNext()){
            pseudonym = input.next();

            height = Integer.parseInt(input.next());
            intelligenceRating = Integer.parseInt(input.next());
            strengthRating = Integer.parseInt(input.next());
            speedRating = Integer.parseInt(input.next());
            agilityRating = Integer.parseInt(input.next());
            fightingSkillsRating = Integer.parseInt(input.next());
            realName = input.next();
            description= input.next();

            csvFileReader.add(new SuperHeroes(pseudonym,height,intelligenceRating,strengthRating,speedRating,agilityRating,fightingSkillsRating,
                    realName,description));

            /*
            System.out.println("Pseudonym = " + pseudonym + " Height = "+ height + " Intelligence rating = " + intelligenceRating +
                    " Strength rating = "+ strengthRating + " Speed rating = " + speedRating + " Agility rating" + agilityRating  +
                    " Fighting skills rating = " + fightingSkillsRating + " Real name = "+ realName + " Description = " + description);
             */
            //System.out.println(csvFileReader);
            //System.out.println(csvFileReader.size());

            System.out.println(csvFileReader.get(0));
        }
        input.close();







    }
}