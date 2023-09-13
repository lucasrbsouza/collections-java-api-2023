package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;
    public OrdenacaoPessoa(){
        this.pessoaList=new ArrayList<>();

    }
    public void adcionarPessoas(String nome, int idade, double altura ){
        pessoaList.add(new Pessoa(nome, idade, altura));

    }
    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade= new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorAltura());
        return pessoasPorAltura;

    }

}