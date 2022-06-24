package util;

import javax.swing.*;

public class Formulario {
    public static double num(String msg) {
        JOptionPane.showInputDialog(msg);
        return Double.parseDouble(msg);
    }

    public static double sal(String msg) {
        JOptionPane.showInputDialog(msg);
        return Double.parseDouble(msg);
    }

    public static String cli(String msg) {
        JOptionPane.showInputDialog(msg);
        return msg;
    }

    public static double lim(String msg) {
        JOptionPane.showInputDialog(msg);
        return Double.parseDouble(msg);
    }

    public static String tpcont(String msg) {
        JOptionPane.showInputDialog(msg);
        return msg;
    }

    public static void show(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
