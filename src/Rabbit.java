public class Rabbit extends Animal {
    @Override
    public void voice() {
    }

    @Override
    public void eat(String food) {
        if (food == "Grass") {
            System.out.println("Кролик любит есть травку");
        } else {
            System.out.println("Кролик недоволен");
        }
    }
}

