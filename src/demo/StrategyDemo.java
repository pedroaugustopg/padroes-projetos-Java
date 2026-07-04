package demo;

import strategy.*;

public class StrategyDemo {

    public static void main(String[] args)
            throws InterruptedException {

        MovementStrategy defensive = new DefensiveMovement();
        MovementStrategy aggressive = new AggressiveMovement();
        MovementStrategy normal = new NormalMovement();

        Robot robot = new Robot();

        robot.setStrategy(normal);
        System.out.println("Under analysis ...");
        Thread.sleep(3000);
        robot.move();
        robot.move();
        System.out.println();

        robot.setStrategy(defensive);
        System.out.println("Under analysis ...");
        Thread.sleep(3000);
        robot.move();
        System.out.println();

        robot.setStrategy(aggressive);
        System.out.println("Under analysis ...");
        Thread.sleep(3000);
        robot.move();
        robot.move();
        robot.move();

        System.out.println();
        System.out.println("<<Finish>>");
    }
}
