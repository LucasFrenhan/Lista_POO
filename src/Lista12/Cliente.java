package Lista12;

public class Cliente {
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    private String nome;
    private String cpf;
    private Telefone telefone;

    public void mostrarDados(){
        System.out.println("O nome do cliente: " + nome);
        System.out.println("O cpf do cliente: " + cpf);
        System.out.println("O telefone do cliente: (" + telefone.obterDdd()+ ") " + telefone.obterNumero());
    }

    public void adicionarTelefone(Telefone telefone){
        this.telefone = telefone;
    }
}
