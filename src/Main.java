public class Main {
    public static void main(String[] args) {

        int [] mas1 = new int [3];
        mas1[0] = 5;
        mas1[1] = 7;
        mas1[2] = 5;
        int [] mas2 = new int [3];
        mas2[0] = 5;
        mas2[1] = 7;
        mas2[2] = 5;

        boolean comparing = true;
        comparing = mas1.length == mas2.length;
        if (comparing){
            for (int index = 0 ; index < mas1.length; index ++){
                if (mas1[index] != mas2[index]){
                    comparing = false;
                }

            }if (comparing){
                System.out.println("Массивы равны");
            }else {
                System.out.println("Масивы не равны");

            }
        }


    }
}