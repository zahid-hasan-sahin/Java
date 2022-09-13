package Quiz2;

public class Apple implements Edible {

    private String color;

    public Apple(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String howToEat() {
        return "Peel.Cut.Eat";
    }

    @Override
    public String toString() {
        return "Apple{" + "color=" + color + '}';
    }

}
