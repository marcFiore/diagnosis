package com.softway.diagnosis.domain.service;

import com.softway.diagnosis.domain.EnumDiagnosticTranscription;

public class AutoDiagnosticSystemService implements DiagnosticSystemService {
    @Override
    public String diagnose(int healthIndex) {

        if (healthIndex % 15 == 0) {
            return EnumDiagnosticTranscription.BOTH_PATOLOGIES.frenchTranslation;
        }

        if (healthIndex % 3 == 0) {
            return EnumDiagnosticTranscription.CARDIOLOGY.frenchTranslation;
        }

        if (healthIndex % 5 == 0) {
            return EnumDiagnosticTranscription.TRAUMATOLOGY.frenchTranslation;
        }

        return EnumDiagnosticTranscription.NO_PATHOLOGIE.frenchTranslation;
    }

}