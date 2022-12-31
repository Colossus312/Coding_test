import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int[] D = {A,B,C};
        Arrays.sort(D);
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        hash.put(D[0],0);
        hash.put(D[1],0);
        hash.put(D[2],0);
        for(int i = 0; i < 3; i++){
            hash.put(D[i],hash.get(D[i])+1);
        }
        if(hash.get(D[0]) == 1){
            if(hash.get(D[1]) == 1){
                System.out.println(D[2]*100);
            }else{
                System.out.println(D[1]*100+1000);
            }
        }else if(hash.get(D[0]) == 3){
            System.out.println(D[0]*1000+10000);
        }else{
            System.out.println(D[0]*100+1000);
        }
    }

}