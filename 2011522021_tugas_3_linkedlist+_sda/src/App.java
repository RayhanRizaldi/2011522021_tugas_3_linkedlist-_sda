import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> No_Bp = new LinkedList<>();
        LinkedList<String> Nama_Mahasiswa = new LinkedList<>();
        LinkedList<String> Alamat = new LinkedList<>();
        Scanner in1 = new Scanner(System.in);
        
        System.out.printf("Masukkan NO. Bp         : ");
        String b = in1.nextLine();
        No_Bp.add(b);

        System.out.printf("Masukkan Nama Mahasiswa : ");
        String n = in1.nextLine();
        Nama_Mahasiswa.add(n);

        System.out.printf("Masukkan Alamat         : ");
        String a = in1.nextLine();
        Alamat.add(a);

        System.out.println("--------------------------------");
        System.out.println("NO. Bp         : "+No_Bp);
        System.out.println("Nama Mahasiswa : "+Nama_Mahasiswa);
        System.out.println("Alamat         : "+Alamat);
        System.out.println("--------------------------------");
        System.out.println("ERROR ERROR");
        System.out.println("ERROR ERROR");
        System.out.println("ERROR ERROR");
        System.out.println("ERROR ERROR");

        System.out.println("--------------------------------");
        No_Bp.add("ERROR BP");
        No_Bp.add("ERROR BP");
        No_Bp.addLast("ERROR BP");
        No_Bp.add("ERROR BP");
        No_Bp.addFirst("ERROR BP");
        No_Bp.set(3, "BUG BP");
        No_Bp.set(4, "BUG BP");
        No_Bp.push("VIRUS BP");
        System.out.println("UPDATE TERKINI : "+No_Bp);

        Nama_Mahasiswa.add("ERROR");
        Nama_Mahasiswa.add("ERROR");
        Nama_Mahasiswa.addLast("ERROR");
        Nama_Mahasiswa.add("ERROR");
        Nama_Mahasiswa.addFirst("ERROR");
        Nama_Mahasiswa.set(5, "BUG");
        Nama_Mahasiswa.set(0, "BUG");
        Nama_Mahasiswa.push("VIRUS");
        System.out.println("UPDATE TERKINI : "+Nama_Mahasiswa);

        Alamat.add("ERROR");
        Alamat.add("ERROR");
        Alamat.addLast("ERROR");
        Alamat.add("ERROR");
        Alamat.add("ERROR");
        Alamat.addFirst("ERROR");
        Alamat.set(2, "BUG");
        Alamat.set(6, "BUG");
        Alamat.push("VIRUS");
        System.out.println("UPDATE TERKINI : "+Alamat);
        
        System.out.println("--------------------------------");
        System.out.println("-------Membersihkan Data--------");
        System.out.println("----------Mohon Tunggu----------");
        System.out.println(" ");
        System.out.println("--------------NO. BP------------");
        No_Bp.remove(1);
        No_Bp.remove(2);
        No_Bp.remove(4);
        System.out.println("UPDATE TERKINI : "+No_Bp);
        No_Bp.removeLast();
        No_Bp.remove(2);
        System.out.println("UPDATE TERKINI : "+No_Bp);
        No_Bp.pop();
        System.out.println("UPDATE TERKINI : "+No_Bp);

        System.out.println(" ");
        System.out.println("---------------NAMA-------------");
        Nama_Mahasiswa.remove(1);
        Nama_Mahasiswa.remove(2);
        Nama_Mahasiswa.remove(4);
        System.out.println("UPDATE TERKINI : "+Nama_Mahasiswa);
        Nama_Mahasiswa.removeLast();
        Nama_Mahasiswa.remove(2);
        System.out.println("UPDATE TERKINI : "+Nama_Mahasiswa);
        Nama_Mahasiswa.pop();
        System.out.println("UPDATE TERKINI : "+Nama_Mahasiswa);

        System.out.println(" ");
        System.out.println("---------------NAMA-------------");
        Alamat.remove(1);
        Alamat.remove(2);
        Alamat.remove(4);
        System.out.println("UPDATE TERKINI : "+Alamat);
        Alamat.removeLast();
        Alamat.removeLast();
        Alamat.remove(2);
        System.out.println("UPDATE TERKINI : "+Alamat);
        Alamat.pop();
        System.out.println("UPDATE TERKINI : "+Alamat);

        System.out.println("--------------------------------");
        System.out.println("------PEMBERSIHAN SELESAI-------");
        System.out.println("--------------------------------");
        System.out.println("NO. Bp         : "+No_Bp);
        System.out.println("Nama Mahasiswa : "+Nama_Mahasiswa);
        System.out.println("Alamat         : "+Alamat);
        System.out.println("--------------------------------");

        in1.close();
    }
}
