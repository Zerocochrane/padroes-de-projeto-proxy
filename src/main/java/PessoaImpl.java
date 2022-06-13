class PessoaImpl implements Pessoa {
    private String nome;
    private String id;

    public PessoaImpl(String id,String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getId() {
        return this.id;
    }
}