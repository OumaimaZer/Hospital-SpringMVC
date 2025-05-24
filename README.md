# Rapport de la vidéo Part 1-Demo Spring MVC Thylemeaf Spring Data JPA, réalisée par Mr.Mohamed Youssfi
Cette vidéo offre une démonstration pratique de la mise en œuvre d'une application Spring Boot avec Spring MVC, JPA et Thymeleaf. Ce projet représente une application web simple permettant de gérer une liste de patients dans un système hospitalier.

Lien : [https://www.youtube.com/watch?v=Kfv_7m8INlU](https://www.youtube.com/watch?v=jDm-q-jEbiA)

## Objectif du TP
Créer une application web en utilisant le framework Spring Boot , permettant de : 
 -  Afficher une liste paginée de patients.
 -  Rechercher des patients par leur nom.
 -  Supprimer des patients.
 -  Utiliser Bootstrap 5 et Font Awesome (via Bootstrap Icons) pour la mise en forme visuelle.
 -  Utiliser Thymeleaf comme moteur de template HTML.

## Structure du Projet
#### 1. Entité : Patient
 -  Package : net.zerhouani.hospitalspringmvc.entities
 -  Annotations utilisées :
     *   @Entity : Pour la persistance JPA.
     *  @Data, @NoArgsConstructor, @AllArgsConstructor, @Builder : Via Lombok pour réduire le code boilerplate.
 -  Champs : id (auto-généré) - nom - dateNaissance - malade (boolean) - score
#### 3. Repository : PatientRepository
 -  Package : net.zerhouani.hospitalspringmvc.repository
 -  Interface qui étend JpaRepository.
 -  Méthodes personnalisées :
     *  findByNomContains(String keyword, Pageable pageable)
     *  Requête personnalisée via JPQL : cherher(@Param("x") String keyword, Pageable pageable)
#### 4. Contrôleur : PatientController
 -  Package : net.zerhouani.hospitalspringmvc.web
 -  Gère les requêtes HTTP :
      * "/index"  : Affiche la liste paginée des patients.
      * "/delete" : Supprime un patient par son ID (redirige vers /index).
      * "/"       : Redirection vers /index.
#### 5. Application principale : HospitalSpringMvcApplication
 -  Lance l’application Spring Boot.
 -  Implémente CommandLineRunner pour insérer des données de test à l’exécution :
 -  Insertion de trois patients dans la base H2 embarquée.
#### 6. Vue Thymeleaf : patients.html
 -  Template HTML avec intégration de Bootstrap 5 via WebJars.
 -  Formulaire de recherche.
 -  Tableau affichant les patients.
 -  Pagination dynamique.
 -  Icônes FontAwesome (via Bootstrap Icons).
 -  Intégration jQuery pour interactivité.

## Dépendances principales :
 -  Spring Data JPA : Persistance ORM
 -  Thymeleaf : Moteur de template
 -  Spring Web : Serveur web intégré
 -  H2 Database : Base de données en mémoire pour tests
 -  Bootstrap & Bootstrap-icons : Styling CSS/JS
 -  Lombok : Réduction du code boilerplate
 -  MySQL Connector : Connexion à MySQL (facultatif si utilisé)

## Fonctionnalités Implémentées :
 -  Recherche par nom : Permet de filtrer les patients selon un mot-clé.
 -  Pagination : Affichage paginé (4 éléments par page).
 -  Suppression : Supprime un patient avec confirmation JavaScript.
 -  Redirection après suppression : Retourne à la page précédente avec le mot-clé actuel.
 -  Interface utilisateur : Design responsive avec Bootstrap 5.
 -  Données initiales : Insertion automatique au démarrage de l’appli.

## Démonstration

### Essai :
![image](https://github.com/user-attachments/assets/66b846af-8e33-4c79-85e6-61a9075429d3)
![image](https://github.com/user-attachments/assets/02f8d4b2-4376-46e9-b9d4-aca08d1d2432)
![image](https://github.com/user-attachments/assets/64d3f5c4-3757-4696-aa2e-3089d2141fb9)

### Realisation :
![image](https://github.com/user-attachments/assets/b11fdd87-c511-4cd9-ab97-e2f11d2c0518)

Recherche et positionnement :
![image](https://github.com/user-attachments/assets/678354bc-055e-4455-a548-ee99b1df61ee)

Suppression :
![image](https://github.com/user-attachments/assets/8cd70ad8-baca-4925-831a-48fd9c3334a9)
![image](https://github.com/user-attachments/assets/42e722cc-cb74-4974-81f2-0646c1c83482)

## Conclusion
Ce TP illustre parfaitement les bases de la création d’une application MVC avec Spring Boot , utilisant JPA , Thymeleaf et des outils modernes comme Bootstrap . Il s’agit d’un bon point de départ pour développer une application de gestion hospitalière plus complète, notamment en ajoutant des fonctionnalités CRUD et une sécurité (ex: Spring Security).
