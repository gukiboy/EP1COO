import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{
  public static void main(String args[]){
/*@Pedro*/      Scanner reader = null;
                File conf = new File("conf.txt");
                Scanner word = new Scanner(System.in);
                try{
                    reader = new Scanner(conf);
                }
                catch(IOException e){
                    System.out.println("Erro ao abrir o arquivo");
  	}
                String mec=reader.next();//Lê a primeira string do arquivo de configuração (mecanismo de busca a ser utilizado)
                String nArq=reader.next();//Lê a segunda string do arquivo de configuração (numero de arquivos de entrada a serem buscados)
                System.out.println("Digite a palavra que você deseja buscar no arquivo");
		String wurd = word.next();
                for(int i=0;i<Integer.parseInt(nArq);i++){//itera entre os arquivos de entrada e exibe o numero de ocorrencia da palavra em cada um deles
                    String arquivoatual=reader.next();                 
                    File f = new File(arquivoatual);
                    BuscaPalavra novo = new BuscaPalavra(f);
                    if("0".equals(mec)){//caso busca sequencial
                      System.out.println("Você selecionou busca sequencial. Ocorrencias de "+wurd+" no arquivo "+arquivoatual+": "+novo.numeroDeOcorrencias(wurd));
                    }
                    if("1".equals(mec)){//caso busca index
                	System.out.println("Você escolheu busca index. Ocorrencias de "+wurd+" no arquivo "+arquivoatual+": "+novo.buscaIndice(wurd));		
                    }
                }
          
	}
}
