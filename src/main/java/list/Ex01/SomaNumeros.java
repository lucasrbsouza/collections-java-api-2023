package main.java.list.Ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros= new ArrayList<>();

    public void adicionarNumeros(int numero){
        this.numeros.add(numero);

    }
    public int calcularSoma(){
        int soma=0;
        Integer numero;
        for(Iterator var2=this.numeros.iterator(); var2.hasNext(); soma+=numero){
            numero=(Integer)var2.next();


        }
        return soma;


    }



}
