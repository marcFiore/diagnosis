package com.softway.diagnosis;

import com.softway.diagnosis.domain.service.AutoDiagnosticSystemService;
import com.softway.diagnosis.domain.service.DiagnosticSystemService;

/**
 * Point d'entrée de l'application.
 * Il ne me semble pas pertinent de faire une api rest via spring boot pour cet exercice.
 * Dans le cadre d'un capteur qui envoie une info, il vaut mieux que le présent programme soit utilisé comme une librairie
 */
public class AutoDiagnostic {

    public static void main(String[] args) {
        DiagnosticSystemService diagnosticSystemService = new AutoDiagnosticSystemService();
        String diagnose = diagnosticSystemService.diagnose(Integer.valueOf(args[0]));
        System.out.println(diagnose);
    }

}
