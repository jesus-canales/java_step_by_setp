import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Panel extends JFrame {
    public void init () {
        setTitle("Mensaje");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}
