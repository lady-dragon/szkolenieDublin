package day3;

public class Varargs {

    public static void main(String[] args) {
        int[] dd = {4,5,2,3};

        int result = sum(dd);
        System.out.println(result);
    }

    private static int sum(int...a){
        int result = 0;

//        for (int i =0; i<a.length;i++){
//            result += a[i];
//        }
//
        for(int i: a){
            result += i;
        }
        return result;
    }



}
