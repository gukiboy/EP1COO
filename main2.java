import java.io.File;

public class main2{
	public static void main(String args[]){
		System.out.println("Default Text Readaer 1.0");
		System.out.println("Digite o nome do arquivo que deseja buscar:\n");
		File f = new File("entrada.txt");
		File f2 = new File("entrada2.txt");
		BuscaPalavra novo = new BuscaPalavra(f);
		String wurd = "you";
		System.out.println("Ocorrencias de "+wurd+": "+novo.numeroDeOcorrencias(wurd));
		System.out.println("Ocorrencias de "+wurd+": "+novo.buscaIndice(wurd));
		wurd = "love";
		System.out.println("Ocorrencias de "+wurd+": "+novo.numeroDeOcorrencias(wurd));
		System.out.println("Ocorrencias de "+wurd+": "+novo.buscaIndice(wurd));
		novo.linhas.imprimeLista();
		
	}


}