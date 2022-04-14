package builder;

public class BuilderAutoturismClasic implements BuilderMasina {
    private Masina autoclasic;
    public BuilderAutoturismClasic() {
        autoclasic=new AutoturismClasic();
    }
    @Override
    public void buildSasiu() {
autoclasic.setSasiu("sasiu clasic");
    }

    @Override
    public void buildRoti() {
autoclasic.serRoti("roti clasic");
    }

    @Override
    public void buildMotor() {
autoclasic.setMotor("motor clasic");
    }

    @Override
    public void buildInterior() {
autoclasic.setInterior("interior clasic");
    }

    @Override
    public Masina getMasina() {
        return autoclasic;
    }

    public void buildAditivi()
     {

     }

}
