package compiler;
//classe para realizar a leitura do arquivo de texto, caminho e conte�do do arquivo a ser lido, ou seja o caminho e o conte�do do codigoTeste.txt
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
    public static String Read(String caminho) throws Exception{
        String conteudo = "";
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha + "\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                throw new Exception("Erro na leitura do arquivo.");
            }
        } catch (FileNotFoundException ex) {
            throw new Exception("Arquivo não encontrado.");
        }
    }
}