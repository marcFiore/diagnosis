# diagnosis
Test technique pour softway

Implémentation d'un algo type fizzbuzz en mode TDD, avec tests gherkin et tests de mutations.
Je suis parti sur une implémentation simple, sans spring

Pour exécuter le programme : 
builder le projet :
`mvn clean install`

récupérer le jar diagnosis-0.0.1-SNAPSHOT.jar dans le dossier target,
l'exécuter :

`java -jar diagnosis-0.0.1-SNAPSHOT.jar X`

(ou X est l'indice de santé fournit par le capteur)


Les rapports de tests se trouvent toujours dans target : 
- Pour le rapport cucumber :
\target\cucumber-reports.html

- Pour le rapport des TU :
\target\site\jacoco\index.html

- Pour le rapport de mutation testing :
\target\pit-reports\index.html
