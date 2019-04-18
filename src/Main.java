import cloths.man_cloths.downDress.Shorts;
import cloths.man_cloths.topDress.tshirt.Tshirt;
import person.Men;

public class Main {
    public static void main(String[] args) {
        Men men= new Men("Vahe", "hambrdzumyan",15);

        Shorts shorts= new Shorts();
        shorts.setBrendName("Mango");

        Tshirt tshirt= new Tshirt();
        tshirt.setBrendName("Nike");
        tshirt.setColor("black");

        men.setDownDress(shorts);
        men.setTopDress(tshirt);
        men.goOut();
    }

}
