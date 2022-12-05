import java.util.ArrayList;



public class Pedido {
    private int numero;
    private String data;
    private String status;
    
    private ArrayList<Item> itens = new ArrayList<Item>();
    
public Pedido(int numero, String data, String status){
    this.numero = numero;
    this.data = data;
    this.status = status;
}

public String getData() {
    return data;
}

public String getStatus() {
    return status;
}

public int getNumero() {
    return numero;
}

public void inserirItem(Item item){
    itens.add(item);
}

public double precoVenda(){
    double totalPagar = 0;
    for(int i = 0; i < itens.size(); i++){
        totalPagar = totalPagar+ itens.get(i).precoItem();
    }
    return totalPagar;
}

public ArrayList<Item> getItens() {
    return itens;
}

}
