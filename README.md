# TP2 - Inversion de Contrôle (IoC) et Injection de Dépendances avec Spring

Ce projet représente le **TP2** sur l'utilisation du framework **Spring**, mettant en œuvre l'Inversion de Contrôle (IoC) et l'Injection de Dépendances (ID) via les **Annotations**, la configuration **XML**, ainsi que la gestion des environnements par **@Profile**.

## 🚀 Fonctionnalités du Projet
- **Couche DAO :** Implémentations multiples (`DaoImpl`, `DaoImpl2`) associées à l'interface `IDao`.
- **Couche Métier :** `MetierImpl` utilisant l'injection de dépendances (par annotation avec `@Autowired` / `@Qualifier` ou par configuration XML).
- **Configurations Multiples :**
  - Par Annotations (`@Configuration`, `@ComponentScan`).
  - Par Fichier XML (`applicationContext.xml`).
- **Gestion des Profils :** Utilisation de `@Profile("dev")` et `@Profile("prod")` pour sélectionner les implémentations selon l'environnement.

## 🛠️ Prérequis
- Java JDK 21
- Maven
- Un IDE (IntelliJ IDEA, Eclipse ou NetBeans)
- 
## 1. Présentation du projet

Ce projet a pour objectif de comprendre et de mettre en pratique les concepts fondamentaux de Spring :
- L'Inversion de Contrôle (IoC).
- L'Injection de Dépendances (DI).
- L'utilisation des annotations Spring.
- La gestion des beans.
- Le choix d'une implémentation avec `@Qualifier`.

## 2. Structure du projet

<img width="349" height="352" alt="image" src="https://github.com/user-attachments/assets/a8343eb2-a58a-4496-9753-68dbc425f7bb" />


## 3. Exécution du projet

### Premier résultat attendu

<img width="472" height="159" alt="200" src="https://github.com/user-attachments/assets/6bef66d1-b045-4812-8193-c1e12ba6cb2f" />

**Exécution de l'application en activant le profil de production (prod), démontrant la sélection dynamique de l'implémentation DaoImpl2 grâce à l'annotation @Profile.

### Deuxième résultat attendu

<img width="611" height="170" alt="300" src="https://github.com/user-attachments/assets/df6e5e11-7f5d-471f-829b-c1d649c1f51b" />

**Exécution de l'application en activant le profil de production (prod), démontrant la sélection dynamique de l'implémentation DaoImpl2 grâce à l'annotation @Profile.

<img width="619" height="215" alt="image" src="https://github.com/user-attachments/assets/cd1330e4-44df-4219-8535-011fe3708228" />

**Validation de la variante de configuration par fichier XML (applicationContext.xml), exécutée via la classe de présentation dédiée PresentationXml.java.

## 👩‍💻 Auteure
### Sara Ouaday
