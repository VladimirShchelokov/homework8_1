public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        dog.voice();
        dog.eat("Meat");

        tiger.voice();
        tiger.eat("Grass");

        rabbit.voice();
        rabbit.eat("Grass");
    }
}