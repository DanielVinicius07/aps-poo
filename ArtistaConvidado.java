public class ArtistaConvidado extends Show {
    private String nomeArtista;
    private double cache;

    public ArtistaConvidado(String data, Local local, double precoIngresso, String nomeArtista, double cache) {
        super(data, local, precoIngresso);
        this.nomeArtista = nomeArtista;
        this.cache = cache;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Artista Convidado: " + nomeArtista + " | Cachê: R$" + cache);
    }
}