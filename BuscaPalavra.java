import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

class BuscaPalavra{
	Scanner reader; //le as palavras
	HashMap indice; // indice de palavras
	File arquivo; // arquivo
	ListaLinha linhas; //lista lgada contendo as linhas
	
	public BuscaPalavra(File arq){
		if(arq.exists()){
			try{
				arquivo = arq;
				reader = new Scanner(arquivo);
				linhas = new ListaLinha();
			}catch(IOException e){
				System.out.println("Erro ao abrir o arquivo");
			}
		
			indice = new HashMap();
			
		}else{
			System.out.println("Arquivo não existe!");
		}
	}
	
	public void mudaArquivo(File newArq){// Muda o arquivo que esta sendo utilizado para leitura
		try{
			arquivo = newArq;
			reader = new Scanner(arquivo);
		}catch(IOException e){
			System.out.println("Erro ao abrir o arquivo!");
		}
	}
	
		public void serializaMap(HashMap e, String arquivo){//Salva o mapa num arquivo.
            try
            {
                FileOutputStream fileOut = new FileOutputStream(arquivo);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(e);
                out.close();
                fileOut.close();
            }catch(IOException i)
            {
                System.out.println("Não foi possivel serializar o objeto!");
            }
        }
	
	
	public int numeroDeOcorrencias(String palavra){//Busca sequencial.
		int num = 0;
		int numLast = 0;// sera usado para comparar com o numero atual de instancias da palavra
		int numLinha = 1;
		String frase = ""; //Salva cada linha
		try{
			reader = new Scanner(arquivo); //Reader reiniciado a cada palavra buscada
			do{
				frase = reader.nextLine();
				Scanner ler = new Scanner(frase);// lera a frase por tokens
				while(ler.hasNext()){	
					if(palavra.equals(ler.next())){ //se ha uma palavra, o contador recebe +1
						num++;
					}
				}
					if(num>numLast){// Se foi encontrada uma palavra na linha atual, essa linha eh adicionada a lista ligada
						linhas.adicionaLinha(numLinha,frase,arquivo.getName(),palavra);
						numLast=num;
					}
				numLinha++;
				ler.close();
			}while(reader.hasNextLine());
		}catch(IOException e){
			e.printStackTrace();
		}
		indice.put(palavra,num); // salva no indice
		
			
		return num;
	}
	
	public int buscaIndice(String palavra){
		if(indice.get(palavra)!=null)
			return (int)indice.get(palavra);
			
		return numeroDeOcorrencias(palavra);		
	}

}