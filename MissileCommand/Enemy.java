import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public abstract class Enemy extends JComponent {
    // double enemySpeed
    // Color enemyColor


    Enemy(int x, int y, int height, int width, double speed) {
        // initialize bounds and speed

        // setLocation()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#setLocation(int,%20int)
        // setSize()
        //    https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#setSize(int,%20int)

        // set enemySpeed
    }

    abstract void processCollision(ArrayList<Enemy> list, int enemy);

    abstract void setColor();

    @Override
    public void paintComponent(Graphics g) {
        // Draw a filled circle using the Enemy's color and its bounds

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

    public double getEnemySpeed() {}

    public void setEnemySpeed(double speed) {}

    public Color getEnemyColor() {}

    public void setEnemyColor(Color color) {}
}
