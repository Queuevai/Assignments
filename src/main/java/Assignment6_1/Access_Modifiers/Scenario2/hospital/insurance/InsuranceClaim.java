package Assignment6_1.Access_Modifiers.Scenario2.hospital.insurance;


import Assignment6_1.Access_Modifiers.Scenario2.hospital.model.Patient;

public class InsuranceClaim extends Patient {

    public InsuranceClaim(String name, String hospitalId, String medicalHistory, String insuranceDetails) {
        super(name, hospitalId, medicalHistory, insuranceDetails);
    }

    public void processClaim() {
        System.out.println("--- Insurance Claim Processing for " + this.name + " ---");
        System.out.println("Patient Name (public, inherited): " + this.name);

        System.out.println("Patient ID (via public getter): " + this.getHospitalId());

        System.out.println("Insurance Details (protected, inherited): " + this.insuranceDetails);

        System.out.println("InsuranceClaim (subclass in different package) can access protected 'insuranceDetails'.");
        System.out.println("Cannot directly access default 'hospitalId' or private 'medicalHistory'.");
        System.out.println();
    }
}
