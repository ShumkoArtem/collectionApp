package practice;

public abstract class Player {

    /**
     * Мы не знаем что это за игрок, поэтому класс обстрактный
     */

    abstract  void  play(); // игрок во что-то играет (если это футбольный игрок, то он играет в футбол)

    private  String name;
    private  String lastName;
    private int age;

    public Player(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Player(){

    }
}


