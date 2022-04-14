package builder;

public class AutoturismElectric implements Masina{
    private String sasiu;
    private String roti;
    private String motor;
    private String interior;
    private String incarcator;


    @Override
    public void setSasiu(String sasiu) {
this.sasiu=sasiu;
    }

    @Override
    public void serRoti(String roti) {
this.roti=roti;
    }

    @Override
    public void setMotor(String motor) {
this.motor=motor;
    }

    @Override
    public void setInterior(String interior) {
this.interior=interior;
    }
}
