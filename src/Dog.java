public class Dog extends Animal{
    @Override
    public void voice() {
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Собака любит есть мясо");
        } else {
            System.out.println("Собака недоволен");
        }
    }

}
