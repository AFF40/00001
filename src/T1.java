import java.util.Random;

public class T1 {
    public static void main(String[] args) {

        int vector_numeros[]=new int[10];
        for (int i=0;i<10;i++){
            int n=i-1;
            vector_numeros[i]= (int)(Math.random()* 11);
            if (vector_numeros[i]==0){
                vector_numeros[i]= (int)(Math.random()* 11);
            }
            System.out.println("el numero es : " +vector_numeros[i]);

        }

    }
    }

