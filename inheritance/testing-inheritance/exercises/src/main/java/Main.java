public class Main {

    public static void main(String[] args) {
//        HouseCat garfield = new HouseCat("Garfield", 12);
//        garfield.eat();
//        garfield.sleep();
//        System.out.println(garfield.isTired());   // prints true
//        HouseCat spike = new HouseCat("Spike");
//        System.out.println(spike.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
//        System.out.println(plainCat.noise());
//        System.out.println(cheshireCat.noise());
        Cat suki = new HouseCat("Suki", 8);
        // Calls HouseCat's noise() method
        System.out.println(suki.noise());
        ((HouseCat) suki).isSatisfied();

    }
}
