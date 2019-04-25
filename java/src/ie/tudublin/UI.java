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

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }

    public void loadData()
	{   
		Table table = loadTable("data/aliens.csv", "header");
        
        for(TableRow row:table.rows())
        {
            Alien alien = new Alien(row);
            aliens.add(alien);
        }

        for(TableRow row:table.rows())
        {
            Alien alien2 = new Alien(row);
            aliens.add(alien2);
        }

    }

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
        background(img);

        ul.render();

        bul.shoot();
        bul.render();
		
		r.updateline();
		r.render();
		r.resetline();

        b.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
    
    public ArrayList<Alien> aliens = new ArrayList<Alien>();
}

