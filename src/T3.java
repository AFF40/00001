public class T3 {
    public static void main(String[] args) {
        int maximo = 0;
        int minimo = 10;
        float promedio=0.00f;
        int n1[] =new int[10];
        for (int i=0;i<10;i++) {
            n1[i] = (int) (Math.random() * 11);
            if (n1[i] == 0) {
                do {
                    n1[i] = (int) (Math.random() * 11);
                }
                while (n1[i] == 0);
            }

            if (n1[i] > maximo) {
                maximo = n1[i];
            }
                if (n1[i] <= minimo) {
                    minimo = n1[i];
                }
            System.out.println("el numero es : " + n1[i]);
            promedio=promedio+n1[i];
            if (i == 9) {
                promedio=promedio/10;
                System.out.println(" el valor maximo de los vectores es : " +maximo);
                System.out.println(" el valor minimo de los vectores es : " +minimo);
                System.out.println(" el promedio de los valores de los vectores es : " +promedio);
            }


        }
    }
    }
