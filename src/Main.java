import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("5 - Buscar por ID");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    userService.adicionar(new User(id, nome, email));
                    break;

                case 2:
                    userService.listar();
                    break;

                case 3:
                    System.out.print("ID para atualizar: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    nome = sc.nextLine();
                    System.out.print("Novo email: ");
                    email = sc.nextLine();
                    userService.atualizar(id, nome, email);
                    break;

                case 4:
                    System.out.print("ID para remover: ");
                    id = sc.nextInt();
                    userService.remover(id);
                    break;

                case 5:
                    System.out.print("ID para buscar: ");
                    id = sc.nextInt();
                    userService.buscarPorId(id);
                    break;

                case 0:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
