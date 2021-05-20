import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

/**
 * @author LENOVO
 */

public class AdvanceSort {
    public static void main(String[] args) {
        System.out.println("============Tugas ALGODATA Sesi-9============");
        System.out.println("=============Program AdvanceSort=============");
        
        int data[]={12,29,2,30,8,24,12};
        int min = data[0];
        int index = 0;
        int swappingProcess = 0;
        long startTime = System.nanoTime();
       
        for (int i = 0; i < data.length - 1; i++) {
        for (int j = i; j < data.length; j++) {
        if ( data[j] < min ) {
          min = data[j];
          index = j;
          swappingProcess++;
            }
          System.out.println(Arrays.toString(data)+ " -> Jumlah Swap : " + swappingProcess);
        }
        if(min<data[i]){
            data[index]=data[i];
            data[i]=min;
           
        }
        min=data[i+1];
    }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("=============================================");
        System.out.println("Waktu Yang Diperlukan : " + timeElapsed + " Nano Detik");
        System.out.println("---------------------------------------------");
        System.out.println("============Muhammad Rifqi Darmawan==========");
        System.out.println("=================Reguler TI20A===============");
        System.out.println("");
}
}
/*
 * NIM   : 20200040053
 * Nama  : Muhammad Rifqi Darmawan
 * Kelas : Reguler TI20A
 */