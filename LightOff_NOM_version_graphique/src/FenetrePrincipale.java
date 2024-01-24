
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import ligthoff_sevry.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author sevry Chloé
 */
public final class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeCellules grille;
    int nbCoups;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale(int nb){
        initComponents();
        int nbLignes = nb;
        int nbColonnes = nb;
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        initialiserPartie();

        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille

            }
        }
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        
        // création du panneau de boutons verticaux (pour les lignes)
        for (int i = 0; i < nbColonnes; i++) {
            final int j = i;
            JButton bouton_Ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    if (grille.cellulesToutesEteintes()){
                    orh();
                    new VICTOIRE().setVisible(true);
 }
                }
                
            };
            bouton_Ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_Ligne);

        }
        
         PanneauBoutonsHonrizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHonrizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        
        // création du panneau de boutons verticaux (pour les lignes)
        for (int i = 0; i < nbColonnes; i++) {
            final int j = i;
            JButton bouton_Colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    if (grille.cellulesToutesEteintes()){
                    orh();
                    new VICTOIRE().setVisible(true);}
                }
            };
            bouton_Colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHonrizontaux.add(bouton_Colonne);
       
        }

    }
    private void orh(){
            this.setVisible(false);
    }
    private void desactiverBoutons() {

        PanneauBoutonsHonrizontaux.setVisible(false);
        PanneauBoutonsVerticaux.setVisible(false);
    }
    

 
    

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        boutondiagdescendante = new javax.swing.JButton();
        boutondiagmontante = new javax.swing.JButton();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHonrizontaux = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 400, 400));

        boutondiagdescendante.setText("D descendante ");
        boutondiagdescendante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutondiagdescendanteActionPerformed(evt);
            }
        });
        getContentPane().add(boutondiagdescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        boutondiagmontante.setText("D montante");
        boutondiagmontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutondiagmontanteActionPerformed(evt);
            }
        });
        getContentPane().add(boutondiagmontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        PanneauBoutonsHonrizontaux.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout PanneauBoutonsHonrizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHonrizontaux);
        PanneauBoutonsHonrizontaux.setLayout(PanneauBoutonsHonrizontauxLayout);
        PanneauBoutonsHonrizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHonrizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsHonrizontauxLayout.setVerticalGroup(
            PanneauBoutonsHonrizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHonrizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutondiagdescendanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutondiagdescendanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        repaint();
if (grille.cellulesToutesEteintes()){
                    orh();
                    new VICTOIRE().setVisible(true);
 }
    }//GEN-LAST:event_boutondiagdescendanteActionPerformed

    private void boutondiagmontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutondiagmontanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
if (grille.cellulesToutesEteintes()){
                    orh();
                    new VICTOIRE().setVisible(true);
 }
    }//GEN-LAST:event_boutondiagmontanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Choixniveau().setVisible(true);
            }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsHonrizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton boutondiagdescendante;
    private javax.swing.JButton boutondiagmontante;
    // End of variables declaration//GEN-END:variables
}
