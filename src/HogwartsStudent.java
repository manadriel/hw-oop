import java.util.Objects;
public class HogwartsStudent {
    private final String firstName;
    private final String secondName;
    private int spellPower;
    private int apparateDistance;

    public HogwartsStudent(String firstName, String secondName, int spellPower, int apparateDistance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.spellPower = spellPower;
        this.apparateDistance = apparateDistance;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getSpellPower() {
        return spellPower;
    }
    public int getApparateDistance() {
        return apparateDistance;
    }
    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
    public void setApparateDistance(int apparateDistance) {
        this.apparateDistance = apparateDistance;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", spellPower=" + spellPower +
                ", apparateDistance=" + apparateDistance +
                '}';
    }
}
