package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

    int x;
    int y;
    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur=longueur;
		this.hauteur=hauteur;
		this.x=x;
		this.y=y;
   	}

    public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

   

	public boolean occupeLaPosition(int x, int y) {
	     return (estAbscisseCouverte(x) &&  estOrdonneCouverte(y));
			  
		
	    
    }

	public boolean estOrdonneCouverte(int y) {
		return (ordonneLaPlusBasse()<=y) && (y<=ordonneLaPlusHaute());
	}

	public int ordonneLaPlusHaute() {
		return this.y;
	}

	public int ordonneLaPlusBasse() {
		return ordonneLaPlusHaute()-this.hauteur+1;
	}

	public boolean estAbscisseCouverte(int x) {
		return (this.x<=x) && (x<=this.x+this.longueur-1);
	}
	public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
    }
	
	public void seDeplacerVersLaGauche() {
	      this.x = this.x - 1 ;
	}
	
	public int abscisse() {
        return this.x;
	}

	public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }

	
	public int abscisseLaPlusAGauche() {
		
		
		return this.abscisse();
		}

	public int abscisseLaPlusADroite() {
		
		return this.abscisse() + this.longueur - 1;
	}

	
}
