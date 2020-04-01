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

public class void_setup extends PApplet {

public void setup() {
    
}

float a = 0;

public void draw() {
    fill(0xff021050,5);
    rect(0, 0, width, height);
    translate(200+a * 10, 200+a*10);
    rotate(a);
    scale(a/15);
    a += 0.05f;
    kao(0, -50);
    kao(1, 50);
    if (a > 30)
        a -= 50;
}

// 魔法の筆、呪文で描くよ（君も書こう）

public void kao(int don, float b) {
    stroke(0);
    strokeWeight(2);
    fill(0xffe7eedd);
    ellipse(b, 0, 50, 50);
    noStroke();
    fill(0xff68c0c0 + 0xff8f8768 * don);
    ellipse(b, 0, 38, 38);

    stroke(0);
    strokeWeight(1.4f);
    arc(b + 4.26f, 5, 8.5f, 7.3f, 0.3f, PI, OPEN);
    arc(b - 4.26f, 5, 8.5f, 7.3f, 0, PI-0.3f, OPEN);
    
    fill(0);
    ellipse(b - 11, -2, 6.56f, 7);
    ellipse(b + 11, -2, 6.56f, 7);
}

// 世界が始まるよ

  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "void_setup" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
