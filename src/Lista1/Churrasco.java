package Lista1;

import javax.xml.transform.stream.StreamSource;

public class Churrasco {
    private double qtdCarne;

    public Churrasco(){

    }
    public void verificarConsumo(Pessoa pessoa){
        if(!pessoa.vegetariana)
        {
            if(pessoa.idade >= 0 && pessoa.idade <= 3)
                System.out.println("Sem consumo.");
            if(pessoa.idade >= 4 && pessoa.idade <= 12) {
                qtdCarne = 1;
                System.out.println("O consumo foi de: " + qtdCarne + "kg");
            }
            if(pessoa.idade >= 13){
                qtdCarne = 2;
                System.out.println("O consumo foi de: " + qtdCarne + "kg");
            }
        }
        else{
            System.out.println("Vegetarianos não consomem carne.");
        }
    }
}
