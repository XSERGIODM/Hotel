package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import metodo.Metodo;

public class Login extends JFrame {

    public Login() {
        caracteristicasDelFrame();
        iniciarComponentes();

        this.repaint();
        this.revalidate();
    }

    private void caracteristicasDelFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("Login");
        setSize(500, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }

    // Metodos
    private void iniciarComponentes() {
        panelesInicializar();
        labelsInicializar();
        texfieldAndPasswordlInicializar();
        buttonInicializar();
    }
    //------------------------------------------------------------------------------------------------------------------

    //inicializadores de los componentes
    private void panelesInicializar() {
        paneles = new ArrayList<>();

        // Panel de login
        paneles.add(new JPanel());
        paneles.get(0).setLayout(null);
        paneles.get(0).setBounds(getWidth() / 2 - 150, getHeight() / 2 - 200, 300, 400);
        paneles.get(0).setBackground(new Color(0xAE081944, true));
        add(paneles.get(0));
        //------------------------------------------


    }

    private void labelsInicializar() {
        labels = new ArrayList<>();
        System.out.println(this.getWidth() / 2 - 75);
        // Label de login labels.get(0)
        labels.add(new JLabel("LOGIN"));
        labels.get(0).setBounds(this.getWidth() / 2 - 75, 80, 150, 50);
        labels.get(0).setFont(new Font("JK Abode Demo", Font.BOLD, 65));
        labels.get(0).setForeground(Color.WHITE);
        this.add(labels.get(0));
        //------------------------------------------

        // Label de usuario labels.get(1)
        labels.add(new JLabel("Usuario"));
        labels.get(1).setBounds(20, 50, 100, 50);
        labels.get(1).setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
        labels.get(1).setForeground(Color.WHITE);
        paneles.get(0).add(labels.get(1));
        //------------------------------------------

        // Label de contraseña labels.get(2)
        labels.add(new JLabel("Contraseña"));
        labels.get(2).setBounds(20, 150, 110, 50);
        labels.get(2).setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
        labels.get(2).setForeground(Color.WHITE);
        paneles.get(0).add(labels.get(2));
        //------------------------------------------

        // Label de Copyrigth labels.get(3)
        labels.add(new JLabel("© 2022 - Todos los derechos reservados - By: Sergio Mosquera"));
        labels.get(3).setBounds(this.getWidth() / 2 - 200, this.getHeight() - 100, 400, 50);
        labels.get(3).setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
        labels.get(3).setForeground(Color.WHITE);
        this.add(labels.get(3));
        //------------------------------------------

        // Label de background
        background = new JLabel();
        background.setBounds(0, 0, this.getWidth(), this.getHeight());
        Metodo.incrustarImagen(background, "src/image/loginBackground.jpg");
        this.add(background);
        //------------------------------------------
    }

    private void texfieldAndPasswordlInicializar() {
        // TextField de usuario
        txtUsuario = new JTextField("Usuario");
        txtUsuario.setBounds(20, 100, 260, 50);
        txtUsuario.setFont(new Font("Arial", Font.ITALIC, 15));
        txtUsuario.setForeground(new Color(0x5A5A8D));
        txtUsuario.setBackground(new Color(0xFF09173A));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(0x2B2B2D)));
        txtUsuario.addMouseListener(oyenteMouse);
        paneles.get(0).add(txtUsuario);
        //------------------------------------------

        // TextPassword de usuario
        txtPassword = new JPasswordField("Password");
        txtPassword.setBounds(20, 200, 260, 50);
        txtPassword.setFont(new Font("Arial", Font.ITALIC, 15));
        txtPassword.setForeground(new Color(0x5A5A8D));
        txtPassword.setBackground(new Color(0xFF09173A));
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(oyenteMouse);
        paneles.get(0).add(txtPassword);
        //------------------------------------------
    }

    private void buttonInicializar() {
        // Button de login
        btnIngresar = new JButton("ENTRAR");
        btnIngresar.setBounds(20, 300, 260, 50);
        btnIngresar.setFont(new Font("Arial", Font.BOLD, 20));
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.setBackground(new Color(0x0C2269));
        btnIngresar.setBorder(BorderFactory.createLineBorder(new Color(0x2B2B2D)));
        btnIngresar.addActionListener(oyente);
        btnIngresar.addMouseListener(oyenteMouse);
        paneles.get(0).add(btnIngresar);
        //------------------------------------------
    }
    //------------------------------------------------------------------------------------------------------------------

    // Eventos
    private ActionListener oyente = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnIngresar) {
                if (txtUsuario.getText().equals("Usuario") || txtPassword.getText().equals("Password")) {
                    JOptionPane.showMessageDialog(null, "Ingrese los datos");
                } else {
                    new Lobby();
                    dispose();
                }
            }
        }
    };
    private MouseAdapter oyenteMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            if (e.getSource() == txtUsuario && (txtUsuario.getText().equals("Usuario") || txtUsuario.getText().equals(""))) {
                txtUsuario.setText("");
            } else {
                if (txtUsuario.getText().equals("")) {
                    txtUsuario.setText("Usuario");
                }
            }
            if (e.getSource() == txtPassword && (txtPassword.getText().equals("Password") || txtPassword.getText().equals(""))) {
                txtPassword.setText("");
            } else {
                if (txtPassword.getText().equals("")) {
                    txtPassword.setText("Password");
                }
            }
            txtUsuario.repaint();
            txtUsuario.revalidate();
            txtPassword.repaint();
            txtPassword.revalidate();
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            if (e.getSource() == txtUsuario) {
                txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(0xF8D203)));
            } else {
                txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(0x2B2B2D)));
            }
            if (e.getSource() == txtPassword) {
                txtPassword.setBorder(BorderFactory.createLineBorder(new Color(0xF8D203)));
            } else {
                txtPassword.setBorder(BorderFactory.createLineBorder(new Color(0x2B2B2D)));
            }
            if (e.getSource() == btnIngresar) {
                btnIngresar.setBorder(BorderFactory.createLineBorder(new Color(0xF8D203)));
            } else {
                btnIngresar.setBorder(BorderFactory.createLineBorder(new Color(0x2B2B2D)));
            }
            txtUsuario.repaint();
            txtUsuario.revalidate();
            txtPassword.repaint();
            txtPassword.revalidate();
        }
    };
    //------------------------------------------------------------------------------------------------------------------

    // Componentes
    private static JLabel background;
    private static ArrayList<JPanel> paneles;
    private static ArrayList<JLabel> labels;
    private static JTextField txtUsuario;
    private static JPasswordField txtPassword;
    private static JButton btnIngresar;
    //------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        new Login();
    }
}
