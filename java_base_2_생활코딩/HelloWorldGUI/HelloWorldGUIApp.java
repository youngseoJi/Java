import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;

// ����ũ�� ���ø����̼� ������
// ������ ����@
public class HelloWorldGUIApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // ȭ�� ������ ����
                frame.setPreferredSize(new Dimension(1000, 300)); 
                
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
                // �ڵ��� ��ġ ���ϱ� CENTER/RIGTH �� 
                frame.getContentPane().add(label);
                
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                // 
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);
                System.out.println();
                // ctrl + space �ڵ��ϼ�
            }
        });
    }
}