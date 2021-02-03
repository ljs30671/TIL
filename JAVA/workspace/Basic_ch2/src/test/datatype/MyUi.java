package test.datatype;

import java.awt.*;

public class MyUi {

	public static void main(String[] args) {
	
		Button b=new Button("전송");
		Frame f=new Frame();
		
		f.add(b,BorderLayout.SOUTH);
		f.setSize(500, 300);
		f.setVisible(true);
		

	}

}
