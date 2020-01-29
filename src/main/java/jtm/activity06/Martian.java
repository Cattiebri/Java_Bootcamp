package jtm.activity06;

public class Martian implements Humanoid, Alien, Cloneable {
    private int weight;
    private String[] pack;

    final static int LEG_COUNT = 7;
    final static int ARM_COUNT = 2;

    public Martian() {
        this.weight = 42;
        this.pack = new String[10];
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Martian m = new Martian();
        m.setWeight(weight);
        return m;
    }

    @Override
    public void eatHuman(Humanoid humanoid) {
        if (humanoid.isAlive().equals("Alive")) {
            this.weight += humanoid.getWeight();
            humanoid.killHimself();
        }
    }

    @Override
    public int getLegCount() {
        return LEG_COUNT;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String killHimself() {
        return isAlive();
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
        for (int i = 0; i <this.pack.length; i++) {
            if (this.pack[i] == null) {
                this.pack[i] = item;
                break;
            }
        }
    }

    @Override
    public String isAlive() {
        return "I AM IMMORTAL!";
    }
}
