import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestaCarbono {
    public static void main(String[] args) throws Exception {
        ArrayList emissoresCarbono = new ArrayList<>();
        int nPessoas = 4;
        boolean energiaRenovavel = false;
        int nLampadas = 3;
        boolean arCondicionado = true;
        Building construcao = new Building(nPessoas, energiaRenovavel, nLampadas, arCondicionado);
        emissoresCarbono.add(construcao);
        int nPessoas2 = 5;
        boolean energiaRenovavel2 = false;
        int nLampadas2 = 3;
        boolean arCondicionado2 = false;
        Building construcao2 = new Building(nPessoas2, energiaRenovavel2, nLampadas2, arCondicionado2);
        emissoresCarbono.add(construcao2);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + construcao.getCarbonFootprint());
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + construcao2.getCarbonFootprint());
        String combustivel = "aditivada";
        int cilindrada = 4;
        Car carro = new Car(combustivel, cilindrada);
        emissoresCarbono.add(carro);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + carro.getCarbonFootprint());
        String combustivel2 = "gasolina";
        int cilindrada2 = 5;
        Car carro2 = new Car(combustivel2, cilindrada2);
        emissoresCarbono.add(carro2);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + carro2.getCarbonFootprint());
        Bicycle bicicleta = new Bicycle();
        emissoresCarbono.add(bicicleta);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + bicicleta.getCarbonFootprint());
        Bicycle bicicleta2 = new Bicycle();
        emissoresCarbono.add(bicicleta2);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + bicicleta2.getCarbonFootprint());
    }
}
