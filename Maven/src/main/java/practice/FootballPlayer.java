package practice;

import lombok.Data;

@Data
public class FootballPlayer extends Player {

    //этот конструктрок вызывает супер класс, покачто не нужен
//    public FootballPlayer(String name, String lastName, int age) {
//        super(name, lastName, age);
//    }

    //отличный конструктор который будет создавать играков.
    public FootballPlayer(String name, String lastName, int age, int exp, int talent, int rate) {
        super(name, lastName, age);
        this.exp = exp;
        this.talent = talent;
        this.rate = rate;
    }

    @Override
    void play() {
        System.out.println("play football");

    }

    private int exp; //
    private int talent; // талант
    private int rate; // рейтинг


}
