import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Log {

    public static void logAdd(String userName,int valueAcao) throws IOException {
        String acao = null;
        
        if (valueAcao == 1) {
            acao=Acoes.finalizar.getValue();
        }
        else if (valueAcao ==2){
            acao=Acoes.iniciar.getValue();
        }
        else if (valueAcao ==3){
            acao=Acoes.cadastrar.getValue();
        }
        else if (valueAcao ==4){
            acao=Acoes.alterar.getValue();
        }
        else if (valueAcao ==5){
            acao=Acoes.remover.getValue();
        }
        else if (valueAcao ==6){
            acao=Acoes.listar.getValue();
        }
        
        ArrayList<String> log = new ArrayList<>();
        log.add("O usuário "+userName+acao+LocalDateTime.now());
        EscreverTxt.gravarLogTxt("log",log);
    }
}
