import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
    private static int a=1;
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        start();

    }

    public static void start(){
        try{
            while(a!=0){
                System.out.println("Array dan Input Output");
                System.out.println("1. Jumlahkan element pada Array");
                System.out.println("2. Jumlahkan element Array di dalam Array");
                System.out.println("3. Membalik susunan Array");
                System.out.println("4. Membuat txt file");
                System.out.println("5. Keluar");
                System.out.println();
                System.out.print("Pilih menu: ");
                System.out.println();
                int inp = scan.nextInt();


                switch(inp){
                    case 1:
                        sum();
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        twoArray();
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        reverse();
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println();

                        break;
                    case 4:
                        inputOuput();
                        Thread.sleep((2000));
                        System.out.println();
                        System.out.println();
                        break;
                    case 5:
                        a = 0;
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                        Thread.sleep(500);
                        System.out.println();
                        System.out.flush();
                        start();
                }
            }

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void reverse(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan element Array(pisahkan dengan spasi): ");
        String input = scan.nextLine();
        int[] arr = convertToIntArray(input.split(" "));
        Array reverse = new Array();
        System.out.println("Hasil membalik urutan array: " + Arrays.toString(reverse.reverseArray(arr)));
        System.out.println();
        System.out.println();
        start();
    }
    public static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan element dalam Array(pisahkan dengan spasi): ");
        String input = scan.nextLine();
        System.out.println(Arrays.toString(input.split(" ")));
        int[] arr = convertToIntArray(input.split((" ")));

        Array array = new Array(arr);
        System.out.println("Jumlah element dalam array: "+ array.sumArray());
        System.out.println();
        start();

    }

    public static void twoArray(){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Jumlah array yang ingin dijadikan array baru: ");
        int count = scan1.nextInt();
        int[][] arr = new int[count][];
        for(int i = 0; i<count;i++){
            System.out.print("masukkan element array(pisahkan dengan spasi): ");
            String s = scan2.nextLine();
            int[] inputArr = convertToIntArray(s.split(" "));
            arr[i] = inputArr;
        }

        Array two = new Array();
        System.out.print("[");
        for(int[] num: arr){
            System.out.print(Arrays.toString(num)+", ");
        }
        System.out.println("]");
        System.out.println("Hasil proses penjumlahan Array dimensi 2: "+ Arrays.toString(two.twoArray(arr)));
        System.out.println();
        start();
    }

    public static void inputOuput(){
        Scanner write = new Scanner(System.in);
        System.out.println("Input dan Output pada Java");
        System.out.println("1. Membuat txt");
        System.out.println("2. Membaca txt");
        System.out.println("3. Kembali ke menu utama");
        int inp2 = write.nextInt();

        switch (inp2){
            case 1:
                buatFile();
                System.out.println();
                System.out.println();
                break;
            case 2:
                bacaFile();
                System.out.println();
                System.out.println();
                break;
            case 3:
                start();
                System.out.println();
                System.out.println();
                break;
            default:
                System.out.println("Pilihan tidak tersedia, kembali ke menu sebelumnya");
                inputOuput();

        }
    }

    public static void buatFile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kalimat yang akan ditambahkan pada output.txt: ");
        String a = scan.nextLine();
        FileInputOutput written = new FileInputOutput();
        written.makeFile(a);
        System.out.println();
        inputOuput();
    }

    public static void bacaFile(){
        FileInputOutput read = new FileInputOutput();
        read.readFile();
        System.out.println();
        inputOuput();
    }
    public static int[] convertToIntArray(String[] convert){
        int [] newArray = new int[convert.length];
        for(int i=0; i< convert.length; i++){
            newArray[i] = Integer.parseInt(convert[i]);
        }
        return newArray;
    }
}