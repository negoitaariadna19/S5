package adapter;

public class Autoturism implements Masina {

    @Override
    public void ruleaza() {
        System.out.println("100km/h");
    }

    @Override
    public void claxoneaza() {
        System.out.println("Sunet strident");
    }
}
