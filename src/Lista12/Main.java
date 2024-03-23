package Lista12;

public class Main {
    public static void main(String[] args) {
        Telefone t = new Telefone("99", "987654321");
        Cliente c = new Cliente("Lucas", "99999999999");
        c.adicionarTelefone(t);
        c.mostrarDados();
    }
}
