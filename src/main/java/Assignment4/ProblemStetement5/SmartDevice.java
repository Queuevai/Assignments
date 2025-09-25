package Assignment4.ProblemStetement5;

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    // Abstract method for turning on, to be implemented by subclasses
    public abstract void turnOn();
}

