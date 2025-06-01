package observer;

import java.util.*;

public class Canal {
    private List<Observador> usuarios = new ArrayList<>();

    public void adicionar(Observador o) {
        usuarios.add(o);
    }

    public void notificar(String mensagem) {
        for (Observador o : usuarios) {
            o.atualizar(mensagem);
        }
    }
}