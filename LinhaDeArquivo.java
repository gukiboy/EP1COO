class LinhaDeArquivo{
  	int numero;
	String conteudo;
	String nomeArq;
	String palavra;
	LinhaDeArquivo prox;
	
	public LinhaDeArquivo(int num, String cont, String nome, String palavra){
		this.numero = num;
		this.conteudo = cont;
		this.nomeArq = nome;
		this.palavra = palavra;
	}

	void setLinha(int num, String cont, String nome,String palavra){
		this.numero = num;
		this.conteudo = cont;
		this.nomeArq = nome;
		this.palavra = palavra;
	}

	boolean temProximo(){
		if(prox!=null)
			return true;

		return false;
	}

	LinhaDeArquivo proximo(){
		return prox;
	}
	
}
