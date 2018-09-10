package pj01;

/*
 * �����ڷ� 01-�ڹ� Ŭ�� �̺�Ʈ
 * ��ó: http://mainia.tistory.com/1262
 */
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class AwtButtonControl {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
 
    public AwtButtonControl() {
        prepareGUI();
    }
 
    public static void main(String[] args) {
        AwtButtonControl awtControlDemo = new AwtButtonControl();
        awtControlDemo.showButton();
    }
 
    private void prepareGUI() {
        // Frame �� ���� ����
        mainFrame = new Frame("Java AWT ����_2018/09/10");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
 
        // ��ܿ� �ִ� ��
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("Control Test : Button");
 
        // �ϴ� ���°� ��
        statusLabel = new Label();
        statusLabel.setText("Status Lable");
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
 
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
 
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
 
    private void showButton() {
 
        Button btnOk = new Button("OK");
        Button btnSubmit = new Button("Submit");
        Button btnCancel = new Button("Cancel");
 
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Ok Button clicked.");
            }
        });
 
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Submit Button clicked.");
            }
        });
 
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel Button clicked.");
            }
        });
 
        controlPanel.add(btnOk);
        controlPanel.add(btnSubmit);
        controlPanel.add(btnCancel);
 
        mainFrame.setVisible(true);
 
    }
}