package br.com.aula10.util;

import javax.swing.*;

public class EntradaTela {

    public static String texto(String msg){ return JOptionPane.showInputDialog(msg);}

    public static double decimal(String msg){ return  Double.parseDouble(JOptionPane.showInputDialog(msg));}

    public static boolean logico(String msg) {
        int resp = JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            return true;
        }
        return false;
        }

    public static void show(String msg) {JOptionPane.showMessageDialog(null,msg);}

    public static int inteiro(String msg) { return Integer.parseInt(JOptionPane.showInputDialog(msg));}

}

