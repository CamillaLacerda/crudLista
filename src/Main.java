import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    userService.adicionar(new User(id, nome, email));
                }
                case 2 -> userService.listar();
                case 3 -> {
                    System.out.print("ID para atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String email = sc.nextLine();
                    userService.atualizar(id, nome, email);
                }
                case 4 -> {
                    System.out.print("ID para remover: ");
                    int id = sc.nextInt();
                    userService.remover(id);
                }
                case 0 -> System.out.println("Finalizando...");
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }
}
