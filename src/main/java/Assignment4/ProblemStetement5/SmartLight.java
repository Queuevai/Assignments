package Assignment4.ProblemStetement5;

class SmartLight extends SmartDevice implements VoiceControl {

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + deviceName);
        // Specific logic to turn on a smart light (e.g., send signal to bulb)
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println(deviceName + " controlled by voice: '" + command + "'");
        // Logic to interpret and execute voice command for a light
    }
}

