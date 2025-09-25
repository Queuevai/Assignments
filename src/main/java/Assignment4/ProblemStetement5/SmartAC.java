package Assignment4.ProblemStetement5;

class SmartAC extends SmartDevice implements VoiceControl {

    public SmartAC(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + deviceName);
        // Specific logic to turn on a smart AC (e.g., power up unit)
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println(deviceName + " controlled by voice: '" + command + "'");
        // Logic to interpret and execute voice command for an AC
    }
}
