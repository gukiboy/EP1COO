class Palavra{
    private int numeroDaLinhaDaPalavra;
    private String fraseDaPalavra;
    private String palavra;
    private Palavra proximo;

    public Palavra(int num, String frase, String palavra){
        this.numeroDaLinhaDaPalavra = num
        this.fraseDaPalavra = frase;
        this.palavra = palavra;
    }

    void setPalavra(int num, String frase, String palavra){
        this.numeroDaLinhaDaPalavra = num
        this.fraseDaPalavra = frase;
        this.palavra = palavra;
    }//reconfigura o objeto, redefinindo os atributos

    Palavra getProximo(){ //retorna o proximo membro da lista
        return this.proximo;
    }
}
