public class SampleArray{
    public static void main(String[] args){
        int[] a=new int[6];
        a[0]=99;
        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }
        int[] b={1,2,3,4,5,6};
        for(int j=0;j<6;j++){
            System.out.print(b[j]+" ");
        }
        int[] c=new int[]{5,5,5,5,5};
        for(int k=0;k<5;k++){
            System.out.println(c[k]);
        }
    }
}