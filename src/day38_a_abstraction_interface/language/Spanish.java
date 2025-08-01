package day38_a_abstraction_interface.language;

public class Spanish implements Language {
    @Override
    public void sayHi() {
        System.out.println("Hola!");
    }

    @Override
    public void sayBye() {
        System.out.println("Adios!");
    }
}
