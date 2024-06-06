import javax.swing.JOptionPane;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque sua idade"));
        int tarifa = 0;
        if (age <= 11) {
            tarifa = 3;
        }
        else if (age > 11 || age < 65) {
            tarifa = 5;
        }
        else {
            tarifa = 3;
        }
        System.out.println(tarifa);

    }
}
