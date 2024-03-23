package Lista12;

public class Telefone {

    public Telefone(String ddd, String numero){
        this.ddd = ddd;
        this.numero = numero;
    }
    private String ddd;
    private String numero;

    public String obterNumero(){
        return numero;
    }

    public String obterDdd() {
        return ddd;
    }
}
