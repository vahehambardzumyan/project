package cloths.man_cloths.shoes;

public class Shoes {
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
        return "Shoes brand Name is " + brendName +" "+",with color "+color;
    }
}
