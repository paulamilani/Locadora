package br.com.paulamilani.Locadora;

import br.com.paulamilani.Locadora.model.Director;
import br.com.paulamilani.Locadora.model.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LocadoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocadoraApplication.class, args);


        Movie movie = new Movie();
        movie.setName("Rei Leao");
        movie.setYear("2019");

        Director director = new Director();
        director.setName("Jon Favreau");
        director.setDate_birth("19-10-1966");


        List<Movie> listMovie = new ArrayList();
        listMovie.add(movie);

        List<Director> listDirector = new ArrayList<>();
        listDirector.add(director);

        System.out.println("Filme:" + movie.getName());
        System.out.println("Ano:" + movie.getYear());

        System.out.println("Diretor:" + director.getName());
        System.out.println("Data de Nascimento:" + director.getDate_birth());

    }
}
