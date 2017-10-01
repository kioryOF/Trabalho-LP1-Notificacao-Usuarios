package Notificacoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeArquivoTexto {
    private Scanner entrada;

    void abreArquivo(String arquivo) throws FileNotFoundException {
        entrada = new Scanner(new File(arquivo));
    }

    String leDados() {
        if (entrada.hasNext()) {
            return entrada.next();
        } else {
            return null;
        }
    }

    void fechaArquivo() {
        entrada.close();
    }
}
