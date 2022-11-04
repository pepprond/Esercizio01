public class TestProgrammer {
    public  static void main(String arg[]){
        Programmer primo= new Programmer();
        primo.name="chiara";
        primo.age=22;
        primo.wearsGlasses= false;

        Programmer secondo = new Programmer();
        secondo.name="giuseppe";
        secondo.age=27;
        secondo.wearsGlasses=true;
        System.out.println(primo.drinkCoffee() +  " " + primo.printDetails());
        System.out.println(secondo.printDetails()+ " " + secondo.hasGlasses());

    }
}
