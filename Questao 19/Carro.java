public class Carro {
    private String cor;
    private Marca marca;
    private int chassi;
    private Proprietario proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int nDePortas;
    private boolean tetoSolar;
    private int nMarchas;
    private boolean cambioAutomatico;
    private double volumeCombustivel;
    private double autonomiaHora;
    private int marcha;

    public Carro(String nomeMarca, int nModelosMarca, int anoLancamentoModelo, int codigoIdentificador,
        String ruaProprietario, String bairroProprietario, int nCasaProprietario, String cor, int chassi,
        int velocidadeMaxima, int velocidadeAtual, int nDePortas, boolean tetoSolar, boolean cambioAutomatico,
        double volumeCombustivel, int nMarchas) {
        Marca marca = new Marca(nomeMarca, nModelosMarca, anoLancamentoModelo, codigoIdentificador);
        this.marca = marca;
        Proprietario proprietario = new Proprietario(ruaProprietario, bairroProprietario, nCasaProprietario);
        this.proprietario = proprietario;
        this.cor = cor;
        this.chassi = chassi;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nDePortas = nDePortas;
        this.tetoSolar = tetoSolar;
        this.nMarchas = nMarchas;
        this.cambioAutomatico = cambioAutomatico;
        this.volumeCombustivel = volumeCombustivel;
        this.nMarchas = nMarchas;
    }

    public void aceleraCarro() {
        this.velocidadeAtual = velocidadeAtual + 1;
    }

    public void freiaCarro() {
        velocidadeAtual = 0;
    }

    public int trocaMarcha() {
        int marcha = 0;
        if (marcha < nMarchas) {
            this.marcha++;
        }
        return marcha;
    }

    public void reduzMarcha() {
        if (marcha < nMarchas) {
            this.marcha = marcha - 1;
        }
    }

    public void marchaRé() {
        if (velocidadeAtual != 0) {
            System.out.println("A marcha re nao pode ser engatada com velocidade superior a 0km!");
        }
        else{
            this.marcha = 6;
        }
    }

    public double autonomiaViagem(int consumoKmPorHr) {
        autonomiaHora = volumeCombustivel / consumoKmPorHr;
        System.out.println("A autonomia de viagem é: " + autonomiaHora);
        return autonomiaHora;
    }

    public double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public String imprimir() {
        return "Dados do veiculo: " + "\n Nome da marca: " + marca.getNome() + "\n Cor do carro: " + this.cor
                + "\n Numero do chassi: " + this.chassi + "\n Endereço do proprietario - " + " Casa: " + proprietario.getnCasa()
                + "\n Rua: " + proprietario.getRua() + "\n Bairro: " + proprietario.getBairro() + "\n Velocidade atual: "
                + this.velocidadeAtual + "\n Velocidade Maxima: " + this.velocidadeMaxima + "\n Numero de portas: "
                + this.nDePortas + "\n Teto solar? " + this.tetoSolar + "\n Numero de marchas: " + this.nMarchas
                + "\n Cambio automatico? " + this.cambioAutomatico + "\n Volume de combustivel: "
                + this.volumeCombustivel;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getMarcha() {
        return marcha;
    }
}
