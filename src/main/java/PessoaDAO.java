class PessoaDAO {
    public static Pessoa getPessoaByID(String id){
        //pesquisa no banco
        return new PessoaImpl(id,"Pessoa " + id);
    }
}