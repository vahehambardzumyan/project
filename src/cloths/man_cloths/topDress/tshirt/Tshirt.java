package cloths.man_cloths.topDress.tshirt;

import cloths.man_cloths.topDress.TopDress;

public class Tshirt  extends TopDress {
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
        return "Top dress type is Tshirt, brand Name is " + brendName +" "+",with color "+color;
    }
}
