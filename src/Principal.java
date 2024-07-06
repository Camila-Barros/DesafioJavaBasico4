import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println();

        Scanner leitura = new Scanner(System.in);
        ConcultaCep concultaCep = new ConcultaCep();

        System.out.println("----------------------------------------------------------------");
        System.out.println("DIGITE O CEP (SEM TRAÇO):");
        var cep = leitura.nextLine();
        System.out.println("----------------------------------------------------------------");

        try {
            DadosEndereco novoEndereco = concultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeraArquivo gerador = new GeraArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("FINALIZANDO A SESSÃO");
            System.out.println("----------------------------------------------------------------");
        }

    }
}





