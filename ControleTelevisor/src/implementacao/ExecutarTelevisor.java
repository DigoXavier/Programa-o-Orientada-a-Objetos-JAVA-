package implementacao;

import Beans.Televisor;

public class ExecutarTelevisor {
    public static void main(String[] args) {
        Televisor tv1=new Televisor();

        tv1.isLigar();
        tv1.mostrarStatus();

    }
}
