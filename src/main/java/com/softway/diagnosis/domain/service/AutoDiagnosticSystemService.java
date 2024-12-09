package com.softway.diagnosis.domain.service;

import com.softway.diagnosis.domain.EnumDiagnosticTranscription;

public class AutoDiagnosticSystemService implements DiagnosticSystemService {
    @Override
    public String diagnose(int healthIndex) {

        if (healthIndex % 15 == 0) {
            return EnumDiagnosticTranscription.BOTH_PATOLOGIES.getFrenchTranslation();
        }

        if (healthIndex % 3 == 0) {
            return EnumDiagnosticTranscription.CARDIOLOGY.getFrenchTranslation();
        }

        if (healthIndex % 5 == 0) {
            return EnumDiagnosticTranscription.TRAUMATOLOGY.getFrenchTranslation();
        }

        return EnumDiagnosticTranscription.NO_PATHOLOGIE.getFrenchTranslation();
    }

}