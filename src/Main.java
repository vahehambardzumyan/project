import cloths.man_cloths.downDress.Shorts;
import com.sun.xml.internal.ws.message.saaj.SAAJHeader;
import person.Men;
import person.Person;

public class Main {
    public static void main(String[] args) {
     Men men= new Men("Vahe", "hambrdzumyan",15);
        Shorts shorts= new Shorts();
        shorts.setBrendName("Mango");
        men.setDownDress(shorts);
        men.goOut();
    }

}
