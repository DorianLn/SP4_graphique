
package super_puissance4_lo_negro;

import java.util.ArrayList;

/**
 *
 * @author doria
 */
public class Joueur {
    private String nom;
    private String couleur;
    private ArrayList<Jetons> reserveJetons = new ArrayList<Jetons>();
    private int nombreDesintegrateurs;


    public Joueur(String nom) {    //Constructeur de la classe Joueur
        this.nom = nom;
        this.nombreDesintegrateurs = 0;
        nombreDesintegrateurs = 0;
    }
    
    public void affecterCouleur (String col) {   //Méthode qui affecte à un joueur une couleur soit rouge soit jaune
        couleur= col;
    }
    
    public int nombreDeJetons() {   //Méthode permettant d'obtenir le nombre de jeton disponible dans la réserve d'un joueur
        return reserveJetons.size();
    }
    
    public void ajouterJeton(Jetons nouveauJeton){   //méthode qui ajoute un jeton à la reserve d'un joueur
        reserveJetons.add(nouveauJeton);
    }
   
    public Jetons Jetonres(){
       return reserveJetons.get(0);
    }
    
    public Jetons jouerJeton(){    //méthode permettant de retirer un jeton de la réserve du joueur et de renvoyer une référence vers le jeton retiré
       
        Jetons j =Jetonres();
        reserveJetons.remove(0);
        return j;
     
    }
    public void obtenirDesintegrateur() {   //méthode incrémente un desintégrateur
        nombreDesintegrateurs += 1;
    }
    public void utiliserDesintegrateur(){   //méthode decrémente un desintégrateur
        nombreDesintegrateurs -= 1;
    }

    public String getCouleurJ(){//méthode qui permet d'obtenir la couleur du joueur
        return couleur;
    }
    
    public int getNombreDesintegrateurs(){
        return nombreDesintegrateurs;
    }
    public String Nom(){
        return nom;
    }

        
}    
