package br.com.alura.screenmatch.calculos;

import org.jetbrains.annotations.NotNull;

public class RecommendationFilter {

    public static void filter(@NotNull Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
