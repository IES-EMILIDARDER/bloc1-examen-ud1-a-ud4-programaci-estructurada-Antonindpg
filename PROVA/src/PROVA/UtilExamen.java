package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    
    // 1_A arrayListToArray
    public static int[] arrayListToArray(ArrayList<Integer> arrayL){
        int[] arrayfromlist = new int[arrayL.size()];
        
        for(int i=0; i < arrayL.size(); i++){
            arrayfromlist[i] = arrayL.get(i);
        }
        
        return arrayfromlist;
    }
    
    // 1_B arrayToArrayList
    public static ArrayList<Integer> arrayToArrayList(int[]array){
        ArrayList<Integer>arrayL = new ArrayList<>();
        
        for(int i=0; i < array.length; i++){
            arrayL.add(array[i]);
        }
        
        return arrayL;
    }
    
    // 1_C 'mostraArrayListInt
    public static void mostraArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    
    // 2 obteRepetits
    public static ArrayList<Integer> obteRepetits(int[]array1,int[]array2){
        ArrayList<Integer> repetits = new ArrayList<>();

        for(int i = 0; i<array1.length; i++){
            boolean trobat = false;
            for(int j = 0; j<array2.length ;j++){
                if(array1[i] == array2[j]){
                    trobat = true;
                    break;
                }
            }
            if(trobat == true){
                    repetits.add(array1[i]);
            } 
        }
        
        int[] arrayfromlist = arrayListToArray(repetits);
        
        repetits = tornaDiferents(arrayfromlist);  // CORRECCIÓ: no es demana ...
        
        return repetits;
    }
    
    // 2 (obteRepetits) Utilitzareaquesta clase per nomes rebre una vegada cada numero repetit
    public static ArrayList<Integer> tornaDiferents(int[]array){
        ArrayList<Integer> diferents = new ArrayList<>();
        
        for(int i = 0; i<array.length; i++){
            boolean trobat = false;
            for(int j = 0; j<diferents.size() ;j++){
                if(array[i] == diferents.get(j)){
                    trobat = true;
                    break;
                }
            }
            if(trobat == false){
                    diferents.add(array[i]);
            } 
        }
        return diferents;
    }
    
    // 3 ordenaArray
    public static ArrayList<Integer> ordenaArray(int[]array){
        ArrayList<Integer> ordenat = new ArrayList<>();
        for(int i = 0; i<array.length; i++){
            boolean insertat = false;
            for(int j = 0; j<ordenat.size() ;j++){
                if(array[i] < ordenat.get(j)){
                    ordenat.add(j,array[i]);
                    insertat = true;
                    break;
                }
            }
            if(insertat==false){
                ordenat.add(array[i]);
            }
        }
        return ordenat;
    }
    
    // 4 obteRepetitsOrdenat
    public static ArrayList<Integer> obteRepetitsOrdenat(int[]array1,int[]array2){
        ArrayList<Integer> resultat = new ArrayList<>();
        
        resultat=obteRepetits(array1,array2);
        
        int[]array=arrayListToArray(resultat);
        
        resultat=ordenaArray(array);
        
        return resultat;
    }
}
