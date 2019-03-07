package cloths.man_cloths.downDress;

public class Shorts extends DownDress {
    String brendName;

    public String getBrendName() {
        return brendName;
    }

    public void setBrendName(String brendName) {
        this.brendName = brendName;

    }

    @Override
    public String toString() {
        return "Down dress type is Shorts brand Name is " + brendName;
    }
}
