import cloths.man_cloths.downDress.Shorts;
import cloths.man_cloths.hats.Hat;
import cloths.man_cloths.shoes.Shoes;
import cloths.man_cloths.topDress.tshirt.Tshirt;
import person.Men;
import pets.Cat;
import pets.Dog;

public class Main {
    public static void main(String[] args) {
        Men men= new Men("Vahe", "Hambardzumyan",15);

        Shorts shorts= new Shorts();
        shorts.setBrendName("Mango");

        Tshirt tshirt= new Tshirt();
        tshirt.setBrendName("Louis Vuitton");
        tshirt.setColor("black");

        Shoes shoes= new Shoes();
        shoes.setBrendName("Adidas");
        shoes.setColor("blue");


        Hat hat= new Hat();
        hat.setBrendName("Brixton");
        hat.setColor("black");


        Dog dog= new Dog();
        dog.setBrendName("Haski");
        dog.setColor("black");


        Cat cat= new Cat();
        cat.setBrendName("Vana");
        cat.setColor("grey");



        men.setDog(dog);
        men.setCat(cat);
        men.setHat(hat);
        men.setShoes(shoes);
        men.setDownDress(shorts);
        men.setTopDress(tshirt);
        men.goOut();
    }

}
