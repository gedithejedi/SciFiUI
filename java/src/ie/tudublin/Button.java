package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float xl;
    private float yl;
    private float xl2;
    private float yl2;

    public Button(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        xl = 340;
        yl = 240;
        xl2 = 100;
        yl2 = 180;
    }

    public void render()
    {
        ui.noFill();
        ui.noStroke();
        ui.rect(x, y, width, height);
        ui.rect(xl, yl, xl2, yl2);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);

        
        if(ui.mouseX > xl && ui.mouseX < xl + xl2 && ui.mouseY > yl && ui.mouseY < yl + yl2)
        {
            ui.text("You just hovered over me me", xl + 30, yl - 25); 
        }
    
        if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
        {
            ui.text("You just hovered over me me", x + 30, y - 25);
        }
         
    }
}