
package GUI;
/*
aqui se encuentran todas y cada una de las diferentes librerias que fueron utilizadas para la
realizacion de nuestras interfaces, y el llamado de los diferentes packages donde haciamos el llamado de los
diferentes metodos para la buen funcionamiento de la logica de esta interfaz 
*/

import static GUI.MENU.p;
import LOGICA.gestionar_personas;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 *@author Valderrama Jorde Enrique
 * jorge.valderrama@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "GUI_modificar_personas " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/
public class GUI_modificar_personas extends javax.swing.JFrame {
 /*
ahora lo que haremos es inicializar una variable "Filas" que es la que nos ayudara para determinar 
el numero de filas en el cual nosotros hemos seleccionado para poder realizar la respectiva operacion 
solo sobre la fila seleccionada 

*/    
    
    int filas;
/*
ahora una vez inicializada nuestra variable tipo entero, debemos de llamar nuestros metodos antes inicializados 
para poder tener accesos a ellos y poder operar sobre nuestro archivo de texto adecuado y correcto     
*/     
    gestionar_personas gm = new gestionar_personas();  
    DefaultTableModel nuestraTabla;   
/*
una vez que hemos declarado nuestra variable tipo entero (int) y llamado  nuestros metodos antes incializados 
procedemos a inicializar nuestra clase que estara declara al final de todo el codigo que es la responsable 
de pasar una imagen de fondo a nuestro panel principal 
*/   
    
    imagen_fondo ghm = new imagen_fondo();
/*
una vez declarado todas los metodos que vamos a utilizar procedemos a inicializar en nuestro "CONSTRUCTOR" la clase 
responsable de inicializar nuestos elementos del JFrame, el fondo de nuestro JPanel y de colocar los datos visibles
en nuestra JTable apenas aparezca nuestra interfaz.    
*/    
   
    public GUI_modificar_personas() {
        
        
        
        this.setContentPane(ghm);
  
        initComponents();
        this.setLocationRelativeTo(null);
        
         Tabla.setModel(gm.mostrar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Nombre = new javax.swing.JTextField();
        Especialidad = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        Consultorio = new javax.swing.JTextField();
        Doctor = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fecha = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION A MODIFICAR ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setOpaque(false);

        Tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 51)));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "N?? Identificacion", "Tipo de afiliacion ", "EPS", "Tipo de sangre ", "Nivel de sisben "
            }
        ));
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla.setOpaque(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        Nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        Especialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("EPS"));

        Apellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosKeyTyped(evt);
            }
        });

        Id.setBorder(javax.swing.BorderFactory.createTitledBorder("N?? Identificacion"));
        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });

        Consultorio.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de sangre"));

        Doctor.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de afiliacion "));
        Doctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DoctorKeyTyped(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(204, 204, 255));
        Modificar.setText("REALIZAR MODIFICACION ");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("MODIFICA LA INFORMACION DE AFILIADOS ");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("VOLVER A GESTIONAR LA LISTA DE AFILIADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel de sisben "));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Fecha)
                    .addComponent(Consultorio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doctor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Apellidos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Especialidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(108, 108, 108))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Consultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
/*
ahora en nuestro boton de modificar declaramos un vector para tener presente la posicion y los datos que se encuentra
en cada uno de los "JTextField" donde estos datos mostrados seran recoridos con un ciclo "FOR" para recorrer toda la matriz
que nos ayuda a tarer cada uno de los datos del archivo ".TXT" que estan separados por un ";" y reescribirls con la nueva informacion 
suministrada por el usuario.      
*/      
        String []cantidad = new String[8];
     
     cantidad[0] = Nombre.getText();
     cantidad[1] = Apellidos.getText();
     cantidad[2] = Id.getText();
     cantidad[3] = Doctor.getText();
     cantidad[4] =  Especialidad.getText();
     cantidad[5] = Consultorio.getText();
     cantidad[6]=Fecha.getText();
     
     for(int i =0;i<Tabla.getColumnCount();i++){
         
         Tabla.setValueAt(cantidad[i],filas,i);
     }
        try {
            
            String g = "Gestion_Afiliados.txt";
            BufferedWriter mw =  new BufferedWriter(new FileWriter(g));
            for(int h=0;h<Tabla.getRowCount();h++){
                for(int j=0;j<Tabla.getColumnCount();j++){
                     mw.write((String)(Tabla.getValueAt(h,j)));
                     
                     if(j<Tabla.getColumnCount()-1){
                         mw.write(";");
                     }
                }
               mw.newLine();
            }
           mw.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"NO se modifico el archivo ");  
            
        }
        
         JOptionPane.showMessageDialog(null,"se modifico el archivo con exito");
        //en esta parte lo que hacemos es decirle que despues de modificado nos deje los campos del JTectField vacios 
                      Nombre.setText("");
                      Apellidos.setText("");
                      Id.setText("");
                      Doctor.setText("");
                      Especialidad.setText("");
                      Consultorio.setText("");
                      Fecha.setText("");
        
       
    }//GEN-LAST:event_ModificarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
/*
En este metodo tendremos el evento de que cuando le demos clic al tabla este no solo nos se??ale la fila 
sino que nos traiga la ifomacion seleccionada en cada uno de los campos donde corresponde la respectiva informacion 
donde es importar tener en cuenta que seguimos trabajando con lamatriz antes definida donde para taer el dato 
es necesario tener en cuenta la posicion dekl mismo la cual la pasaremos a nuestra variable entera(int) antes inicializada 
llamada "Filas".        
*/        
       
        this.nuestraTabla= (DefaultTableModel)Tabla.getModel();
         
        int selecionado = Tabla.getSelectedRow();
                      
          Nombre.setText(Tabla.getValueAt(selecionado,0).toString());
          Apellidos.setText(Tabla.getValueAt(selecionado,1).toString());
          Id.setText(Tabla.getValueAt(selecionado,2).toString());
          Doctor.setText(Tabla.getValueAt(selecionado,3).toString());
          Especialidad.setText(Tabla.getValueAt(selecionado,4).toString());
          Consultorio.setText(Tabla.getValueAt(selecionado,5).toString());
          Fecha.setText(Tabla.getValueAt(selecionado,6).toString());
          
            filas= selecionado;

        // TODO add your handling code here:
    }//GEN-LAST:event_TablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/*
ahora en esta parte del escucha del boton donde le decimos que cuando hagamos clic nos desactive la interfaz actual 
y nos muestre la anterior estos llamados es lo que nos permite el desplazamiento entre las interfaces graficas al usuario
despues de realizar alguna operacion         
*/
         setVisible(false);
         p.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DoctorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DoctorKeyTyped
  // TODO add your handling code here:
    }//GEN-LAST:event_DoctorKeyTyped

    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_IdKeyTyped

    private void ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
 // TODO add your handling code here:
    }//GEN-LAST:event_NombreKeyTyped

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new GUI_modificar_personas().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Apellidos;
    public javax.swing.JTextField Consultorio;
    public javax.swing.JTextField Doctor;
    public javax.swing.JTextField Especialidad;
    private javax.swing.JTextField Fecha;
    public javax.swing.JTextField Id;
    public javax.swing.JButton Modificar;
    public javax.swing.JTextField Nombre;
    public javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
/*
ahora aqui declaramos nuestra clase "Imagen_Fondo" que es la que utilizaremos para pasar le una imagen anuestro JPanel 
para darle un mejor entorno visual a nuestra intrfaz grafica la cual fue inicializada al inicio del codigo y llamada
para su ejecucion en el constructor.     
*/
    
    class imagen_fondo extends JPanel{
    private Image imagen;
    //metodo 
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/IMAGENES/fondo_modificaciones.png")).getImage();
        g.drawImage(imagen,0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    
}

}
