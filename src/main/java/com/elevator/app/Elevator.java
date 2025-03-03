package com.elevator.app;
import java.util.concurrent.TimeUnit;

public class Elevator {
    private int maxLevel;
    private int pushedLevel;
    private int currentLevel;

    public Elevator() {
        this.maxLevel = 20;
        this.pushedLevel = 0;
        this.currentLevel = 0;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getPushedLevel() {
        return pushedLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public void setPushedLevel(int pushedLevel) {
        this.pushedLevel = pushedLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void moveElevator() throws InterruptedException {
        if (pushedLevel == currentLevel) {
            System.out.printf("You're already at level %s.\n", pushedLevel);
            return;
        }

        int mover = currentLevel > pushedLevel ? -1 : 1;
        while (currentLevel != pushedLevel) {
            currentLevel = currentLevel + mover;
            System.out.printf("Level %s\n", getCurrentLevel());
            TimeUnit.SECONDS.sleep(1); 
        }
        System.out.printf("DING! Reached level %s\n", currentLevel);
    }
}
