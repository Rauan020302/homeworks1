package com.company;


public class Team implements Runnable{
    private String name;
    private Game game;

    public Team(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    @Override
    public void run() {

        System.out.println(name+"\n Количество забитых мячей-" + game.getBallCount() + ", количество желтых карточек " + game.getYellowCards() + ", количество Offside " + game.getOffsideCount());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
