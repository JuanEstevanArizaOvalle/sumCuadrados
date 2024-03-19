import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int n;
        int i=0;
        int opcion;
        int sum=0;
        JOptionPane.showMessageDialog(null, "BIENVENIDO");
        JOptionPane.showMessageDialog(null,"porfavor escoja con que tipo de ciclo quiere que se ejecute su programa\n"
        +"1. si desea que su programa se ejecute con el ciclo while\n"
        +"2. si desea que su programa se ejecute con el ciclo do while\n"
        +"3. si desea que su programa se ejecute con el ciclo for\n");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("porfavor elija la opccion"));

        switch (opcion) {
            case 1:
                n = Integer.parseInt(JOptionPane.showInputDialog("su numero natural va aqui"));
                int cuadrado;
                while (i<=n) {
                cuadrado = i * i;
                sum = sum + cuadrado;
                i++;
            }
            JOptionPane.showMessageDialog(null, "su resultado es..." + sum);
                break;
            case 2:
                n = Integer.parseInt(JOptionPane.showInputDialog("su numero natural va aqui"));
                 do {
                     cuadrado = i * i;
                     sum = sum + cuadrado;
                     i++;
                }

                while (i<=n);
                JOptionPane.showMessageDialog(null, "su resultado es..."+sum);
                break;
            case 3:
                n = Integer.parseInt(JOptionPane.showInputDialog("su numero natural va aqui"));
                for (i=0;i<=n;i++) {
                    cuadrado = i * i;
                    sum = sum + cuadrado;
                    i++;
                }
                JOptionPane.showMessageDialog(null, "su resultado es..."+sum);
                break;



        }

    }

    }