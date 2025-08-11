package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Film meuFilm = new Film("O poderoso chefão", 1970);
        meuFilm.submitRating(9);
        Film outroFilm = new Film("Avatar", 2023);
        outroFilm.submitRating(6);
        var filmeDoPaulo = new Film("Dogville", 2003);
        filmeDoPaulo.submitRating(10);
        Series lost = new Series("Lost", 2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilm);
        lista.add(outroFilm);
        lista.add(lost);
        for (Title item: lista) {
            System.out.println(item.getName());
            if (item instanceof  Film film && film.getClassification() > 2) {
                System.out.println("Classificação " + film.getClassification());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getYearReleased));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
