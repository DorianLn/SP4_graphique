/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4_lo_negro;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author doria
 */
public class Cellule_graphique extends JButton {

    CelluleDeGrille celluleAssociée;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));

    public Cellule_graphique(CelluleDeGrille uneCellule) {
        celluleAssociée = uneCellule;
    }

    //fonction qui permet de dessiner la cellulevide
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleAssociée.presenceTrouNoir() == true) {
            setIcon(img_trouNoir);
        } else if (celluleAssociée.presenceDesintegrateur() == true) {
            setIcon(img_desint);
        } else {
            String couleur_jeton = celluleAssociée.lireCouleurDuJeton();
            switch (couleur_jeton) {
                case "vide":
                    setIcon(img_vide);  //on attribu l'image celluleVide.png
                    break;
                case "Rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "Jaune":
                    setIcon(img_jetonJaune);
                    break;
            }
        }

    }

}
