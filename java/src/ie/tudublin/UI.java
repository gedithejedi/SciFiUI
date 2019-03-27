package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import java.awt.Font;

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
        img = loadImage("images/mars.jpg");
    }

    public void setup()
    {
        b = new Button(this, 600, 150, 100, 50, "Hola");
        bul = new Bullets(this);
        r = new Radar(this, 198, 438, 150);
        ul = new UiLayout(this, 100);
    }
    

    public void draw()
    {
        background(img);
        b.render();

        ul.render();

        bul.shoot();
        bul.render();
		
		r.updateline();
		r.render();
		r.resetline();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

