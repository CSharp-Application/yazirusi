import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class yazirusi extends PApplet {

PImage image;
PVector point = new PVector();
public void setup() {
  
  background(255);
  image = loadImage("yazirusi.png");
  image(image, width/2, height/2);
}

public void draw() {
  background(255);
  if (keyPressed) {
    switch(key) {
    case 'w':
      if (point.y != 0) {
        point.y -= 1;
      }
      break;
    case 'a':
      if (point.x != 0) {
        point.x -= 1;
      }
      break;
    case 's':
      if (point.y != height) {
        point.y += 1;
      }
      break;
    case 'd':
      if (point.x != width) {
        point.x += 1;
      }
      break;
    }
  }
  image(image,point.x,point.y);
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "yazirusi" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
