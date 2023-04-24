public class RavenclawStudent extends HogwartsStudent{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativeness;
    public RavenclawStudent(String firstName, String secondName, int spellPower, int apparateDistance, int intelligence, int wisdom, int wit, int creativeness) {
        super(firstName, secondName, spellPower, apparateDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativeness = creativeness;
    }

    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreativeness() {
        return creativeness;
    }
    public void setCreativeness(int creativeness) {
        this.creativeness = creativeness;
    }

    @Override
    public String toString() {
        return ". Faculty - Ravenclaw. " +
                "Intelligence " + intelligence +
                ". Wisdom " + wisdom +
                ". Wit " + wit +
                ". Creativeness " + creativeness;
    }
}