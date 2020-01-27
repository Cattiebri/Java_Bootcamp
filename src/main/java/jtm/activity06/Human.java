package jtm.activity06;

public class Human implements Humanoid {
    private String type;
    private int weight;
    private String[] pack;
    private boolean alive;
    final static int ARM_COUNT = 2;

    public Human(int weight) {
        this.weight = weight;
        this.type = "Human";
        this.alive = true;
        this.pack = new String[10];
    }

    public Human() {
        this(42);
    }


    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public void isKilled(){
//        this.alive = false;
//    }

    @Override
    public String killHimself() {
        if (this.alive) {
            this.alive = false;
            return "Dead";
        }
        return null;
    }

    @Override
    public int getArmCount() {
        return ARM_COUNT;
    }

    @Override
    public String[] getBackpack() {
        return this.pack;
    }

    @Override
    public void addToBackpack(String item) {
        for (int i = 0; i < this.pack.length; i++) {
            if (this.pack[i] == null) {
                this.pack[i] = item;
                break;
            }
        }
    }

    @Override
    public String isAlive() {
        if (this.alive) {
            return "Alive";
        } else {
            return "Dead";
        }
    }

    public String toString() {
        String answer = "[";
        for (String element : this.pack) {
            answer = answer + element + " ";
        }
        answer = answer + "]";
        return type + weight + answer;
    }
}
