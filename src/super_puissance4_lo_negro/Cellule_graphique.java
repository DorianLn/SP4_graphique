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
public class Cellule_graphique extends JButton{
    CelluleDeGrille celluleAssociée;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));

    public Cellule_graphique(CelluleDeGrille uneCellule) {
        celluleAssociée=uneCellule;
    }
    
    //fonction qui permet de dessiner la cellulevide
    @Override
    public void paintComponent( Graphics G){
        super.paintComponent(G);
        setIcon(img_vide);  //on attribu l'image celluleVide.png
    }
    
}
