package frame;

import metodo.Metodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class Lobby extends JFrame {
    public Lobby() {
        caracteristicasDelFrame();
        iniciarComponentes();
    }

    private void caracteristicasDelFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("Lobby");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }

    // Metodos
    private void iniciarComponentes() {
        panelesInicializar();
        labelsInicializar();
        texfieldInicializar();
        buttonInicializar();
    }
    //------------------------------------------------------------------------------------------------------------------


    //inicializadores de los componentes
    private void panelesInicializar() {
        paneles = new ArrayList<>();

        // Panel de contenido paneles.get(0)
        paneles.add(new JPanel());
        paneles.get(0).setLayout(null);
        paneles.get(0).setBounds(0, 0, getWidth(), getHeight());
        paneles.get(0).setBackground(new Color(0xAE081944, true));
        add(paneles.get(0));
        //------------------------------------------
        // Panel de Menu paneles.get(1)
        paneles.add(new JPanel());
        paneles.get(1).setLayout(null);
        paneles.get(1).setBounds(0, 0, 250, getHeight());
        paneles.get(1).setBackground(new Color(0xC9030D26, true));
        add(paneles.get(1));
        //------------------------------------------

    }

    private void labelsInicializar() {
        labels = new ArrayList<>();

        // Label de background
        background = new JLabel();
        background.setBounds(0, 0, this.getWidth(), this.getHeight());
        Metodo.incrustarImagen(background, "src/image/loginBackground.jpg");
        this.add(background);
        //------------------------------------------
    }

    private void texfieldInicializar() {
    }

    private void buttonInicializar() {
        buttons = new ArrayList<>();

        // Boton de informacion General buttons.get(0)
        buttons.add(new JButton("Informacion General"));
        buttons.get(0).setBounds(54, 221, 143, 15);
        buttons.get(0).setBackground(new Color(0xC9030D26, true));
        buttons.get(0).setFont(new Font("Arial", Font.BOLD, 12));
        buttons.get(0).setForeground(Color.WHITE);
        buttons.get(0).setBorder(null);
        buttons.get(0).setFocusPainted(false);
        paneles.get(1).add(buttons.get(0));
        //------------------------------------------
        // Boton de recepcion buttons.get(1)
        buttons.add(new JButton("Recepcion"));
        buttons.get(1).setBounds(54, 256, 69, 15);
        buttons.get(1).setBackground(new Color(0xC9030D26, true));
        buttons.get(1).setFont(new Font("Arial", Font.BOLD, 12));
        buttons.get(1).setForeground(Color.WHITE);
        buttons.get(1).setBorder(null);
        buttons.get(1).setFocusPainted(false);
        paneles.get(1).add(buttons.get(1));
        //------------------------------------------
    }
    //------------------------------------------------------------------------------------------------------------------

    // Eventos
    private ActionListener oyente = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    };
    private MouseAdapter oyenteMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
        }
    };
    //------------------------------------------------------------------------------------------------------------------


    // Componentes
    private static JLabel background;
    private static ArrayList<JPanel> paneles;
    private static ArrayList<JLabel> labels;
    private static ArrayList<JButton> buttons;
    // ------------------------------------------------------------------------------------------------

}
