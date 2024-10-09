class FindMin{
    public static void minElement(int a[]){
        int x = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i]<x){
                x=a[i];
            }
        }
        System.out.println(x);
    }
    public static void main(String[] args){
        int a[] = {12,65,78,24,4,13,5};
       minElement(a);
    }
}
