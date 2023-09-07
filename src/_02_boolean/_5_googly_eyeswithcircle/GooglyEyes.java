package _02_boolean._5_googly_eyeswithcircle;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
    PImage face;
   
    @Override
    public void settings() {
       
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	 face= loadImage("cat.jpg");
    	 face.resize(WIDTH, HEIGHT);
    	 background(face);
    	
    }

    @Override
    public void draw() {
    	background(face);
    	 double rightpupil = mouseX;
    	 double rightpupilh = mouseY;
    	 double leftpupil = rightpupil-324;
    	 double leftpupilh = rightpupilh+8;
    	double modifer = 0.70711;
    	int newrightpupil = Math.round(mouseX);
    	int newrightpupilh = Math.round(mouseY);
    	int newleftpupil = Math.round(mouseX-324);
    	int newleftpupilh = Math.round(mouseY+8);
    	double theta = Math.atan((float) (newrightpupilh-361.0)/(float) (newrightpupil-554.0));
    	double rightpupilx = 100*Math.cos(theta)+554.0-20;
    	double rightpupily = 100*Math.sin(theta)+361.0;
  //start bounds here
    	 //right pupil x coordinates bounds:
    	 if(newrightpupil > 654 || newrightpupil <454) {
    		 if(newrightpupil > 654) {
    			 //left
    			 newrightpupil = 654-10;
    		 }
    		 else if(newrightpupil < 454) {
    			 //right
    			 newrightpupil = 454+10;
    		 }
    	 }
    	 if(newrightpupilh >461 || newrightpupilh <261) {
    		 if(newrightpupilh > 461) {
    			 //down
    			 newrightpupilh = 461-50;
    		 }
    		 else if(newrightpupilh < 261) {
    			 //up
    			 newrightpupilh=261+50;
    		 }
    	 }
    	 //left pupil bounds start here:
    	 if(newleftpupil >322 || newleftpupil < 118) {
    		 if(newleftpupil > 322) {
    	     newleftpupil = 322-10;
    		 }
    		 else if(newleftpupil <118) {
    			 newleftpupil = 118+10;
    		 }
    	 }
    	 if(newleftpupilh > 471 || newleftpupilh < 267) {
    		 if(newleftpupilh > 471) {
    			 newleftpupilh = 471-50;
    		 }
    		 else if(newleftpupilh < 267) {
    			 newleftpupilh = 267+50;
    		 }
    	 }
    	
    	noStroke();
    	fill(255,255,255);
    	//left eye
    	ellipse(220,369,202,202);
 //   System.out.println(mouseX);
   // 	System.out.println(mouseY);
    	//right eye
    	ellipse(554,361,200,200);
    	fill(0,0,0);
    
 //  System.out.println(rightpupilx+", "+rightpupily);
 //  System.out.println(newrightpupil+", y:"+newrightpupilh);
    	//System.out.println(newrightpupil);
    	//ellipse((int) rightpupilx,newrightpupilh,20, 100);
    	ellipse(newrightpupil,newrightpupilh,20, 100);
    //	ellipse((int)rightpupilx,(int)rightpupily,20, 100);
    	ellipse(newleftpupil,newleftpupilh,20,100);
   // 	System.out.println(theta);
    	//System.out.println("x: "+mouseX+", y: "+mouseY);
   
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
