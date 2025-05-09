import java.util.ArrayList;

public class GerenciamentoEventos {
    private ArrayList<Show> shows;

    public GerenciamentoEventos() {
        shows = new ArrayList<>();
    }

    public void adicionarShow(Show show) {
        shows.add(show);
    }

    public void listarShows() {
        for (Show s : shows) {
            s.exibirDetalhes();
        }
    }

    public void buscarShowPorData(String data) {
        for (Show s : shows) {
            if (s.data.equals(data)) {
                s.exibirDetalhes();
                return;
            }
        }
        System.out.println("Nenhum show encontrado para a data: " + data);
    }
}