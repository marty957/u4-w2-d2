package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esdue {
    public static void main(String[] args) {
        

    }


    public static List<Integer> listaOrdinata(int n){

        List <Integer> lista=new ArrayList<Integer>();
        Random random= new Random();

        for(int i=0;i<=n;i++){
            lista.add(random.nextInt(0,101));

        }
        Collections.sort(lista);
        return lista;


    }

}
