import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;

public class Missile extends JComponent {
    // int missileSpeed
    // Color missileColor

    Missile(int x, int y) {
        // initialize bounds, speed, and color

        // setLocation()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#setLocation(int,%20int)
        // setSize()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#setSize(int,%20int)

        // set missileSpeed
        // set missileColor
    }

    public void setMissileColor(Color missileColor) {}

    public void paintComponent(Graphics g) {
        // Draw a filled circle using the Missile color and bounds

        // paintComponent(Graphics)
        //    https://docs.oracle.com/javase/7/docs/api/javax/swing/JComponent.html#paintComponent(java.awt.Graphics)

        // Graphics.
        //  setColor(Color)
        //      https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html#setColor(java.awt.Color)
        //  fillOval(int x,int y, int width, int height)
        //      https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html#fillOval(int,%20int,%20int,%20int)

        // can get width and height with getBounds()
        //      https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#getBounds()
    }

    public void move(int width,
                     int height,
                     ArrayList<Missile> list,
                     int index) {

        // Determine the new height of the missile
        // by subtracting the missile speed from the current height

        // if the new height is less than 0, it’s off-screen
        // and we should remove it from the list
        // remove()
        //    https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#remove(int)

        // setBounds(int x, int y, int width, int height)
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#setBounds(int,%20int,%20int,%20int)

        // we keep the x-coordinate the same
        // update the y-coordinate
        // we are given width and height by function parameters
    }

    public void setMissileSpeed(int missileSpeed) {}

    public int getMissileSpeed() {}
}
