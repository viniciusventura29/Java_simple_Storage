import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class EscreverTxt {

    private String nome;
    private List<String> lista;

    public static void gravarLogTxt(String nome, List<String>lista) throws IOException {



        Path caminho = Paths.get(nome + ".txt");
        if (Files.exists(caminho)){
            Files.write(caminho, lista, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
        }

        else {
            Files.write(caminho, lista, StandardCharsets.UTF_8);
        }


    }

    public static void gravarUsuário(String nome, String login,String senha) throws IOException {

        ArrayList<String> usuarios =new ArrayList<>();
        Path caminho = Paths.get(nome + ".txt");

        usuarios.add(login);
        usuarios.add(senha);

        if (Files.exists(caminho)){
            Files.write(caminho, usuarios, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
        }

        else {
            Files.write(caminho, usuarios, StandardCharsets.UTF_8);
        }


    }

    public static ArrayList<String>  lerTxt(String nomeArquivo) throws IOException {
        Path caminho = Paths.get(nomeArquivo+".txt");
        ArrayList<String> dados = new ArrayList<>(Files.readAllLines(caminho));

        return dados;
    }

    public static void gravarProds(String nome, List<String>lista) throws IOException {

        Path caminho = Paths.get(nome + ".txt");
        if (Files.exists(caminho)){
            Files.write(caminho, lista, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
        }

        else {
            Files.write(caminho, lista, StandardCharsets.UTF_8);
        }


    }

    public static void reescreverProds(String nome, List<String>lista) throws IOException {

        Path caminho = Paths.get(nome + ".txt");

        Files.write(caminho, lista, StandardCharsets.UTF_8);




    }

}


