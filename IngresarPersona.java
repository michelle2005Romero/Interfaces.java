package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel lnlIdioma;
    private JComboBox cmbIdioma;
    private JCheckBox chbTerminos;
    private JRadioButton rbtMasculino;
    private JLabel Genero;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoIndicado;


    public IngresarPersona () {

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 300);

        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptaTerminos = (chbTerminos.isSelected()==true) ? "Si" : "No";
                String genero = (rbtMasculino.isSelected()) ? "Masculino" :
                                (rbtFemenino.isSelected()) ? "Femenino" :
                                (rbtOtro.isSelected()) ? "Otro" :
                                (rbtNoIndicado.isSelected()) ? "No Indicado" : "";

                String mensaje = "Tus datos son " + "\n" +
                                 "Codigo " + codigo + "\n" +
                                 "Nombre " + nombre + "\n" +
                                 "Apellido " + apellido + "\n" +
                                 "Idioma " + idioma + "\n" +
                                 "Acepto términos " + aceptaTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });

 }
}
