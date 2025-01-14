package esercizio1;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


     public static Scanner sc= new Scanner(System.in);


    public static void main(String[] args) {
        Set<Parole> listaParole = new HashSet<Parole>();
        Set <Parole> listaParole2= new HashSet<Parole>();

            System.out.println("inserisci il numero di parole che vuoi inserire oppure 0 per terminare il programma: ");
            int numRicette = Integer.parseInt(sc.nextLine());
            for(int i=0;i<numRicette;i++){
                System.out.println("Inserisci una parola:");
                Parole p=new Parole(sc.nextLine());
                listaParole.add(p);



            }


        System.out.println("parole duplicate: " );


        System.out.println(listaParole.size());
        stampaparole(listaParole);
    }
/*public static Parole inserisciParole (){
            System.out.println("inserisci le parole");
            String parola=sc.nextLine();
            return new Parole(parola);

        }*/

        public static void stampaparole(Set<Parole> lista){

        for(Parole p: lista){
            System.out.println(p);
        }

        }
    public static void stampaparole2(List<Parole> lista){

        for(Parole p: lista){
            System.out.println(p);
        }

    }








}