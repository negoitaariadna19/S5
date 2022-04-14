package builder;

public class Main {
    //instanta inginer auto

    public static void main(String[] args) {
        InginerAuto inginerAuto=new InginerAuto("electrica");
        inginerAuto.buildMasina("clasica");
        inginerAuto.getMasina();
        System.out.println(inginerAuto.getMasina());
    }





}
