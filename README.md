# Laboratoire 1 – Application HelloToast (Android Studio)

**Cours :** Programmation Mobile  
**Date :** 22 Mars 2026  

---

## 1. Introduction

Dans ce laboratoire, j'ai développé une application Android simple appelée **HelloToast**. L'objectif principal était de me familiariser avec les bases du développement Android, notamment la création d'une interface graphique en XML, la liaison entre les composants visuels et le code Java, ainsi que la gestion des événements utilisateur (clics sur des boutons).

L'application contient deux fonctionnalités principales :
- Afficher un message temporaire (Toast) lorsqu'on appuie sur un bouton
- Incrémenter un compteur affiché à l'écran à chaque clic

---

## 2. Environnement de travail

- **IDE :** Android Studio
- **Langage :** Java
- **Gestion de version :** Git + GitHub (via Git Bash)
- **Émulateur :** Medium Phone API 36.1

---

## 3. Structure du projet

Le projet suit la structure standard d'un projet Android :

```
HelloToast/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/hellotoast/
│   │       │   └── MainActivity.java
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   └── values/
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       └── AndroidManifest.xml
```

---

## 4. Interface graphique – activity_main.xml

Le layout de l'application est défini dans le fichier `activity_main.xml`. J'ai utilisé un `LinearLayout` vertical pour empiler les éléments de haut en bas.

### Explication des éléments
- **LinearLayout** : C'est le conteneur principal. L'orientation verticale fait que chaque élément se place l'un en dessous de l'autre.
- **btn_message** : Bouton pleine largeur (`match_parent`) placé tout en haut.
- **txt_count** : Le `layout_height="0dp"` combiné avec `layout_weight="1"` permet à ce TextView d'occuper tout l'espace restant entre les deux boutons. Le fond est magenta (`#FF00FF`) et le texte est bleu (`#3F51B5`).
- **btn_incrementer** : Bouton pleine largeur placé tout en bas.

L'image ci-dessous montre l'aperçu du layout dans Android Studio. On peut y voir la disposition des éléments : le bouton en haut, la zone avec le compteur au centre, et le bouton en bas.
> <img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/fe6c3ac4-384a-4475-af3c-c6e42bce0062" />
---

## 5. Logique de l'application – MainActivity.java

Toute la logique de l'application se trouve dans le fichier `MainActivity.java`.

### Explication des éléments clés

- **`setContentView`** : Lie le fichier Java au layout XML correspondant.
- **`getSupportActionBar().setTitle()`** : Affiche le titre "Hello Toast" dans la barre de navigation en haut.
- **`findViewById`** : Permet de récupérer un composant XML dans le code Java grâce à son identifiant.
- **`setOnClickListener`** : Définit l'action à exécuter lorsque l'utilisateur clique sur un bouton.
- **`Toast.makeText`** : Affiche un petit message temporaire à l'écran.
- **`String.valueOf(count)`** : Convertit la variable entière `count` en chaîne de caractères pour l'afficher dans le TextView.

Voici l'application au lancement. Le compteur affiche la valeur initiale 0 , avec les deux boutons **Afficher le message** et **Incrémenter le compteur visibles.**
> <img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/cac9d3ac-4840-4555-9dbe-83c21b68dc4c" />

En appuyant sur le bouton **Afficher le message**, un message temporaire "Hello Toast!" apparaît en bas de l'écran pendant quelques secondes.
> <img width="1919" height="1085" alt="image" src="https://github.com/user-attachments/assets/39d73750-b978-4308-aff1-aea52b0b74cd" />

À chaque clic sur le bouton **Incrémenter le compteur**, la valeur du compteur augmente de 1. On peut voir ici le résultat après plusieurs appuis.
> <img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/308eb8ec-966a-4dbb-99ed-273f60ed133b" />

---

## 7. Mise en ligne sur GitHub

Pour versionner et partager mon projet, j'ai utilisé **Git Bash** avec les commandes suivantes :

```bash
# Configuration de l'identité Git
git config --global user.email "mon.email@gmail.com"
git config --global user.name "MonNomGitHub"

# Initialisation du dépôt local
git init
git add .
git commit -m "Premier commit - HelloToast"

# Liaison avec GitHub et envoi
git branch -M main
git remote add origin https://github.com/m4jesty228/Labs_Programmation_Mobile.git
git push -u origin main
```
> <img width="832" height="267" alt="image" src="https://github.com/user-attachments/assets/b4b60769-1a46-48fc-9767-1936a70be8d3" />
La capture ci-dessus montre le résultat du push dans Git Bash. On peut confirmer que le projet a bien été envoyé sur le repository GitHub sans erreur.
Le projet est accessible à l'adresse suivante :  
🔗 [https://github.com/m4jesty228/Labs_Programmation_Mobile](https://github.com/m4jesty228/Labs_Programmation_Mobile)

---

## 8. Résultat final

L'application fonctionne correctement :
- Le bouton **Afficher le message** affiche bien le message "Hello Toast!" en bas de l'écran.
- Le bouton **Incrémenter le compteur** incrémente bien le compteur à chaque clic.


---
