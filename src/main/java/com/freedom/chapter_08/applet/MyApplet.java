package com.freedom.chapter_08.applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    private String message;

    /**
     * init 钩子用来进行 applet 的初始化动作，它会在 applet 一开始
     * 的时候被调用一次
     */
    @Override
    public void init() {
        message = "Hello World, I'm alive";
        repaint();
    }

    /**
     * 这个 start 钩子可以在 applet 正要被显示在网页上时，让 applet 做一些动作
     */
    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    /**
     * 如果用户跳到别的网页，这个 stop 钩子会被调用，然后 applet 就可以在这里
     * 做一些事情来停止它的行动
     */
    @Override
    public void stop() {
        message = "Now I'm being stopped...";
        repaint();
    }

    /**
     * 当这个 applet 即将被销毁（例如：关闭浏览器）时，destory 钩子就会被调用。我们可以在
     * 这里显示一些东西
     */
    @Override
    public void destroy() {
        // applet 正在被销毁
    }

    /**
     * applet 也将这个方法当做钩子
     */
    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
