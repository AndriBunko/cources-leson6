package com.abunko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Films {
    private List<Film> films = new ArrayList<>();

    public void addFilm(Film f){
        films.add(f);
    }

    public List<Film> sortFilmsByGare(Genre ... genres) {
        ArrayList<Film> sortFilms = new ArrayList<>();
        for (Film f : films) {
            if (f.getGenres().containsAll(Arrays.asList(genres)))
                sortFilms.add(f);
        }
        return sortFilms;
    }

    public List<Film> sortFilmsByActor(Actor ... actors) {
        ArrayList<Film> sortFilms = new ArrayList<>();
        for (Film f : films) {
            if (f.getActors().containsAll(Arrays.asList(actors)))
                sortFilms.add(f);
        }
        return sortFilms;
    }

    public List<Film> sortFilmsByYear(int star, int end) {
        ArrayList<Film> sortFilms = new ArrayList<>();
        for (Film f : films) {
            if (f.getYearRelease() >= star && f.getYearRelease() <= end)
                sortFilms.add(f);
        }
        return sortFilms;
    }

}
