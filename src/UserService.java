import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    public void adicionar(User user) {
        users.add(user);
    }

    public void listar() {
        for (User u : users) {
            System.out.println(u);
        }
    }

    public void atualizar(int id, String novoNome, String novoEmail) {
        for (User u : users) {
            if (u.id == id) {
                u.name = novoNome;
                u.email = novoEmail;
            }
        }
    }

    public void remover(int id) {
        users.removeIf(u -> u.id == id);
    }
}

