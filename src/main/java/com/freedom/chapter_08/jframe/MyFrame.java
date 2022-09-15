package com.freedom.chapter_08.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 我们扩展了JFrame，他包含一个 update() 方法，这个方法控制更新屏幕的算法。
 * 我们可以通过覆盖 paint() 钩子方法和这个算法挂上钩。
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    /**
     * JFrame 的更新算法被称为 paint()。在默认状态下，paint() 是不做事的。。。
     * 它只是一个钩子。我们覆盖paint()，告诉JFrame 在窗口上面画一条消息
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("黄秀念");
    }
}
