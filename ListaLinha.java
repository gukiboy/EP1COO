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
		fim.prox = aux;
		fim = fim.proximo();
		return;
	}
	
	void imprimeLista(){
		LinhaDeArquivo aux = inicio;
			do{
				System.out.println("Arquivo: "+aux.nomeArq+ 
								 "\nFrase :"+aux.conteudo);
				aux=aux.prox;
			}while(aux!=fim);
	}

}
