public class Produto {

    public int codigo;
    public String descricao;
    public double valor;
    private int quantEstoque;

    public Produto(int codigo, String descricao, double valor) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        quantEstoque = 0;
    }

    public boolean entrada(int qtd){
        if(qtd > 0){
            quantEstoque =+ qtd;
            return true;
        }
        return false;
    }

    public boolean saida(int qtd){
        if(qtd < quantEstoque || qtd <= 0){
            quantEstoque -= qtd;
            return true;
        }
        return false;
    }

    public String mostrarProduto(){
        return  "Dados do Produto:\n" +
                "Codigo: " + codigo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Valor: " + valor + "\n" +
                "Quantidade no Estoque: " + quantEstoque + "\n";
    }
}
