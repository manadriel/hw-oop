public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;

    public SlytherinStudent(String firstName, String secondName, int spellPower, int apparateDistance,
                            int cunning, int determination, int ambition, int resourcefulness) {
        super(firstName, secondName, spellPower, apparateDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return ". Faculty - Slytherin. " +
                "Cunning " + cunning +
                ". Determination " + determination +
                ". Ambition " + ambition +
                ". Resourcefulness " + resourcefulness;
    }
}