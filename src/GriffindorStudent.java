public class GriffindorStudent extends HogwartsStudent{  //rashirenie Hgwrts with extend!
    private int nobleness;
    private int honor;
    private int courage;
    public GriffindorStudent(String firstName, String secondName, int spellPower, int apparateDistance, int nobleness, int honor, int courage) {
        super(firstName, secondName, spellPower, apparateDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.courage = courage;
    }
    public int getNobleness() {
        return nobleness;
    }
    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getCourage() {
        return courage;
    }
    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return ". Faculty Griffindor. " +
                "Nobleness " + nobleness +
                ". Honor " + honor +
                ". Courage " + courage;
    }
}