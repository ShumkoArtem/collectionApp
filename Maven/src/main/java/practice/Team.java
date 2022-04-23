package practice;

import java.util.Collection;

public abstract class Team<T> {

    private Collection<T> players; //игроки приходят из коллекции
    private int budget; // бюджет команды
    private String teamName; //имя команды
    private String headCoachName; // главный тренер

    // если есть хотя бы один обстракный метод, то и клас должен быть обстрактный
    // абстрактные методы не имеют реализации.
    public abstract T buyPlayer(T newPlayer); // купить игрока

    public abstract T sellPlayer(T delPlayer); // продать игрока

    // конструктор создания команды
    public Team(int bud, String teamName, String headCoachName) {
        this.budget = bud;
        this.teamName = teamName;
        this.headCoachName = headCoachName;
    }

    //добавить бюджет
    public void addBud(int budget) {
        this.budget += budget;
    }

    //уменьшить бюджет
    public void reduseBud(int budget) {
        this.budget -= budget;
    }

    public Collection<T> getPlayers() {
        return players;
    }

//    public String getTeamName() {
//        return teamName;
//    }
//
//    public String getHeadCoachName() {
//        return headCoachName;
//    }

    // пришел игрок на удаление
    public boolean removePlayer(T player) {
        return players.remove(player);
    }

    // пришел игрок на добавление
    public boolean addPlayer(T player) {
        return players.remove(player);
    }

    public void setPlayers(Collection<T> players){
        this.players = players;
    }

}
