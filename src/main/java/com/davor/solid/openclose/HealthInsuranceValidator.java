package com.davor.solid.openclose;

public class HealthInsuranceValidator extends InsuranceValidator {
    public boolean isValidInsurance() {
        System.out.println("Validating Health Insurance Claim");

        return true;
    }
}
