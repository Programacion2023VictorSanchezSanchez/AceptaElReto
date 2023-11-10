import java.util.*;

public class Reto605 {
    public static void main (String[] args) {
        int salir = 0;
        System.out.println("Vamos a organizar el armario...");
        System.out.println("Introduce V para verano, I para invierno o A para ambas, introduce . para salir: ");
        Scanner sc = new Scanner(System.in);

       while(salir != 1){
           String entrada = sc.nextLine();
           if(entrada.equals(".")){
               salir = 1;
           }
           else {
               System.out.println(comprobarEntrada(entrada));
           }
       }
            sc.close();

    }
    public static String comprobarEntrada(String entrada){
        int contadorInvierno = 0;
        int contadorVerano = 0;
        String resultado = "";

        for(int i = 0; i < entrada.length() ; i++){
            char c = entrada.charAt(i);
                switch(c){
                    case 'V':
                        contadorVerano++;
                        break;
                    case 'I':
                        contadorInvierno++;
                        break;
                    case 'A':
                        contadorInvierno++;
                        contadorVerano++;
                        break;
                    default:
                        break;
                }
        }
        if(contadorInvierno == contadorVerano){
            resultado = "EMPATE";
        }
        else if(contadorInvierno > contadorVerano){
            resultado = "INVIERNO";
        }
        else{
            resultado = "VERANO";
        }
        return resultado;
    }
}
