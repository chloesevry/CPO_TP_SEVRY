/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sevry
 */
public class joueur {
    
    
    
    String Nom;
    String Couleur;
    int level = 1;
    Cavalier cavalier;
    
    public joueur(String nom, String couleur){
        Nom = nom;
        Couleur = couleur;
        cavalier = new Cavalier(Couleur);
    }
    
    public void set_color(String couleur){
        Couleur = couleur;
    }
}
    


    

