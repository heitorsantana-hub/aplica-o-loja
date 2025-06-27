package entities;

public class ItemPedido {


    private Integer quantidade;
    private double preco;
    private Produto produto;

    public ItemPedido(){

    }

    public ItemPedido(Integer quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ItemPedido(Integer quantidade, double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double subTotal(){
        return  quantidade * preco;
    }

    @Override
    public String toString() {
        return produto.getNome()
                + ", R$"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade +
                ", Subtotal: R$"
                + String.format("%.2f", subTotal());
    }

}
