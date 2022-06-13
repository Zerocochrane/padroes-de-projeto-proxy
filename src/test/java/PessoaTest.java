import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void deveRetornarPessoa(){
        String saida;
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new ProxyPessoa("A"));
        pessoas.add(new ProxyPessoa("B"));
        pessoas.add(new ProxyPessoa("C"));

        saida = pessoas.get(0).getNome() + ", " + pessoas.get(1).getNome() + ", " + pessoas.get(2).getNome();

        assertEquals("Pessoa A, Pessoa B, Pessoa C", saida);
    }


}