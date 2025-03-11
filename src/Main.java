import Classes.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Book> book = new ArrayList<>();

        while(true){
            System.out.println("INTERFACE");
            System.out.println("1 - CADASTRAR LIVRO");
            System.out.println("2 - LISTAR LIVRO");
            System.out.println("3 - EMPRESTAR LIVRO");
            System.out.println("4 - DEVOLVER LIVRO");
            System.out.println("5 - SAIR");
            int opcao = sc.nextInt();
            sc.nextLine();

        switch (opcao) {
            case 1:
            System.out.println("Cadastrar livro");
            System.out.println("Enter name");
            String name = sc.nextLine();


            System.out.println("Enter id");
            int id = sc.nextInt();

            Book books = new Book(name , id);
            book.add(books);
                break;
            case 2:
                System.out.println("Listar Livros");
                for(Book livros : book){
                    System.out.println(livros);
                }
                break;

            case 3:
                System.out.println("Emprestar");
                System.out.println("Digite o id do livro");
                int emprestar = sc.nextInt();

                Book emprestimo = book.stream()
                        .filter(b -> b.getId() == emprestar)
                        .findFirst()
                        .orElse(null);

                if (emprestimo != null) {
                    if (!emprestimo.isEmprestado()) {
                        emprestimo.setBorrowed(true);
                        System.out.println("Livro emprestado: " + emprestimo.getName());
                    } else {
                        System.out.println("Livro já emprestado.");
                    }
                } else {
                    System.out.println("Livro não encontrado.");
                }


            case 4:
                break;

            case 5:
                sc.close();
                return;
        }
        }

        }

    }
