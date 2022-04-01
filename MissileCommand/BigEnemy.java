import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class BigEnemy extends Enemy {

    BigEnemy(int panelWidth, int panelHeight) {
        // call super to instantiate Enemy with
        //      width: 56
        //      height: 56

        // call setColor()
    }

    @Override
    public void processCollision(ArrayList<Enemy> list, int index) {

        //
        // decrease current size by 20
        //

        // get current size with getSize();

        // calculate new width by subtracting current width by 20
        // calculate new height by subtracting current height by 20

        // if new width or new height is less than 0, remove enemy from list
        // else, setSize to new width and height
    }

    @Override
    public void setColor() {
        // generate random Color
        // setEnemyColor() to random color
    }

    @Override
    public void move(int width, int height) {

        //
        // We want a move of the BigEnemy
        // to change its x-coordinate by its speed value
        //

        // but, if adding the speed makes the x-coordinate
        // less than zero or greater than the width passed in
        // we should reverse the enemy speed (multiply by -1 to reverse)

        // so, before changing the x-coordinate we should check if the
        // new x-coordinate is less than zero or greater than the width
        // and if it is, we should setEnemySpeed(getEnemySpeed() * -1)

        // then we can update its bounds by calling
        // setBounds(int x, int y, int width, int height)
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#setBounds(int,%20int,%20int,%20int)

        // getLocation()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#getLocation()
        // getWidth()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#getWidth()
        // getHeight()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#getHeight()
    }
}
