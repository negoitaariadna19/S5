package builder;

public class BuilderAutoturismElectric implements BuilderMasina {
    private Masina auto;

    public BuilderAutoturismElectric() {
        auto=new AutoturismElectric();
    }

    @Override
    public void buildSasiu() {
auto.setSasiu("sasiuAuto");
    }

    @Override
    public void buildRoti() {
auto.serRoti("roti electric");
    }

    @Override
    public void buildMotor() {
auto.setMotor("motor electric");
    }

    @Override
    public void buildInterior() {
auto.setInterior("interior electric");
    }

    @Override
    public Masina getMasina() {
        return auto;
    }
    

    public void Incarcator()
    {

    }


}
