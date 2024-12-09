package com.softway.diagnosis.domain;

public interface DiagnosticSystem {

    /**
     * Méthode permettant de définir, en fonction de l'indexe de santé du patient :
     * - s'il doit aller en salle de cardiologie => indexe de santé multiple de 3
     * - s'il doit aller en salle de traumatologie => indexe de santé multiple de 5
     * - s'il doit aller dans les deux salles => indexe de santé multiple de 3 et 5
     * - il ne doit aller nulle part => indexe de santé n'est ni multiple de 3 ni multiple de 5
     *
     * @param healthIndex nombre donnée par le capteur
     * @return le nom de la salle dans laquelle doit se rendre le patient
     */
    String diagnose(int healthIndex);

}
