package Lista9;

public class Transferencia {
    public void transferir(Cliente cliente1, Cliente cliente2, double valor) {
            if(cliente2.checarSaldo() >= valor && valor > 0)
            {
                cliente2.sacar(valor);
                cliente1.depositar(valor);
                System.out.println("O " + cliente2.obterNome() + " transferiu " + valor + " para o cliete " + cliente1.obterNome());
            }
            else
                System.out.println("Saldo insuficiente para a transferencia.");
    }
}
