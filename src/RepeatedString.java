import java.util.Scanner;

public class RepeatedString { //creo una clase de cadenaRepetida

    static long RepeatedString(String s, long n){ //Entradas de programa son s como cadena, y n como entero de tipo long

        int cadenaLog = s.length();//Encuentro tamaño de cadena
        long c = n/s.length(); //Esto dará el numero de cadenas completas que se repetiran
        long r = n%s.length(); //Esto enseñará el número de residuos o cadenas incompletas que comprenden el arreglo por completar.
        long tamanSubcaden = (r ==0) ? 0 : r ; //Si residuo es 0, ubique 0 como valor por añadir a una cadena simple, si tiene otro valor se ubica allí
        long aConteo = c * getCuentaLetras(s,cadenaLog)+ getCuentaLetras(s,tamanSubcaden);
        return aConteo;

    }

    public static long getCuentaLetras(String s, long cadenaLog){//Se necesita entonces, la cadena y su tamanho
        long contador = 0; //Contador creado
        for(int i = 0;i< cadenaLog ;i++){ // Para i menor a tamaño de cadena
            if(s.charAt(i) == 'a') { // Tomo el indice de cada caracter de la cadena y lo igualo a 'a', si pasa aumenta el contador en 1
                contador++;
            }
        }
        return contador; //devuelve el contador como parametro solicitado como salida del metodo
    }

    public static void main(String[] args) { //metodo principal
        Scanner sc = new Scanner(System.in); //toma Valor de usuario
        String s = sc.next();//Toma valor registrado tipo S
        long n = sc.nextLong();// Toma valor tipo long
        long aConteo = RepeatedString(s,n); // LLama funcion de arriba
        System.out.println(aConteo); //Imprime el resultado
        sc.close();
    }
}
