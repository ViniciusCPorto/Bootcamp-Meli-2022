package Animais;

public class Gato extends Animal implements Carnivoro {

    @Override
    public void som() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo Whiskas");
    }
}
