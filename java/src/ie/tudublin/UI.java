package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Radar r;
    PImage img;

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
        img = loadImage("images/ui.png");
    }

    public void setup()
    {
        b = new Button(this, 600, 150, 100, 50, "Hola");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        r = new Radar(this, 198, 438, 150);
        ul = new Layout();
    }
    

    public void draw()
    {
        background(img);
        b.render();

        ul.layout();

        mc.update();
        mc.render();
		
		r.updateline();
		r.render();
		r.resetline();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

