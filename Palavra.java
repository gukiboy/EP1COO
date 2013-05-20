class Palavra{
    private int numeroDaLinhaDaPalavra;
    private String fraseDaPalavra;
    private String palavra;
    private String arquivoDaPalavra;
    private Palavra proximo;

    public Palavra(int num, String frase, String palavra,String arquivo){
        this.numeroDaLinhaDaPalavra = num
        this.fraseDaPalavra = frase;
        this.palavra = palavra;
      this.arquivoDaPalavra = arquivo;
    }

    void setPalavra(int num, String frase, String palavra,String arquivo){
        this.numeroDaLinhaDaPalavra = num
        this.fraseDaPalavra = frase;
        this.palavra = palavra;
	  this.arquivoDaPalavra = arquivo;
    }//reconfigura o objeto, redefinindo os atributos

    Palavra getProximo(){ //retorna o proximo membro da lista
        return this.proximo;
    }

    boolean temProximo(){//identifica se ha alguma palavra alem dessa
	return (proximo!=NULL);
    }

    String getPalavra(){
	return this.palavra;
    }

    String getFrase(){
	return this.fraseDaPalavra;
    }

    String getArquivo(){
	return this.arquivoDaPalavra;
    }

    int getNumero(){
	return this.numeroDaLinhaDaPalavra;
    }
}
