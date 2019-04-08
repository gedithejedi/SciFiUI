package ie.tudublin;

import processing.data.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Alien
{
    public static void main(String[] args) 
    {

        String csv = "data/aliens.csv";
        String line = "";
        String split = ",";
        String[] names = {"_","_","_"};
        String[] planet = {"_","_","_"};
        String[] superp = {"_","_","_"};

        try (BufferedReader br = new BufferedReader(new FileReader(csv))) 
        {

            while ((line = br.readLine()) != null) 
            {
                int i = 0;
                String alien[] = line.split(split);
                names[i] = alien[0];
                planet[i] = alien[1];
                superp[i] = alien[2];
                System.out.println("name= " + alien[0]);
               //+ System.out.println("times ran "+ i);
                i++;
            }
            System.out.println("name= " + names[0]);
            System.out.println("name= " + planet[0]);
            System.out.println("name= " + superp[0]);



        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }

    }
    
}