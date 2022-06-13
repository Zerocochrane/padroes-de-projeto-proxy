class ProxyPessoa implements Pessoa {
    private String id;

    private Pessoa pessoa;

    public ProxyPessoa(String nome) {
        this.id = nome;
    }
    public String getNome() {
        if (pessoa == null) {
            pessoa = PessoaDAO.getPessoaByID(this.id);
        }
        return pessoa.getNome();
    }

    public String getId() {
        return this.id;
    }
}
