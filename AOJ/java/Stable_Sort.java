Class Stable_Sort{

  static void  print(String[] s){
            for(int i=0;i<s.length; i++){
                System.out.print((i==0? "":"")+s[i]);
            }
            System.out.println();
        }

    static boolean isSame(String[] a, Stirng[] b){
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(Strings args[]){
      Scanner sc = new Scanner(System.in);
      int n= integer.parseInt(sc.nextLine());
      Sting[] array = sc.nextLine().split(" ");
      sc.close();
      String[] arrayB = array.clone();
      String[] arrayS = array.clone();
    }
}