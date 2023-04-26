package daytrader;

import javax.swing.JFrame;

public class Frame extends JFrame {
    

    public Frame() {
        initalization();
    }

    private void initalization() {
        setTitle("FrameOne");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1080, 1920);
        setVisible(true);
    }
}
