package person;

import cloths.man_cloths.hats.Hat;
import cloths.man_cloths.shoes.Shoes;
import cloths.man_cloths.topDress.TopDress;
import cloths.women_cloths.downDress.DownDress;
import pets.Cat;
import pets.Dog;

public class Person {
    String first_name;
    String last_name;
    int age;
    String hairColor;
    String eyeColor;
    int height;
    int weight;
    Shoes shoses;
    TopDress topDress;
    DownDress downDress;
    Hat hat;
    Cat cat;
    Dog dog;

    public Person(String first_name, String last_name, int age, String hairColor, String eyeColor, int height, int weight, Shoes shoses, TopDress topDress, DownDress downDress, Hat hat, Cat cat, Dog dog) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        this.shoses = shoses;
        this.topDress = topDress;
        this.downDress = downDress;
        this.hat = hat;
        this.cat = cat;
        this.dog = dog;
    }
   public void draw(Shoes shoes){
       System.out.println(shoes);
    }
    public goOut(){

    }


}
