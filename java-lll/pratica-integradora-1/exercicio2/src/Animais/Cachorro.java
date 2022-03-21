package Animais;

public class Cachorro extends Animal implements Carnivoro {

    @Override
    public void som() {
        System.out.println("Au au!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo Pedigree");
    }
}