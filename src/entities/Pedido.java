package entities;

import enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itemp = new ArrayList<>();
    private Cliente cliente;
    private Date momento;
    private StatusPedido status;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public List<ItemPedido> getItemp() {
        return itemp;
    }

    public void addItemPedido(ItemPedido item) {
        itemp.add(item);
    }

    public void removeItemPedido(ItemPedido item) {
        itemp.remove(item);
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double total() {
        double sum = 0.0;
        for (ItemPedido it : itemp) {
            sum += it.subTotal();
        }
        return sum;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status Pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: " + "\n");
        sb.append(cliente + "\n");
        sb.append("Itens Pedido: \n");
        for(ItemPedido item : itemp){
            sb.append(item + "\n");
        }
        sb.append("Total preço: R$");
        sb.append(String.format("%.2f", total() ));
        return sb.toString();
    }
}
