public class Propellant {
    int maxPower;
    int currentPower;

    public Propellant(int maxPower) throws Exception{
        if(maxPower <=0) {
            throw new Exception("Must be mayor to zero");
        }
        this.maxPower = maxPower;
        this.currentPower = 0;
    }


    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    public int getCurrentPower() {
        return currentPower;
    }
    public int getMaxPower() {
        return maxPower;
    }
    public void speedUpPropellant(){
        currentPower += 10;
        if(currentPower>maxPower) currentPower=maxPower;
    }

    public void speedDownPropellant(){
        int currentPower = getCurrentPower();
        if(currentPower < 10){
            setCurrentPower(0);
        }else{
            setCurrentPower(currentPower-10);
        }
    }
}
