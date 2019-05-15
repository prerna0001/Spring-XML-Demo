package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware {
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "" + actor ;
    }
    @Override
    public  void setApplicationContext(ApplicationContext applicationContext)
    {
        System.out.println(applicationContext);
        Actor actor=(Actor)applicationContext.getBean("actor");
        System.out.println("from Movie class:"+ actor);
    }
}
