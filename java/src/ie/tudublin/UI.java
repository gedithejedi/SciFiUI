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
    

    public void settings()
    {
        size(1025, 576);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
        img = loadImage("images/mars2.png");
    }

    public void setup()
    {
        b = new Button(this, 650, 220, 260, 180);
        bul = new Bullets(this);
        r = new Radar(this, 198, 438, 150);
        ul = new UiLayout(this, 100);
        loadData();
        printAliens();
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
    
	public void loadData()
	{   
		Table table = loadTable("data/aliens.csv", "header");
        
        for(TableRow row:table.rows())
        {
            Alien alien = new Alien(row);
            aliens.add(alien);
        }

    }

    public void printAliens()
    {
        for(Alien alien:aliens)
        {
            System.out.println(alien);
        }
    }
    
    private ArrayList<Alien> aliens = new ArrayList<Alien>();
}

