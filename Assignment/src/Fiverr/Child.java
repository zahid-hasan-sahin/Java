package Fiverr;

import java.awt.Color;

public class Child extends Person {

    private boolean playing;

    Child(String firstName, String lastName) {
        super(firstName, lastName);
        playing = true;
        setMoney(10);
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void play() {
        playing = true;
        setNumFriends(getNumFriends() + 1);
    }

    public void work() {
        playing = false;
        setNumFriends(getNumFriends() - 1);
    }

    public String getNickname() {
        return getFirstName().substring(0, 3) + getLastName().substring(getLastName().length() - 3, getLastName().length()).toLowerCase();
    }

    public void buySnack(int cost) {
        if (getMoney() >= cost) {
            spendMoney(cost);
        } else {
            System.out.println("I need money");
        }
    }

    public void goHome() {
        if (this.getNumFriends() >= 1) {
            for (int i = 0; i < getNumFriends(); i++) {
                System.out.println("Bye");
            }
        } else {
            System.out.println("I'm going home");
        }
    }

    @Override
    public void setShirtColour(Color aColour) {
        if (!playing) {
            super.setShirtColour(aColour);
        } else {
            if (getShirtColour() == Color.WHITE) {
                System.out.println("I'm changing now");
                this.setShirtColour(aColour);
            } else {
                System.out.println("I'm wearing play clothes already");
            }
        }
    }

    
}
