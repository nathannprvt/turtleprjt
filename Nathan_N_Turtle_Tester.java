
/**
 * Filename: Tester.java
 * 
 * Replace this comment with your own description of what this program does.
 *
 * @author (fill in your name here)
 * @version (a version number or a date)
 */
public class Nathan_N_Turtle_Tester
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.penUp();
        turtle.moveTo(30,180);
        turtle.penDown();
        turtle.forward(150);
        turtle.turn(150);
        turtle.forward(160);
        turtle.turn(210);
        turtle.forward(150);
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(30);
        turtle.turnRight();
        turtle.forward(150);
        turtle.penDown();
        turtle.turn(190);
        turtle.forward(160);
        turtle.turn(160);
        turtle.forward(160);
        turtle.turn(180);
        turtle.forward(80);
        turtle.turn(270);
        turtle.forward(30);
        turtle.penUp();
        turtle.moveTo(270,30);
        turtle.penDown();
        turtle.turn(280);
        turtle.forward(140);
        turtle.turn(180);
        turtle.forward(140);
        turtle.turnLeft();
        turtle.forward(30);
        turtle.turn(180);
        turtle.forward(60);
        turtle.penUp();
        turtle.forward(30);
        turtle.penDown();
        turtle.turnRight();
        turtle.forward(150);
        turtle.turn(180);
        turtle.forward(75);
        turtle.turnRight();
        turtle.forward(40);
        turtle.turnRight();
        turtle.forward(75);
        turtle.turn(180);
        turtle.forward(150);
        turtle.turnRight();
        turtle.penUp();
        
    }
}
