package adapter;

public class Main {
    public static void main(String[] args) {

        JucarieMobila jucarie=new AdapterMasina();
      jucarie.seDeplaseaza();
      jucarie.emitesunete();

      JucarieMobila j1=new MasinaJucarie();
      j1.seDeplaseaza();
      j1.emitesunete();
    }


}
