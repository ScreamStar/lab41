/**
 * Created by thecasp1k on 06.10.16.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class okno extends JFrame {
    private int count = 0;
    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object button = e.getSource();
            if (button instanceof JButton) {
                count++;
                ((JButton) button).setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, " + fio.getText() + "!");
            }
        }
    }
    class WinResize implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object button1 = e.getSource();
            if (button1 instanceof JButton) {
               okno.super.setSize(500, 500);
            }
        }
    }
    public okno(String title)
    {
        super(title);
        SozdatxOkno();
    }
    private void SozdatxOkno(){
        JButton button = new JButton(" Нажми меня! ");
        button.setBounds(65,60,150,40);
        button.addActionListener(new PushingListener());
        JButton button1 = new JButton(" Расширение ");
        button1.setBounds(65,120,150,40);
        button1.addActionListener(new WinResize());
        metka.setBounds(15,15,175,30);
        metkaDva.setBounds(15,95,200,30);
        fio.setBounds(135, 15, 100, 30);
        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(button1);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(fio);
        setLocationRelativeTo(null);
    }
}
