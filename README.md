# Envahisseurs de l'espace

Pour le module M2104, nous réalisons un projet qui consiste à reproduire le jeu Spaceinvaders.


- [Semaine n°1 : du 30 mars au 04 avril](#semaine1) 
- [Semaine n°2 : du 07 au 12 avril](#semaine2)  
- [Semaine n°3 : du 15 au 20 avril](#semaine3)  
- [Semaine n°4 : du 11 au 16 mai](#semaine4)
- [Semaine n°5 : du 18 au 23 mai](#semaine5)
- [Glossaire](#glossaire)
## Semaine n°1 : du 30 mars au 04 avril <a id="semaine1"></a>

### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

- Story n°1 : Créer un espace de jeu  
Un espace de jeu est créé aux dimensions données (2D) 
Cet espace de jeu est vide

Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
 Contraintes :
La position souhaitée est transmise par ses coordonnées x et y.
Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
Le vaisseau est positionné aux coordonnées transmises  
Un nouveau vaisseau est créé
La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    
 
- Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu  
Le vaisseau se déplace d'un pas vers la droite 
Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


- Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu  
Le vaisseau se déplace d'un pas vers la gauche 
Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

### Fonctionnalité en cours d’implémentation : 
Aucune


### Diagramme de classes 

![Diagrammes de classes de la semaine 1](https://github.com/GuillaumeCoulaud/image/blob/master/Diagramclasssemaine1.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![Nuage de mots de la semaine 1](https://github.com/GuillaumeCoulaud/image/blob/master/unilim.png)


### Difficultés rencontrées 
J'ai rencontré  quelques difficultés liées à un oublie et à une faute d'inatention. 
Pour la  story 2 , j'avais placé  les classes Vaisseau et SpaceInvaders dans test aulieu de java. J'ai aussi oublié le import  aprés avoir créé le package utils.

### Remarques diverses
 Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

-------------
## Semaine n°2 : du 07 au 12 avril <a id="semaine2"></a>
#### Fonctionnalité n°2: Dimensionner le vaisseau

Dans cette storie nous devons donner une dimension au vaisseau. Ce qui n'était pas le cas jusque la. Pour ce faire nous devons écrire une nouveau test  postionner un nouveau vaisseau de dimension (3,2) à la position (7,9) afin de visualier une étape d'assertion similaire 

Histoire 2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu
Désormais, nous voulons lever une exception si pour une une position (x,y) donnée, un vaisseau déborde de l'espace de jeu (c-a-d en sort partiellement). Le comportement à tester étant différent, il semblerait judicieux d'écrire une nouvelle méthode de test afin de montrer cette nouvelle intention.

Histoire 3:Déplacer un vaisseau vers la droite en tenant compte de sa dimension
Deux cas de tests peuvent être envisagés pour tester le déplacement du vaisseau vers la droite en tenant compte de sa dimension :

le cas normal où le vaisseau effectue son déplacement en restant dans l'espace de jeu.
le cas limite où le vaisseau, étant déjà sur la bordure droite de l'espace jeu, ne peut pas se déplacer sous peine de déborder de l'espace jeu.

###difficultées recontrées:
Je ne savais pas quoi mettre dans les méthodes abscisseLaPlusAGauche et abscisseLaPlusADroite ce qui m'a bloqué pendant pas mal de temps.

## Semaine n°3 : du 15 au 20 avril <a id="semaine3"></a>

Histoire 4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension:
Exemple n°1 : le vaisseau se déplace normalement vers la gauche avec par exemple dans un espace de dimensions (15, 10) un vaisseau de dimensions (3,2) positionné en (7,9) qui se retrouve à la position (6,9) après un déplacement vers la gauche.

Exemple n°2 : le vaisseau reste immobile s'il est déjà sur la bordure gauche de l'espace de jeu avec par exemple dans un espace de dimensions (15, 10) un vaisseau de dimensions (3,2) positionné en (0,9) reste à la position (0,9) après un déplacement vers la gauche.
#### Fonctionnalité en cours d'implémentation : 
 Fonctionnalité n°3:Choisir la vitesse du vaisseau
 
 ## Semaine n°4 : du 11 au 16 mai <a id="semaine4"></a>
	 Fonctionnalité n°3:Choisir la vitesse du vaisseau
	 	story 1 :Déplacement vers la droite pour une vitesse quelconque
	 	Prenons l'exemple d'un déplacement normal vers la droite d'un vaisseau qui irait à une vitesse de 3, et qui après son déplacement se trouverait toujours 
	 	dans l'espace de jeu.

![Diagrammes de classes de la semaine 4](https://github.com/GuillaumeCoulaud/image/blob/master/semaine4.png)

## Semaine n°5 : du 18 au 23 mai <a id="semaine5"></a>
	Fonctionnalité n°3:
		story 2 :Déplacement vers la gauche pour une vitesse quelconque
		identique à la précédente story mais déplacement vers la gauche.
		
	Fonctionnalié n°4:
		refactoring sprite
		
![Diagrammes de classes de la semaine 5](https://github.com/GuillaumeCoulaud/image/blob/master/semaine5.gif)		
		

## Glossaire <a id="glossaire"></a>

* **Vaisseau** :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

* **Envahisseur**  :  ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.


* **Missile** :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

* **Personnage** : Etre fictif et virtuel, contrôlé ou non par le joueur, qui apparaît dans un jeu vidéo.
La définition des termes métiers relatifs au projet doit se trouver dans le glossaire 

------------- 

