 package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.DebordementEspaceJeuException;
import fr.unilim.iut.spaceinvaders.utils.Dimension;
import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;
import fr.unilim.iut.spaceinvaders.utils.Position;

public class SpaceInvaders {

	    private static final char MARQUE_FIN_LIGNE = '\n';
		private static final char MARQUE_VAISSEAU = 'V';
		int longueur;
	    int hauteur;
	    Vaisseau vaisseau;

	    public SpaceInvaders(int longueur, int hauteur) {
		   this.longueur = longueur;
		   this.hauteur = hauteur;
	   }
	    
		@Override
		public String toString() {
			return recupererEspaceJeuDansChaineASCII();
		}

		public String recupererEspaceJeuDansChaineASCII() {
			StringBuilder espaceDeJeu = new StringBuilder();
			for (int y = 0; y < hauteur; y++) {
				for (int x = 0; x < longueur; x++) {
					espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));
				}
				espaceDeJeu.append(MARQUE_FIN_LIGNE);
			}
			return espaceDeJeu.toString();
		}

		private char recupererMarqueDeLaPosition(int x, int y) {
			char marque;
			if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
			      marque=MARQUE_VAISSEAU;
			else
			      marque='.';
			return marque;
		}

		private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {
			return this.aUnVaisseau() && this.vaisseau.occupeLaPosition(x, y);
		}

		private boolean aUnVaisseau() {
			return this.vaisseau!=null;
		}
		
		

		
		
		

		private boolean estDansEspaceJeu(int x, int y) {
			return ((x >= 0) && (x < longueur)) && ((y >= 0) && (y < hauteur));
		}

		public void deplacerVaisseauVersLaDroite() {
			if (vaisseau.abscisseLaPlusADroite() < (longueur - 1)) {
				vaisseau.seDeplacerVersLaDroite();
				if (!estDansEspaceJeu(vaisseau.abscisseLaPlusADroite(), vaisseau.ordonneeLaPlusHaute())) {
					vaisseau.positionner(longueur - vaisseau.longueur(), vaisseau.ordonneeLaPlusHaute());
				}
			}
		}

		public void deplacerVaisseauVersLaGauche() {
			 if (vaisseau.abscisseLaPlusAGauche()> (1)) vaisseau.seDeplacerVersLaGauche();
			
			
		}
		
		public void positionnerUnNouveauVaisseau(Dimension dimension, Position position, int vitesse) {
			
			int x = position.abscisse();
			int y = position.ordonnee();
			
			if (!estDansEspaceJeu(x, y))
				throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");

			int longueurVaisseau = dimension.longueur();
			int hauteurVaisseau = dimension.hauteur();
			
			if (!estDansEspaceJeu(x + longueurVaisseau - 1, y))
				throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers la droite à cause de sa longueur");
			if (!estDansEspaceJeu(x, y - hauteurVaisseau + 1))
				throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers le bas à cause de sa hauteur");

			   vaisseau = new Vaisseau(dimension,position,vitesse);
		}
		
		
		
    }

   