# SciFi UI Project

Name: Gediminas Petreikis

Student Number: C17323756

# Description of the assignment
I have made a POV UI of a futuristic robot that has landed on mars and has encountered aliens. This robot has a radar, warning system, alien analysis, capability to shoot, reload and loose health. This is somewhat based of the masterchief ui from Halo with my own twist to it.

# Instructions
1. Clicking anywhere on screen with left mouse click will shoot lasers.
2. Shooting at the aliens will cause them to agro on you and hit you back.
3. Once you use  up all of you bullets the system reloads them back for you (this may sabotage the radar system as reloading takes up    	all of your system effort)
4. Your health status bar is at the very top of the screen letting you know about your working status.
5. The radar lets the robot know the location of hostiles.
6. Hovering over the aliens will reveal information about them.
7. Once your health goes down to 0 your screen goes black and 

# How it works
There are 7 classes in the java program. 
Alien.java - This is where the getters and setters for the alien info from csv file are stored
Bullets.java - This file is responsible for having the whole screen as a button and drawwing a laser 	beam whenever you shoot. Also this makes the bullet count to go down and then reload after 	      stalling for 2 seconds.
Button.java - This is responsible for what happens when you click or hover over the hitbox of the 	alien. If you click on it it makes the health bar go down and changes the status bar at the top       of the screen accordingly. If you hover over them it uses the info from the csv file to show         you information about the alien at the bottom of the screen. Once you hit one of the aliens           they automaticly hit you back to defend themselves.
Radar.java - This draws the radar.
UI.java - This is the main file where all of the files get loaded from. This is also where I loaded 	in my background image and the csv file. This also sets the priority of the files and which file     overrides another.
UiLayout.java - this file is only used to draw out the ui lines out to make the whole outline.
Main.java - the file that is used to execute the program.

# What I am most proud of in the assignment
The overall asthetic look of the program. I put a few days of thought in what I wanted my finished program to look like and I believe it turned out well. The code that I used is not too complicated but my aim was to use this simple code into making something that works well and does not turn the UI into a game (main reason why I did not implement aliens health bar). 

I wanted this to be a easy to use and get grasp of alien UI with everything having its own place on the screen and not interfering with other things.

Astheticly I was planing to colour in the ui blue to make it look more cool but then practicly this would interfere with the robots field of view as the transperent ui allows him to see more without things getting blocked. (also it was much easier to code) 

I mean overall its not a very complicated program with many different features but its nice and cool looking which is exacly what I was aiming to do a cool ui that would not keep me bored programming.

# Markdown Tutorial

This is a bulleted list

- Item
- Item
0
This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

