package Lista1;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Lucas", "M", 29, false);

        Churrasco c = new Churrasco();
        c.verificarConsumo(p);
    }
}
