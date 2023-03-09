import java.util.ArrayList;
import java.util.Arrays;

public class ex{
    public static void main(String args[]){
        ArrayList<String> str = permutationAnt("cao");
        for(String s: str){
            System.out.println(s);
        }

    }

    public static int somatorio(int n){
        if(n == 0){
            return 0;
        }
        if(n > 0){
            return n + somatorio(n-1);
        }
        return n + somatorio(n+1);
    }

    public static int fib(int n){
        if(n<=0){
            return -1;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static int somatoriokj(int n, int k){
        if(n == k){
            return k;
        }
        if(n > k){
            return somatoriokj(k, n);
        }
        return n + somatoriokj(n+1,k);
    }

    public static boolean palindromo(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return true && palindromo(str.substring(1, str.length()-1));
        }
        return false;
    }

    //exercicios extras

    public static boolean dentroDeOutro(String str, String str2){
        if(str.length()>str2.length()){
            return false;
        }
        if(str.equals(str2.substring(0,str.length()))){
            return true;
        }
        return dentroDeOutro(str, str2.substring(1));

    }


    public static int nDigitos(int n){
        if(n == 0){
            return 0;
        }
        return 1 + nDigitos(n/10);
    }

    public static ArrayList<String> permutation(String s){
        if(s.equals("")){

        }
        ArrayList<String> o = new ArrayList<>();
        return o;
    }

    public static ArrayList<String> permutationAnt(String s){
        String aux = perAux(s,"");
        aux = aux.substring(0,aux.length()-1);
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(aux.split(",")));
        return arrayList;
    }

    public static String perAux(String str, String prefix){
        if(str.equals("")){
            return prefix+",";
        }
        String construtor = "";
        for(int i = 0; i < str.length();i++){
            String new_prefix = prefix + str.charAt(i);
            String new_str = "";
            char[] arraStr = str.toCharArray();
            for(int j = 0; j<arraStr.length;j++){
                if(i != j){
                    new_str += arraStr[j];
                }
            }

            construtor += perAux(new_str, new_prefix);
        }
        return construtor;
    }
}