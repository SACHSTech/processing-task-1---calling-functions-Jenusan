import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 204, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff\

    //sun
    fill(255,255,0);
    ellipse(400,0,200,200);

    //foreground
    fill(0,255,0);
    rect(0, 300, 400,100);

    //purple flower
    line(200, 300, 200, 225);

    fill(102,0,153);
    ellipse(200,225,60,20);

    fill(102,0,153);
    ellipse(200,225,20,60);

    fill(0,255,0);
    ellipse(200,225,20,20);

    //red flower
    line(300, 300, 300, 225);

    fill(255,0,0);
    ellipse(300,225,60,20);

    fill(255,0,0);
    ellipse(300,225,20,60);

    fill(0,255,0);
    ellipse(300,225,20,20);

    //blue flower
    line(100, 300, 100, 225);

    fill(0,0,255);
    ellipse(100,225,60,20);

    fill(0,0,255);
    ellipse(100,225,20,60);

    fill(0,255,0);
    ellipse(100,225,20,20);

  }
  
  // define other methods down here.
}