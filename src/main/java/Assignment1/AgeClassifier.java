package Assignment1;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);

        int totalParticipants = 5;
        int[] participantAges = {35, 10, 20, 30, 40};

        int juvenileCount = 0;
        int adolescentCount = 0;
        int matureCount = 0;
        int elderCount = 0;

        for (int currentPersonAge : participantAges) {
            if (currentPersonAge >= 0 && currentPersonAge <= 12) {
                juvenileCount++;
            } else if (currentPersonAge >= 13 && currentPersonAge <= 19) {
                adolescentCount++;
            } else if (currentPersonAge >= 20 && currentPersonAge <= 59) {
                matureCount++;
            } else if (currentPersonAge >= 60) {
                elderCount++;
            }
        }

        System.out.println("Population Group Breakdown:");
        System.out.println("Juveniles (0-12): " + juvenileCount + " (" + String.format("%.2f", (juvenileCount * 100.0 / totalParticipants)) + "%)");
        System.out.println("Adolescents (13-19): " + adolescentCount + " (" + String.format("%.2f", (adolescentCount * 100.0 / totalParticipants)) + "%)");
        System.out.println("Adults (20-59): " + matureCount + " (" + String.format("%.2f", (matureCount * 100.0 / totalParticipants)) + "%)");
        System.out.println("Seniors (60+): " + elderCount + " (" + String.format("%.2f", (elderCount * 100.0 / totalParticipants)) + "%)");

        dataInput.close();
    }
}
