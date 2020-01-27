package jtm.activity06;

public interface Humanoid {

    /**
     * Humanoids have two arms
     */
    final static int ARM_COUNT = 2;

    /**
     * @return weight of the current humanoid.
     */
    public int getWeight();

    /**
     * @param weight for which this humanoid weight is needed to be changed
     */
    public void setWeight(int weight);

    /**
     * @return "Dead" if humanoid successfully killed himself
     */
    public String killHimself();

    /**
     * @return number of arms for Humanoid
     */
    public int getArmCount();

    /**
     * @return content of the backpack as simple, direct reference to it, backpack can hold 10 items at max
     */
    public String[] getBackpack();

    /**
     * @param item as simple String to be stored into backpack, backpack can hold 10 items at max.
     *             If backpack is full and someone tries to add additional item, just ignore it and don't change contents of backpack
     */
    public void addToBackpack(String item);

    /**
     * @return "Alive" or "Dead" depending on his status
     */
    public String isAlive();

    /**
     * @return value of Humanoid in form "Type weight [Backpack]", e.g.
     * "Humanoid 7 [Backpack content]"
     */
    public String toString();
}
