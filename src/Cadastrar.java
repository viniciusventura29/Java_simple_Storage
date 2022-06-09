import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
    Scanner scan = new Scanner(System.in);


    public void cadastrarUser(String login,String senha) throws IOException {
        EscreverTxt.gravarUsuário("usuarios",login,senha);

    }


    public void cadastrar() throws IOException {
        String nomeProd;
        String qtdProd;
        ArrayList<String>produtos = new ArrayList<>();


        scan.nextLine();

        System.out.println("Digite o nome do produto: ");
        nomeProd = scan.nextLine();

        scan.nextLine();

        System.out.println("Digite a quantidade desse produto: ");
        qtdProd=scan.nextLine();


        produtos.add(nomeProd);
        produtos.add(qtdProd);

        EscreverTxt.gravarProds("produtos",produtos);

    }


    public void remover() throws IOException {
        var produtos = EscreverTxt.lerTxt("produtos");
        listaQtd();
        System.out.println("Qual produto você deseja remover?");
        int index = scan.nextInt();

        produtos.remove(index - 1);
        produtos.remove(index-1);
        EscreverTxt.reescreverProds("produtos",produtos);
    }


    public void alterar() throws IOException {
        var produtos = EscreverTxt.lerTxt("produtos");
        listaQtd();
        System.out.println("Qual produto você deseja alterar?");
        int index = scan.nextInt();

        System.out.println("Qual produto você deseja alterar?");
        scan.nextLine();
        String qtdProd = scan.nextLine();

        produtos.remove(index+(index-1));
        produtos.add(index+(index-1),qtdProd);
        EscreverTxt.reescreverProds("produtos",produtos);
        }



    public void listaQtd() throws IOException {
        var produtos = EscreverTxt.lerTxt("produtos");
        ArrayList<String> nomeProd = new ArrayList<>();
        ArrayList<String> qtdProd = new ArrayList<>();
        int count = 0;
        int auxCount = 0;
        ArrayList<Integer> countProd = new ArrayList<>();
        String retorno = "";
        for (String prod : produtos) {
            
            if (count%2==0){
                nomeProd.add(prod);
                auxCount+=1;
                countProd.add(auxCount);
            }
            else {
                qtdProd.add(prod);
            }
            
            count++;


        }
        for (int i = 0; i < nomeProd.size() ; i++) {
            retorno = retorno.concat(String.format("%d Produtos: %s ------------- %s \n", countProd.get(i), nomeProd.get(i), qtdProd.get(i)));
        }
        System.out.println(" ");
        System.out.println("=========PRODUTOS==========");
        System.out.println(retorno);
    }


    public void sair(){
        System.out.println("Programa encerrado!");
        System.exit(0);
    }
}
