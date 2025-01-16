package esercizio1;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


     public static Scanner sc= new Scanner(System.in);


    public static void main(String[] args) {
        Set<String> listaParole = new HashSet<String>();
        List <String> listaParole2= new ArrayList<String>();

            System.out.println("inserisci il numero di parole che vuoi inserire oppure 0 per terminare il programma: ");
            int numRicette = Integer.parseInt(sc.nextLine());
            int i=0;
            while(numRicette>=listaParole.size()){
                System.out.println("Inserisci una parola:");
                String p=sc.nextLine();
                boolean add=listaParole.add(p);
            if(!add){
                listaParole2.add(p);
             }

                i++;



            }


        System.out.println("parole univeche: " );
        stampaparole(listaParole);
        System.out.println("n parole univoche");
        System.out.println(listaParole.size());

        System.out.println("parole duplicate");
        stampaparole(listaParole2);
    }
/*public static Parole inserisciParole (){
            System.out.println("inserisci le parole");
            String parola=sc.nextLine();
            return new Parole(parola);

        }*/

        public static void stampaparole(Collection <String> lista){

        for(String p: lista){
            System.out.println(p);
        }

        }
   /* public static void stampaparole2(List<Parole> lista){

        for(Parole p: lista){
            System.out.println(p);
        }*/










}