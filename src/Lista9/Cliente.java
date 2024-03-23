package Lista9;

public class Cliente {

    public Cliente(String nome, double saldo, double limite){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
    private String nome;
    private double saldo;
    private  double limite;

    public void sacar(double valor){
        if(valor > 0)
        {
            if(valor <= (saldo+limite))
            {
                saldo = saldo - valor;
                System.out.println("Valor sacado: " + valor);
            }
            else
                System.out.println("Fundos insuficientes");
        }
        else{
            System.out.println("O valor deve ser um numero positivo");
        }

    }

    public void depositar(double valor){
        if(valor > 0)
        {
            saldo = saldo + valor;
            System.out.println("Voce depositou: " + valor );
        }
        else {
            System.out.println("O valor deve ser um numero positivo");
        }

    }
    public double checarSaldo(){
        return saldo+limite;
    }

    public String  obterNome(){
        return nome;
    }
}
