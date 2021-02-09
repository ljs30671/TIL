package client;

import java.awt.*;
import java.awt.event.*;

public class ClientUi {
	TextArea ta;
	TextField tf;	
	
	public void onCreate() {
		Frame f=new Frame("나의 채팅");
		Panel p=new Panel();
		Button b1=new Button("전송1");
		 tf=new TextField(20);
		 ta=new TextArea();	
		
		WindowListener fHandler=new MyFrameHandler();
		f.addWindowListener(fHandler);		
		
		
		MyButtonHandler b1Handler=new MyButtonHandler();				
		b1.addActionListener(b1Handler);
		
			
		tf.addActionListener(b1Handler);
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ClientUi ui=new ClientUi();
		ui.onCreate();
	}//end main
	
	public class MyButtonHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// 하고 싶은 일
			String msg=tf.getText();
			ta.append(msg+"\n");
			tf.setText("");
		}
		
	}
	
	public class MyFrameHandler extends WindowAdapter{	

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			System.exit(0);
		}

	}


}//end ClientUi