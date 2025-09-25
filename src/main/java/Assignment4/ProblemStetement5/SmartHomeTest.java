package Assignment4.ProblemStetement5;

public class SmartHomeTest {
    public static void main(String[] args) {
        // Smart Light operations
        SmartLight livingRoomLight = new SmartLight("Smart Light");
        livingRoomLight.turnOn();
        livingRoomLight.controlByVoice("Turn on the lights");

        System.out.println(); // For better readability

        // Smart AC operations
        SmartAC bedroomAC = new SmartAC("Smart AC");
        bedroomAC.turnOn();
        bedroomAC.controlByVoice("Set temperature to 22°C");
    }
}
