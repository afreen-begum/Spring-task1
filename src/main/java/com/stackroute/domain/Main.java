package com.stackroute.domain;
import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) context.getBean("MovieA", Movie.class);
        System.out.println(movie1);

        Movie movie2 = (Movie) context.getBean("MovieB");
        System.out.println(movie2);

        System.out.println(movie1 == movie2);

    }
}
