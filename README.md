# Script d'Automatisation de Connexion avec Selenium (Java)

Ce script Java utilise Selenium pour automatiser le processus de connexion à un site Web à l'aide du navigateur Chrome. Le script saisit les informations d'identification, soumet le formulaire de connexion.

## Prérequis

- **Java :** Assurez-vous que Java est installé sur votre machine. (_**Java 11 de préférence**_)
- **Selenium WebDriver :** Téléchargez la bibliothèque Selenium WebDriver pour Java [ici](https://www.selenium.dev/downloads/).

## Configuration

1. Téléchargez le driver Chrome pour Selenium et assurez-vous d'indiquer le chemin correct du driver dans le script.
2. Importez le projet dans votre IDE Java préféré.

## Utilisation

1. Exécutez le script `Connexion.java`.
2. Le navigateur Chrome s'ouvrira, se connectera au site Web, puis se fermera après la vérification de la connexion.

## Tutoriel vidéo
Le tutoriel vidéo est disponible sur notre chaîne Youtube et accessible via ce [lien](https://youtu.be/NfWn7F_uT0A)

## Personnalisation

- Modifiez les valeurs de `usernameField.sendKeys("nom_utilisateur");` et `passwordField.sendKeys("mot_de_passe");` avec vos propres informations d'identification.
- Adaptez le script en fonction des spécificités de votre application.

## Avertissement

Assurez-vous de respecter les conditions d'utilisation du site Web que vous automatisez. L'utilisation abusive ou non autorisée peut violer les termes du service.

## Auteur

Nana ACKA

## Licence

Ce projet est sous licence [MIT](LICENSE).

