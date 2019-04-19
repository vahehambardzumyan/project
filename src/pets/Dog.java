package pets;

public class Dog extends Pet {
    String brendName;
    String color;
    public String getBrendName() {
        return brendName;
    }

    public void setBrendName(String brendName) {
        this.brendName = brendName;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog breed is" + brendName +" "+",with color "+color;
    }
}
