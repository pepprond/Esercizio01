public class Programmer {

    public String name;
    public int age;
    public boolean wearsGlasses;

    public String drinkCoffee(){
        return "espresso in the secret";
    }
    public  String printDetails(){
        return name + " is a " + age + "-yo programmer";
    }
    public String hasGlasses() {
        return " is " + name + " wearing glasses? " + wearsGlasses;
    }

}
