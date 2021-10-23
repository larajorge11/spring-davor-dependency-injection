package com.davor.solid.openclose;

public class HealthInsuranceApproval {

    public void approveHealthInsurance(HealthInsuranceValidator validator) {
        if (validator.isValidInsurance()) {
            System.out.println("Health Claim has been approved");
        }
    }

    /*
    Breaking down the Open - Close principle, adding a new method in a class that should be just for Health
     */
    public void approveVehiculeInsurance(VehiculeInsuranceValidator validator) {
        if (validator.isValidInsurance()) {
            System.out.println("Vehicule Claim has been approved");
        }
    }
}
