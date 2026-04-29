import javax.swing.*;
import java.awt.*;
//important: I added labels so I wont forget the function of this stuffs since I have memory loss

//for the background 
class BackgroundPanel extends JPanel {
    private Image image;

    public BackgroundPanel(String path) {
        image = new ImageIcon(path).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

public class MyFrame extends JFrame {

    public MyFrame() {
        this.setTitle("GGSHOP");
        this.setSize(1100, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Icon
        ImageIcon icon = new ImageIcon("ggshop_logo.png");
        this.setIconImage(icon.getImage());

        // Background
        BackgroundPanel background = new BackgroundPanel("gg_shop_background.png");
        background.setLayout(new BorderLayout(15, 15));
        background.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        this.setContentPane(background);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}