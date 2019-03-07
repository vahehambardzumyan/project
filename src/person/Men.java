package person;

import cloths.man_cloths.downDress.DownDress;
import cloths.man_cloths.hats.Hat;
import cloths.man_cloths.shoes.Shoes;
import cloths.man_cloths.topDress.TopDress;
import pets.Cat;
import pets.Dog;

public class Men extends Person {
    String first_name;
    String last_name;
    int age;
    Shoes shoes;
    DownDress downDress;
    TopDress topDress;

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

    public Men(String first_name, String last_name, int age) {
        super(first_name, last_name, age);
        this.first_name = first_name;
        this.last_name = last_name;
        this.age =age;
    }
    public void goOut(){


        if(downDress!=null){
            System.out.println(first_name);
            System.out.println(last_name);
            System.out.println(age);
            System.out.println(downDress);
        }else System.out.println("Chem karox durs gal");

    }
}
