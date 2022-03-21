package Animais;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void som() {
        System.out.println("Muuu!");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo Pasto");
    }
}
