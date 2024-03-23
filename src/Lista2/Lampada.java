package Lista2;

public class Lampada {

    public Lampada() {
        this.estado = Estado.APAGADA;
    }
    private int qtdAcendimentos;
    private Estado estado;

    public void click(){
        if(estado == Estado.APAGADA) {
            estado = Estado.ACESA;
            qtdAcendimentos++;
        }
        else
            estado = Estado.APAGADA;
    }

    public void qtdAcendimentos(){
        System.out.println("A lampada foi acesa: " + qtdAcendimentos);
    }

    public void checaEstado(){
        System.out.println("O estado da lampada e: " + estado);
    }
}
