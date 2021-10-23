package com.davor.solid.openclose;

import org.junit.jupiter.api.Test;

class ManagerInsuranceApprovalTest {

    @Test
    void approveHealthInsurance() {
        ManagerInsuranceApproval managerInsuranceApproval = new ManagerInsuranceApproval();

        managerInsuranceApproval.approveInsurance(new HealthInsuranceValidator());

        managerInsuranceApproval.approveInsurance(new VehiculeInsuranceValidator());
    }
}
