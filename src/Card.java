public class Card {
    public int speed = 0;
    public int power = 0;
    public int agility = 0;
    public String name = "";

    public int calculate_dodge() {
        return 100 * this.power;
    };
}
