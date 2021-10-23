package com.davor.solid.openclose;

public class ManagerInsuranceApproval {

    public void approveInsurance(InsuranceValidator validator) {
        if (validator.isValidInsurance()) {
            System.out.println("Claim has been approved");
        }
    }
}
