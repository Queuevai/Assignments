package Assignment1;

import java.util.Scanner;

public class SmartSensorAnalyzer {
    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);

        System.out.print("Input 8-bit sensor reading (0-255): ");
        Integer sensorReading = consoleReader.nextInt();

        if (sensorReading < 0 || sensorReading > 255) {
            System.out.println("Input out of range. Please provide a value between 0 and 255.");
            consoleReader.close();
            return;
        }

        String binaryValue = String.format("%8s", Integer.toBinaryString(sensorReading)).replace(' ', '0');
        System.out.println("Binary representation: " + binaryValue);

        boolean movementDetected = (sensorReading & 0b10000000) != 0;
        boolean illuminationStatus = (sensorReading & 0b01000000) != 0;
        boolean temperatureCondition = (sensorReading & 0b00100000) != 0;

        if (movementDetected) {
            if (!illuminationStatus) {
                System.out.println("Movement detected; lights are off. Activating illumination.");
            } else {
                System.out.println("Movement detected; lights are already on.");
            }
        } else {
            System.out.println("No movement detected.");
        }

        if (temperatureCondition) {
            System.out.println("ALERT: High temperature detected. Review sensor status.");
        } else {
            System.out.println("Temperature nominal.");
        }

        System.out.println("Ancillary sensor flags (bits 4-0): " + binaryValue.substring(3));

        consoleReader.close();
    }
}
