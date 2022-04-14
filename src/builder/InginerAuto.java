package builder;

public class InginerAuto {

    BuilderMasina b;


    public InginerAuto(String tipMasina) {

    }
    public void buildMasina(String tip)
    {if(tip.equals("electric")) {
       b=new BuilderAutoturismElectric();
        b.buildSasiu();
        b.buildInterior();
        b.buildRoti();
        b.buildMotor();

    }else if(tip.equals("clasic"))
    {
        b=new BuilderAutoturismClasic();
        b.buildSasiu();
        b.buildRoti();
        b.buildMotor();
        b.buildInterior();
    }

    }

    public Masina getMasina()
    {

        return b.getMasina();
    }


}
