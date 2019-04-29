package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.data.Table;
import processing.data.TableRow;

import java.awt.Font;
import java.util.ArrayList;

public class UI extends PApplet
{
    Button b;
    Bullets bul;
    Radar r;
	PImage img;
    UiLayout ul;
    String name1;
    String planet1;
    String superp1;
    String name2;
    String planet2;
    String superp2;

    //Loads in the CSV file
    public void loadData()
	{   
		Table table = loadTable("data/aliens.csv", "header");
        //Puts alien 1 into separate array list
        for(TableRow row:table.rows())
        {
            Alien alien = new Alien(row);
            aliens.add(alien);
        }
        //Puts alien 2 in a separate array list
        for(TableRow row:table.rows())
        {
            Alien alien1 = new Alien(row);
            aliens.add(alien1);
        }

    }
    //sets the array list to special strings using the gettters and setters from the alien.java file
    public void printAliens()
    {
        
        Alien alien = aliens.get(0);
        name1 = alien.getName();
        planet1 = alien.getPlanet();
        superp1 = alien.getSuperp();

        Alien alien1 = aliens.get(1);
        name2 = alien1.getName();
        planet2 = alien1.getPlanet();
        superp2 = alien1.getSuperp();

        //System.out.println(alien);

    }
    

    public void settings()
    {
        size(1025, 576);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
        img = loadImage("images/mars2.png");
    }

    public void setup()
    {        
        loadData();
        printAliens();
        b = new Button(this, 650, 220, 260, 180, name1, planet1, superp1, name2, planet2, superp2);
        bul = new Bullets(this);
        r = new Radar(this, 198, 438, 150);
        ul = new UiLayout(this, 100);

    }
    

    public void draw()
    {
        //displays the background image
        background(img);
        //calls the ui layout render function
        ul.render();
        //whenever mouse is clisked on screen this is called
        bul.shoot();
        //renders the laser when mouse is licked
        bul.render();
		//radar function calls
		r.updateline();
		r.render();
		r.resetline();
        //renders the stuff for the button file
        b.render();

    }
    //Aray list where the csv file collums are stored
    public ArrayList<Alien> aliens = new ArrayList<Alien>();
}

