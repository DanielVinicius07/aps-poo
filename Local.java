public class Local {
    private String nome;
    private int capacidadeMaxima;
    private String cidade;

    public Local(String nome, int capacidadeMaxima, String cidade) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.cidade = cidade;
    }

    public void exibirInformacoes() {
        System.out.println("Local: " + nome + " | Capacidade: " + capacidadeMaxima + " | Cidade: " + cidade);
    }

    public String getNome() {
        return nome;
    }
}