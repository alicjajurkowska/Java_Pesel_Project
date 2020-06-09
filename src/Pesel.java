import java.util.Scanner;

    public class Pesel {


        public static boolean check(String pesel){

            int[] number = {1, 3, 7, 9, 1, 3, 7 ,9 ,1 ,3};


            if (pesel.length() != 11) return false;

            int suma = 0;

            for (int i = 0; i < 10; i++)
                suma += Integer.parseInt(pesel.substring(i, i+1)) * number[i];

            int cyfraKontrolna = Integer.parseInt(pesel.substring(10, 11));

            System.out.println(suma);
            suma %= 10;
            System.out.println(suma);
            suma = 10 - suma;
            System.out.println(suma);

            return (suma == cyfraKontrolna);

        }

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.print ("Podaj dowolny numer PESEL: " );

            String pesel = sc.nextLine();

            System.out.println("Twój PESEL jest " + ((check(pesel)) ? "poprawny." : "niepoprawny"));

        }
    }


