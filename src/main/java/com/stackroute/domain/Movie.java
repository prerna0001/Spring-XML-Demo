package com.stackroute;

public class Movie {
    private com.stackroute.Actor actor;

    public com.stackroute.Actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
