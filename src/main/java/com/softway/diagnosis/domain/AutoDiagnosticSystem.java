package com.softway.diagnosis.domain;

public class AutoDiagnosticSystem implements DiagnosticSystem {
    @Override
    public String diagnose(int healthIndex) {
        if (healthIndex % 3 == 0) {
            return "Cardiologie";
        }
        return null;
    }
}