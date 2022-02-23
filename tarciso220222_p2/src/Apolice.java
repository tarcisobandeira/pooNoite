public class Apolice {

    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("Dados Apolice:\n" +
                "Nome Segurado: " + getNomeSegurado() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Valor do Premio: " + getValorPremio() + "\n");
    }
}
