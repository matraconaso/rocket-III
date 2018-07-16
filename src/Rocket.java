import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String rocketId;
    private List<Propellant> propellantList = new ArrayList<Propellant>();

    public Rocket(String rocketId) throws Exception {
        if(rocketId.length()!=8) {
            throw new Exception("Error: ID is incorrect");
        }
        this.rocketId = rocketId;

    }
    public String getRocketId() {
        return rocketId;
    }
    public void speedUp(){
            for (Propellant propellant : propellantList) {
                propellant.speedUpPropellant();
            }
    }
    public void speedDown(){
            for (Propellant propellant : propellantList) {
                propellant.speedDownPropellant();
            }
    }
    public int totalCurrentPower(){
        int totalPower=0;
        for (Propellant propellants : propellantList) {
            totalPower +=  propellants.getCurrentPower();
        }
        return totalPower;
    }

    public void addPropellantList(int i) throws Exception {
        propellantList.add(new Propellant(i));
    }

    public List<Propellant> getPropellantList() {
        return propellantList;
    }
}
