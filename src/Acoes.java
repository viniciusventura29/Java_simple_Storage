public enum Acoes {

    finalizar(" finzalizou o programa! --- "),iniciar(" iniciou o programa! --- "),cadastrar(" cadastrou um produto! --- "),
    alterar(" alterou a quantidade de um produto! --- "),remover(" removeu um produto! --- "),listar(" listou todos os produtos! --- ");

    private String msg;

    Acoes(String text) {
        msg=text;
    }

    public String getValue() {
        return msg;
    }
}
