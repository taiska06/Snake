import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("змея");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//программа прекращает свою работу при нажатии крестика
        setSize(320,345);//размер: широта, высота
        setLocation(400,400);
        add(new MainField());
        setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow mw= new MainWindow();
    }
}
