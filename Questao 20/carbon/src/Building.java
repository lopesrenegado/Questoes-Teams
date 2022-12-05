

public class Building implements CarbonFootprint {
    private int nPessoas;
    private boolean energiaRenovavel;
    private int nLampadas;
    private boolean arCondicionado;
    private int pegadasCarbono;

public Building(int nPessoas, boolean energiaRenovavel, int nLampadas, boolean arCondicionado){
    this.nPessoas = nPessoas;
    this.energiaRenovavel = energiaRenovavel;
    this.nLampadas = nLampadas;
    this.arCondicionado = arCondicionado;
}

    public int getnLampadas() {
        return nLampadas;
    }

    public int getnPessoas() {
        return nPessoas;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        this.energiaRenovavel = energiaRenovavel;
    }

    public int getCarbonFootprint() {
        if (energiaRenovavel == true && arCondicionado == false) {
            pegadasCarbono = nPessoas * nLampadas - 100;
        } else if (energiaRenovavel == false && arCondicionado == true) {
            pegadasCarbono = nPessoas * nLampadas + 100;
        } else if (energiaRenovavel == false && arCondicionado == false) {
            pegadasCarbono = nPessoas * nLampadas;
        }
        return pegadasCarbono;
    }
}