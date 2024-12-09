package com.softway.diagnosis.domain;

public class AutoDiagnosticSystem implements DiagnosticSystem {
    @Override
    public String diagnose(int healthIndex) {

        if (healthIndex % 3 == 0 && healthIndex % 5 == 0) {
            return "Cardiologie, Traumatologie";
        }

        if (healthIndex % 3 == 0) {
            return "Cardiologie";
        }

        if (healthIndex % 5 == 0) {
            return "Traumatologie";
        }
        return null;
    }
}