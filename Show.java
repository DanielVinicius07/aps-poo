import java.util.ArrayList;

public class Show {
    protected String data;
    protected Local local;
    protected ArrayList<Ingresso> ingressos;
    protected double precoIngresso;

    public Show(String data, Local local, double precoIngresso) {
        this.data = data;
        this.local = local;
        this.precoIngresso = precoIngresso;
        this.ingressos = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public boolean venderIngresso() {
        if (verificarDisponibilidade()) {
            ingressos.remove(0);
            return true;
        }
        return false;
    }

    public boolean verificarDisponibilidade() {
        return !ingressos.isEmpty();
    }

    public void exibirDetalhes() {
        System.out.println("\n--- Detalhes do Show ---");
        System.out.println("Data: " + data);
        System.out.println("Local: " + local.getNome());
        System.out.println("Ingressos Disponíveis: " + ingressos.size());
        System.out.println("Preço do Ingresso: R$" + precoIngresso);
    }

    public double calcularFaturamento() {
        int vendidos = capacidadeInicial() - ingressos.size();
        return vendidos * precoIngresso;
    }

    private int capacidadeInicial() {
        return local != null ? ingressos.size() + vendidos() : 0;
    }

    private int vendidos() {
        // Supondo todos os ingressos cadastrados foram inicialmente adicionados
        return ingressos.size();
    }
}