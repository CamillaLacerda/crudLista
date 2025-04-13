import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void adicionar(User user) {
        users.add(user);
        System.out.println("Usuário adicionado!");
    }

    public void listar() {
        if (users.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        for (User u : users) {
            System.out.println(u);
        }
    }

    public void atualizar(int id, String novoNome, String novoEmail) {
        for (User u : users) {
            if (u.id == id) {
                u.nome = novoNome;
                u.email = novoEmail;
                System.out.println("Usuário atualizado!");
                return;
            }
        }
        System.out.println("Usuário com ID " + id + " não encontrado.");
    }

    public void remover(int id) {
        users.removeIf(u -> u.id == id);
        System.out.println("Usuário removido (se existia).");
    }

    public void buscarPorId(int id) {
        for (User u : users) {
            if (u.id == id) {
                System.out.println("Usuário encontrado:");
                System.out.println(u);
                return;
            }
        }
        System.out.println("Usuário com ID " + id + " não encontrado.");
    }
}
