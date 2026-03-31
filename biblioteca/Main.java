import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Lista para simular o banco de dados de empréstimos
    private static ArrayList<Emprestimo> bdEmprestimos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Dados de exemplo para teste
        Livro livro1 = new Livro("Geologia Estrutural", "Haakon Fossen", "2010", "Cambridge", "2ª", new String[]{"Fossen"}, 5);
        Aluno aluno1 = new Aluno("Joaquim", "15/05/2005", "2023001", "Geografia");
        
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE EMPRÉSTIMOS ---");
            System.out.println("1. Novo Empréstimo (Create)");
            System.out.println("2. Listar Empréstimos (Read)");
            System.out.println("3. Atualizar Data de Devolução (Update)");
            System.out.println("4. Cancelar Empréstimo (Delete)");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1: criarEmprestimo(livro1, aluno1); break;
                case 2: listarEmprestimos(); break;
                case 3: atualizarEmprestimo(); break;
                case 4: deletarEmprestimo(); break;
            }
        }
    }

    // CREATE
    public static void criarEmprestimo(Livro livro, Pessoa pessoa) {
        System.out.print("Digite a data de devolução (dd/mm/aaaa): ");
        String data = scanner.nextLine();
        
        Emprestimo novo = new Emprestimo(livro, pessoa, data);
        bdEmprestimos.add(novo);
        System.out.println("Empréstimo realizado com sucesso para: " + pessoa.getNome());
    }

    // READ
    public static void listarEmprestimos() {
        if (bdEmprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
            return;
        }
        for (int i = 0; i < bdEmprestimos.size(); i++) {
            Emprestimo e = bdEmprestimos.get(i);
            System.out.println("[" + i + "] Livro: " + e.getLivro().getTitulo() + 
                               " | Usuário: " + e.getPessoa().getNome() + 
                               " | Devolução: " + e.getDataDev());
        }
    }

    // UPDATE
    public static void atualizarEmprestimo() {
        listarEmprestimos();
        if (bdEmprestimos.isEmpty()) return;

        System.out.print("Digite o índice do empréstimo para alterar a data: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < bdEmprestimos.size()) {
            System.out.print("Nova data de devolução: ");
            String novaData = scanner.nextLine();
            bdEmprestimos.get(index).setDataDev(novaData);
            System.out.println("Data atualizada!");
        }
    }

    // DELETE
    public static void deletarEmprestimo() {
        listarEmprestimos();
        if (bdEmprestimos.isEmpty()) return;

        System.out.print("Digite o índice do empréstimo para remover: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < bdEmprestimos.size()) {
            bdEmprestimos.remove(index);
            System.out.println("Empréstimo removido com sucesso.");
        }
    }
}