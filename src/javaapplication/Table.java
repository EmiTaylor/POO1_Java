/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emilie-letailleur
 */
public class Table extends Meuble {

    public List<Pied> pieds = new ArrayList();
    /*ctrl+shift+i*/
    public Plateau plateau = null;

    public Table() {
        this(4) 

    }

    public Table(int n) {
        for (int i = 0; i < n; i++) {
            /*ctrl+esp*/

 /* pieds.add(new Pied());*/
            Pied p = new Pied();
            p.couleur = "rouge";
            p.hauteur = 110;
            pieds.add(p);
            /*Alt+shift+F pour Indempter*/
        }
        plateau = new Plateau();
        plateau.couleur = "noir";
        plateau.hauteur = 10;
}
    @Override
    
    public int getHauteur() {
        /*
        int hauteurTotale = 0;
        hauteurTotale +=  pieds.get(0).hauteur;
        hauteurTotale += plateau.hauteur;
        
        return hauteurTotale;
        */
        return pieds.get(0).hauteur + plateau.hauteur;
    }