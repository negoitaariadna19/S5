package adapter;

public class MasinaJucarie implements JucarieMobila {

    @Override
    public void seDeplaseaza() {
        System.out.println("Se deplaseaza cu 0,5 km/g");
    }

    @Override
    public void emitesunete() {
        System.out.println("Melodie setata");
    }
}
