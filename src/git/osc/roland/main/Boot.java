package git.osc.roland.main;

import git.osc.roland.common.utils.XmlParseUtils;

import javax.swing.*;


public class Boot {
	
	public void run() {
        // 创建及设置窗口
        JFrame frame = new JFrame("MVPT");
        frame.setSize(600, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加 "Hello World" 标签
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        try {
            JTextArea commentTextArea = new JTextArea(XmlParseUtils.getUsers().toString());
            JScrollPane scrollPane = new JScrollPane(commentTextArea);
            JPanel controlPanel = new JPanel();
            controlPanel.add(scrollPane);
            frame.getContentPane().add(controlPanel);

        }catch (Exception e){
            //...Todo
        }



        // 显示窗口
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()  {
            	new Boot().run();
            }
        });
	}

}
