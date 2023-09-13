package main.java.list.Pequisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //atributo
    private List<Livro> livrolist;

    public CatalogoLivro(){this.livrolist=new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo,autor,anoPublicacao));

    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist
            ) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }

            }

        }
        return livrosPorAutor;
    }
        public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervaloAnos=new ArrayList<>();
        if(!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;

        }
        public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo=l;
                    break;
                }
            }
        }
        return livroPorTitulo;
        }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro= new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 1", 2023);
    }

}



