package J18;

public class J18_new {
    public static void main(String[] args) {

        int [] table_1 = new int [3];
        int [] table_2 = new int [3];
        int sum = 0;

        table_1 [0] = 4;
        table_1 [1] = 2;
        table_1 [2] = 7;
        table_2 [0] = 32;
        table_2 [1] = 1;
        table_2 [2] = 0;


        for (int i: table_1){
            System.out.print(" "+i+" ");
        }
        System.out.println("");

        for (int i: table_2){
            System.out.print(" "+i+" ");
        }
        System.out.println("");
        System.out.println("------------ SUMA");

        for (int i = 0; i<table_1.length; i++){
            sum += table_1[i]+table_2[i];
        }
        System.out.println(sum);
    }
}
