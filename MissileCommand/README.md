# Missile Command

We’re going to build a simple [shoot ’em up](https://en.wikipedia.org/wiki/Shoot_%27em_up) arcade game, similar to
- [Missile Command 1980 game](https://youtu.be/uJijGLGHRTE)
- [Paratrooper 1982 game](https://youtu.be/SnPUsspS-LM)


## Game components overview
- Enemy
    - Big Enemy
    - Small enemy
- Missile
- Turret

As “big” enemies usually have more health than “small” enemies, we can visually track enemy health by using the visual width and height of the enemy to represent its health. Then, when an enemy is hit, their width and height can shrink to show their health.

We’re going to use the Java Swing [JComponent](https://docs.oracle.com/javase/7/docs/api/javax/swing/JComponent.html) to show the game components, so we can simply track enemy “health” as the width/height of the JComponent.

## Enemy class
[View Enemy Class starter file](/MissileCommand/Enemy.java)

- `abstract class Enemy extends JComponent{}`
- An abstract class—it will not implement methods, instead declares what methods child classes must implement.
- Extends JComponent (as we want enemies to be a JComponent)

Fields **(all private)**
- double enemySpeed
- Color enemyColor

Methods
- Enemy(int xPosition, int yPosition, int height, int width, double speed)
- abstract void processCollision(ArrayList<Enemy> list, int enemyIndex)
- abstract setColor()
- abstract move(int width, int height)
- paintComponent(Graphics g)
- double getEnemySpeed()
- setEnemySpeed(double speed)
- Color getEnemyColor()
- setEnemyColor(Color color)

## Big Enemy Class
[View BigEnemy Class starter file](/MissileCommand/BigEnemy.java)

- `class BigEnemy extends Enemy {}`

## Small Enemy Class
[View SmallEnemy Class starter file](/MissileCommand/SmallEnemy.java)

- `class SmallEnemy extends Enemy {}`

## Missile Class
[View Missile Class starter file](/MissileCommand/Missile.java)

- `class Missile extends JComponent {}`

Fields **(all private)**
- int missileSpeed
- Color missileColor

Methods
- Missile(int x, int y)
- paintComponent(Graphics g)
- move(int width, int height, ArrayList<Missile> list, int missile)
