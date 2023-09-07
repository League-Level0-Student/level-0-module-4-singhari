package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

public class MouseInsideCircle extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
   // PImage face;
   
    @Override
    public void settings() {
       
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    //	 face= loadImage("cat.jpg");
    //	 face.resize(WIDTH, HEIGHT);
    //	 background(face);
    	
    }

    @Override
    public void draw() {
    //	background(face);
    int diameter = 100;
    int centerX= 200;
    int centerY = 400;
    int mx = mouseX;
    int my = mouseY;
    	noStroke();
    double distance = Math.sqrt(Math.pow(my-centerY,2)+Math.pow(mx-centerX,2));
    System.out.println(distance);
    	if(distance> diameter/2) {
    	fill(255,0,20);
    	}
    	else {
    		fill(0,255,0);
    	}
    	//left eye
    //	ellipse(220,369,202,202);
 
    	//right eye
    	ellipse(centerX,centerY,diameter,diameter);
    }

    static public void main(String[] args) {
        PApplet.main(MouseInsideCircle.class.getName());
    }
}
