package observer;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();
        Usuario u1 = new Usuario("Felipe");
        Usuario u2 = new Usuario("Gabriel");
        canal.adicionar(u1);
        canal.adicionar(u2);

        canal.notificar("Novo vídeo publicado!");
    }
}
