package com.IronTrivia.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by alexanderhughes on 3/17/16.
 */
@Entity
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue
    int id;
    @NotNull
    int score = 0;
    @ManyToOne
    User user;
    @ManyToOne
    Game game;

    public Score() {
    }

    public Score(User user, Game game) {
        this.user = user;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}