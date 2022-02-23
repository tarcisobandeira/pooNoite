public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto(01,"Bola Oficial", 100.0);
        Produto p2 = new Produto(02, "Peteca",22.0);

        if(!p1.entrada(50)){
            System.out.println("Entradad Invalida\n");
        }else{
            System.out.println("Entrada Efetuada com Sucesso\n");
        }

        System.out.println(p1.mostrarProduto());

        if(!p1.saida(10)){
            System.out.println("Saida Invalida\n");
        }else{
            System.out.println("Saida Efetuada com Sucesso\n");
        }

        System.out.println(p1.mostrarProduto());

    }

}
