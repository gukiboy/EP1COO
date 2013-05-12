class ListaLinha{
  LinhaDeArquivo inicio;
	LinhaDeArquivo fim;

	public ListaLinha(){
		inicio = null;
		fim = null;
	}

	void adicionaLinha(int num, String cont, String nomeArq,String palavra){
		if(inicio == null){//Lista vazia
			inicio = new LinhaDeArquivo(num,cont,nomeArq, palavra);
			fim = inicio;
			return;
		}
		LinhaDeArquivo aux = new LinhaDeArquivo(num,cont,nomeArq,palavra);
		aux.prox = null;
		fim.prox = aux;
		fim = fim.proximo();
		return;
	}
	
	void imprimeLista(){ //Imprime a lista, com as frases e arquivos aonde estão as palavras
		LinhaDeArquivo aux = inicio;
			do{
				System.out.println("Arquivo: "+aux.nomeArq+ 
								 "\nFrase :"+aux.conteudo);
				aux=aux.prox;
			}while(aux!=null);
	}

}
