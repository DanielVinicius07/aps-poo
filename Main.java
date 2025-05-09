public class Main {
    public static void main(String[] args) {
        // Locais
        Local local1 = new Local("Arena Fortaleza", 5000, "Fortaleza");
        Local local2 = new Local("Centro de Eventos", 3000, "Recife");

        // Exibir locais
        local1.exibirInformacoes();
        local2.exibirInformacoes();

        // Gerenciador
        GerenciamentoEventos gerenciamento = new GerenciamentoEventos();

        // Show 1
        Show show1 = new Show("20/06/2025", local1, 100.0);
        for (int i = 1; i <= 5; i++) {
            show1.adicionarIngresso(new Ingresso("S1-" + i, "pista", 100.0));
        }

        // Show 2
        Show show2 = new Show("25/06/2025", local2, 150.0);
        for (int i = 1; i <= 5; i++) {
            show2.adicionarIngresso(new Ingresso("S2-" + i, "vip", 150.0));
        }

        // Show 3 com artista convidado
        ArtistaConvidado show3 = new ArtistaConvidado("30/06/2025", local1, 200.0, "Ivete Sangalo", 50000.0);
        for (int i = 1; i <= 5; i++) {
            show3.adicionarIngresso(new Ingresso("S3-" + i, "camarote", 200.0));
        }

        // Adicionar shows
        gerenciamento.adicionarShow(show1);
        gerenciamento.adicionarShow(show2);
        gerenciamento.adicionarShow(show3);

        // Listar todos os shows
        gerenciamento.listarShows();

        // Buscar show por data
        System.out.println("\nBusca por data:");
        gerenciamento.buscarShowPorData("25/06/2025");
    }
}