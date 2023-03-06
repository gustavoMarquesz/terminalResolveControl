package services;
import models.Post;
import java.util.ArrayList;
import java.util.Scanner;
import static services.Operacoes.TelaInicial;
public class PostsServices {
    static ArrayList<Post> addPost = new ArrayList<Post>();

    public static void CriarPost() {

        Scanner input = new Scanner(System.in);

        System.out.println("Seu nome: ");
        String nome = input.nextLine();

        System.out.println("Seu email: ");
        String email = input.nextLine();

        System.out.println("Seu contato de celular: ");
        String celular = input.nextLine();

        System.out.println("Empresa: ");
        String empresaNome = input.nextLine();

        System.out.println("CNPJ: ");
        String cnpj = input.nextLine();

        System.out.println("Procuração física - nome: ");
        String procuracaoFisicaNome = input.nextLine();

        System.out.println("Procuração física - CPF: ");
        String procuracaoFisicaCPF = input.nextLine();

        System.out.println("Feito no dia: ");
        int diaCadastro = input.nextInt();

        System.out.println("Feito no mês: ");
        int mesCadastro = input.nextInt();

        System.out.println("Feito no ano: ");
        int anoCadastro = input.nextInt();

        System.out.println("Observação:  ");
        String textoPost = input.nextLine();

        Post post = new Post(nome, email, celular, empresaNome, cnpj, procuracaoFisicaNome, procuracaoFisicaCPF, diaCadastro, mesCadastro, anoCadastro, textoPost);

        addPost.add(post);

        System.out.println("---- DADOS CADASTRADOS COM SUCESSO ----");

        TelaInicial();

    }
    public static void ListarPosts(){
        if(addPost.size()>0){
            for(Post posts : addPost){
                System.out.println(posts);
            }
        }else {
            System.out.println("Não existem posts cadastrados");
        }
        TelaInicial();

    }
}