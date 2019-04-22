import java.util.*;

class count {
    static void printcount(int S[],int Q[]){
    int num=0;
    for(int i=0;i<Q.length;i++){
        for(int j=0;j<S.length;j++){
            if(S[j]==Q[i]) num++; 
        }
    }
        System.out.println(num);
    }

} 

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int []S = new int[n];        
        for(int i=0;i<n;i++){
            S[i] = sc.nextInt();
        }

        Scanner sc1 = new Scanner(System.in);
        int q = Integer.parseInt(sc1.next());
        int []Q = new int[q];
        for(int i=0;i<q;i++){
            Q[i] = sc.nextInt();
        }
        count.printcount(S,Q) ;    
    }

}