package Lista9;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas", 100, 100);
        Cliente c2 = new Cliente("Matheus", 1000, 500);
        Transferencia trans = new Transferencia();

        System.out.println(c1.obterNome());
        System.out.println(c1.checarSaldo());
        System.out.println(c2.obterNome());
        System.out.println(c2.checarSaldo());

        trans.transferir(c1, c2, 1);

        System.out.println(c1.obterNome());
        System.out.println(c1.checarSaldo());
        System.out.println(c2.obterNome());
        System.out.println(c2.checarSaldo());

    }
}
