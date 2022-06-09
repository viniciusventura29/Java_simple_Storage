import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int opc;
        int opcInicio;
        String userName;
        String login;
        String senha;
        Boolean logado = false;
        Cadastrar cadastrar = new Cadastrar();
        Cadastrar remover = new Cadastrar();
        Cadastrar alterar = new Cadastrar();
        Cadastrar listarQtd = new Cadastrar();
        Cadastrar sair = new Cadastrar();
        Scanner scan = new Scanner(System.in);


        System.out.println("\n");
        System.out.println("==========INICIO==========");
        System.out.println("//1 - Cadastrar usuário\n" +
                "//2 - Login\n" +
                "//3 - Sair");

        opcInicio = scan.nextInt();


        if (opcInicio == 1) {
            scan.nextLine();
            System.out.println("Digite o nome de usuário: ");
            login = scan.nextLine();

            System.out.println("Digite o a senha: ");
            senha = scan.nextLine();

            cadastrar.cadastrarUser(login, senha);
            System.out.println(EscreverTxt.lerTxt("usuarios"));


        } else if (opcInicio == 2) {
            var ler = EscreverTxt.lerTxt("usuarios");


                scan.nextLine();
            while (true) {
                System.out.println("Digite o nome de usuário: ");
                login = scan.nextLine();
                System.out.println(" ");

                System.out.println("Digite o a senha: ");
                senha = scan.nextLine();
                System.out.println(" ");

                for (int i = 0; i < ler.size()-1 ; i++) {

                    String nomeForLogin = ler.get(i);
                    String senhaForLogin = ler.get(i + 1);

                    if (Objects.equals(nomeForLogin, login) && Objects.equals(senhaForLogin, senha)){

                        System.out.println(" \n\n\n\n\n");
                        Log.logAdd(login, 2);
                        System.out.println("Usuário logado com sucesso!");
                        System.out.println(" ");
                        logado = true;
                        break;
                    }
                }

                if (logado)
                    break;

                else
                    System.out.println("Usuário não cadastrado!");
                System.out.println(" ");
            }




        while (true) {
            System.out.println("\n");
            System.out.println("==========MENU==========");

            System.out.println("Qual opercação deseja realizar?");

            System.out.println("//1 - cadastrar produto\n" +
                    "//2 - Alterar quantidade do produto\n" +
                    "//3 - Remover produto\n" +
                    "//4 - Listar produtos cadastrados\n" +
                    "//5 - Sair");


            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    cadastrar.cadastrar();
                    //              Criar umm metodo,classe log, onde eu passo username e a ação que ele fez e lá eu trato a questao de gravar
                    Log.logAdd(login, 3);
                    break;

                case 2:
                    alterar.alterar();
                    Log.logAdd(login, 4);
                    break;

                case 3:
                    remover.remover();
                    Log.logAdd(login, 5);
                    break;

                case 4:
                    listarQtd.listaQtd();
                    Log.logAdd(login, 6);
                    break;

                case 5:
                    Log.logAdd(login, 1);
                    sair.sair();

            }
        }
    }
}
}