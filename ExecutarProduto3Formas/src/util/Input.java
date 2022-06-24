package util;

import javax.swing.*;

public class Input {
    public static String texto(String msg){
        JOptionPane.showInputDialog(msg);
        return msg;
    }
    public static double decimal(String msg){
        JOptionPane.showInputDialog(msg);
        return Double.parseDouble(msg);
    }
    public static boolean logico(String msg){
        int resp=JOptionPane.showConfirmDialog(null,msg,"Pergunta",JOptionPane.YES_NO_OPTION);
        if (resp==0){
            return true;
        }else{
            return false;
        }
    }
    public static void show(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
}
