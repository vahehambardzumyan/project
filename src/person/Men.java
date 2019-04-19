package person;

import cloths.man_cloths.downDress.DownDress;
import cloths.man_cloths.hats.Hat;
import cloths.man_cloths.shoes.Shoes;
import cloths.man_cloths.topDress.TopDress;
import pets.Cat;
import pets.Dog;

public class Men {
    String first_name;
    String last_name;
    int age;
    Shoes shoes;
    DownDress downDress;
    TopDress topDress;
    Hat hat;
    Cat cat;
    Dog dog;


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public DownDress getDownDress() {
        return downDress;
    }

    public void setDownDress(DownDress downDress) {
        this.downDress = downDress;
    }

    public TopDress getTopDress() {
        return topDress;
    }

    public void setTopDress(TopDress topDress) {
        this.topDress = topDress;
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Men(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public void goOut() {


        if (downDress != null && topDress != null && shoes != null && hat != null) {
            System.out.println(first_name);
            System.out.println(last_name);
            System.out.println(age);
            System.out.println(downDress);
            System.out.println(topDress);
            System.out.println(shoes);
            System.out.println(hat);
            System.out.println(dog);
            System.out.println(cat);
            System.out.println("Thanks for watching");
        } else System.out.println("Chem karox durs gal");

    }
}
