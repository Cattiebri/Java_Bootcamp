package jtm.activity06;

public interface Alien {

    /**
     * Aliens have 7 legs
     */
    final static int LEG_COUNT = 7;

    /**
     * @return weight of the alien
     */
    public int getWeight();

    /**
     * @param weight sets weight of the alien
     */
    public void setWeight(int weight);

    /**
     * @param humanoid represents human, needed to be eaten. Human is being killed
     *                 when it is eaten an alien gains his weight
     */
    public void eatHuman(Humanoid humanoid);

    /**
     * @return number of arms for Alien
     */
    public int getLegCount();


    /**
     * @return "I AM IMMORTAL!" because alien is immortal
     */
    public String isAlive();
}
