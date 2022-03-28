import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        String cadena[]=new String[6];
        String invert[]=new String[6];
        int cont=5;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("ingrese una cadena de texto ");
            cadena[i]=sc.next();
            invert[cont]=cadena[i];
            cont--;
        }
        cont=5;
        for (int j=1;j<6;j++){
            System.out.println(invert[j]);
        }
    }
}
