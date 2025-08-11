package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculatorTime;
import br.com.alura.screenmatch.calculos.RecommendationFilter;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Film meuFilm = new Film("O poderoso chefão", 1970);
        meuFilm.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + meuFilm.getDurationInMinutes());

        meuFilm.displayInfo();
        meuFilm.submitRating(8);
        meuFilm.submitRating(5);
        meuFilm.submitRating(10);
        System.out.printf("Total de avaliações: %d%n", meuFilm.getScoreCount());
        System.out.println(meuFilm.getAverageScore());

        Series lost = new Series("Lost", 2000);
        lost.displayInfo();
        lost.setSeasons(10);
        lost.setEpisodesInSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.printf("Duração para maratonar Lost: %d%n", lost.getDurationInMinutes());

        Film outroFilm = new Film("Avatar", 2023);
        outroFilm.setDurationInMinutes(200);

        CalculatorTime calculadora = new CalculatorTime();
        calculadora.include(meuFilm);
        calculadora.include(outroFilm);
        calculadora.include(lost);
        System.out.println(calculadora.getTotalTime());

        RecommendationFilter.filter(meuFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setRatingScore(300);
        RecommendationFilter.filter(meuFilm);

        var filmDoPaulo = new Film("Dogville", 2003);
        filmDoPaulo.setDurationInMinutes(200);
        filmDoPaulo.submitRating(10);

        ArrayList<Film> listaDeFilms = new ArrayList<>();
        listaDeFilms.add(filmDoPaulo);
        listaDeFilms.add(meuFilm);
        listaDeFilms.add(outroFilm);
        System.out.println("Tamanho da lista " + listaDeFilms.size());
        System.out.println("Primeiro filme " + listaDeFilms.getFirst().getName());
        System.out.println(listaDeFilms);
        System.out.println("toString do filme " + listaDeFilms.getFirst().toString());


    }
}