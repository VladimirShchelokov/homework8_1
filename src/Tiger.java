public class Tiger extends Animal{
    @Override
    public void voice() {
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Тигр любит есть мясо");
        } else {
            System.out.println("Тигр недоволен");
        }
    }
}
