import java.util.List;
import java.util.Scanner;

public class RocketRacing {
    public static void main(String[] args) throws Exception {
        Rocket rocket1 = initializeRocket1();
        printRockets(rocket1);
        Rocket rocket2 = initializeRocket2();
        printRockets(rocket2);
        boolean exit=false;
        while(!exit){
            String inputRocket = getInput("Choose rocket 1 or 2. Press any for exit : ");
            if(inputRocket.equals("1")) {
                printNewValuesRocket(rocket1);
            }if(inputRocket.equals("2")) {
                printNewValuesRocket(rocket2);
            }else exit=true;
        }
    }
    public static void printNewValuesRocket(Rocket rocket){
        String inputSpeed="+";
        while(inputSpeed.equals("+") || inputSpeed.equals("-")){
            inputSpeed = getInput("press + (speed up) o - (speed down) - other exit : ");
            if(inputSpeed.equals("+")) {
                rocket.speedUp();
            }else if(inputSpeed.equals("-")){
                rocket.speedDown();
            }
            printRockets(rocket);
        }
    }
    public static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static Rocket initializeRocket1() throws Exception {
        Rocket rocket1 = new Rocket("32WESSDS");
        int[] propellantsArray0 = {10,28,80};
        for(int i=0; i< propellantsArray0.length;i++){
            rocket1.addPropellantList(propellantsArray0[i]);
        }
        return rocket1;
    }
    public static Rocket initializeRocket2() throws Exception {
        Rocket rocket2 = new Rocket("LDSFJA32");
        int[] propellantsArray0 = {30,40,50,50,30,10};
        for(int i=0; i< propellantsArray0.length;i++){
            rocket2.addPropellantList(propellantsArray0[i]);
        }
        return rocket2;
    }
    public static void printRockets(Rocket rocketsIds){
            List<Propellant> arrayPropellants = rocketsIds.getPropellantList();
            System.out.print(" - " + rocketsIds.getRocketId() + " ");
            for (Propellant propellants : arrayPropellants) {
                System.out.print("(" + propellants.getCurrentPower());
                System.out.print("/" + propellants.getMaxPower() + ")");
            }
            System.out.println("- total power: " + rocketsIds.totalCurrentPower());
    }

}
