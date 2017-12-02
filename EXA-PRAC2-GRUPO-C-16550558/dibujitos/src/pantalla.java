import java.awt.Graphics;

public class pantalla extends javax.swing.JFrame {
//se inicializa una lista Doblemente Enlazada desde este punto para usarse en todos los metodos
    ListaDE ac = new ListaDE();
    public pantalla() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new java.awt.Canvas();
        Dibujitos = new javax.swing.JButton();
        OtroDibujito = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lienzoMouseClicked(evt);
            }
        });

        Dibujitos.setText("Dibujar");
        Dibujitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujitosActionPerformed(evt);
            }
        });

        OtroDibujito.setText("Nuevo");
        OtroDibujito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroDibujitoActionPerformed(evt);
            }
        });

        Borrar.setText("Limpiar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OtroDibujito)
                    .addComponent(Dibujitos)
                    .addComponent(Borrar))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dibujitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OtroDibujito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Borrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseClicked
/*
al hacer click en el "canvas" se dibuja un pequeño circulo para saber la posicion actual
y se agrega como un nodo (guardando las coordenadas del punto) a nuestra lista
*/
        lienzo.getGraphics().drawOval(evt.getX(), evt.getY(), 2, 2);  
        Nodo nNodo = new Nodo(evt.getX(), evt.getY());
        ac.agregarNodo(nNodo);
    }//GEN-LAST:event_lienzoMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void DibujitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujitosActionPerformed
//se crea un nodo a manera de "centinela" y se iguala al nodo inicial de la lista
        Nodo nNodo = new Nodo();
        nNodo = ac.nIni;
//if, para evitar errores si solo existe un punto (nodo)
        if(nNodo.getnSig()!=null)
        {
            do{
//se dibuja una linea desde el nodo actual, a el nodo siguiente y se reccore el nodo de lugar
                lienzo.getGraphics().drawLine(nNodo.getPosX(), nNodo.getPosY(), nNodo.getnSig().getPosX(), nNodo.getnSig().getPosY());
                nNodo=nNodo.getnSig();
//el metodo se repite hasta llegar a nuestro nodo final (cuando el nodo siguiente sea nulo)
            }while(nNodo.getnSig()!=null);
//dibujamos una linea desde el nodo final, hacia el nodo inicial para cerrar la figura
            lienzo.getGraphics().drawLine(ac.nIni.getPosX(), ac.nIni.getPosY(), ac.nFin.getPosX(), ac.nFin.getPosY());
        }
    }//GEN-LAST:event_DibujitosActionPerformed

    private void OtroDibujitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroDibujitoActionPerformed
//borramos los datos de nuestra lista para reinicial el nodo inicial y el nodo final
//dibujar en otro lado otra figura
        ac.Vaciado();
    }//GEN-LAST:event_OtroDibujitoActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
//limpiamos toda el area del canvas con un "clearRect" (?)
//vaciamos la lista para reinicial el nodo inicia y el nodo final
        lienzo.getGraphics().clearRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
        ac.Vaciado();
    }//GEN-LAST:event_BorrarActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Dibujitos;
    private javax.swing.JButton OtroDibujito;
    private java.awt.Canvas lienzo;
    // End of variables declaration//GEN-END:variables
}
