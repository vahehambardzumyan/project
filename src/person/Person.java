package person;

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
   public draw(){
    }
    public goOut(){

    }
}
