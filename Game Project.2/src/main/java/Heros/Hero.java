package Heros;

import javafx.scene.image.Image;

import java.io.InputStream;

public class Hero extends Image
{
    private int power;
    private int health;
    int speed;
    int x;
    int y;

    public Hero(String s) {
        super(s);
    }


    @Override
    public String toString() {
        return "Hero{" +
                "power=" + power +
                ", health=" + health +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
