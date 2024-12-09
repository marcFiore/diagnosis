package com.softway.diagnosis.domain;

/**
 * Enumération qui permet de centraliser les valeurs à retourner au patient.
 * Pour l'instant, le besoin est un affichage en français uniquement.
 * Si la demande évolue et nécessite une i18n, la propriété translation pourra contenir une clef d'un bundlle de langue par exemple.
 */
public enum EnumDiagnosticTranscription {

    CARDIOLOGY("Cardiologie"), TRAUMATOLOGY("Traumatologie"), BOTH_PATOLOGIES("Cardiologie, Traumatologie"), NO_PATHOLOGIE("pas de pathologie");

    public String frenchTranslation;

    EnumDiagnosticTranscription(String frenchTranslation) {
        this.frenchTranslation = frenchTranslation;
    }
}
