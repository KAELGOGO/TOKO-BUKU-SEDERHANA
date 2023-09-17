import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        while (true) {
            System.out.println("\n================================================================================");
            System.out.println("HALLO SELAMAT DATANG DI TOKO BUKU KAMI!!");
            System.out.println("================================================================================");
            System.out.println("1.MASUK");
            System.out.println("2.KELUAR");
            System.out.print("APA YANG INGIN ANDA LAKUKAN : ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    namaSaldoMember();
                    break;

                case 2:
                    System.out.println("\nTERIMA KASIH SILAHKAN DATANG KEMBALI");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
                    break;

            }
        }

    }

    public static void namaSaldoMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTOLONG MASUKKAN NAMA ANDA :");
        String nama = sc.nextLine();
        System.out.print("APA ANDA MEMILIKI MEMBER?(Y/N) : ");
        char jawaban = sc.next().charAt(0);
        if (jawaban == 'y' || jawaban == 'Y') {
            member();

        } else if (jawaban == 'n' || jawaban == 'N') {
            System.out.println("\nMAAF TAPI ANDA TIDAK BISA MELAKUKAN NYA\nMOHON LANGGANAN MEMBER");
            System.out.println("===========================================");
        } else {
            System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
            namaSaldoMember();
            ;
        }

    }

    public static void member() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTOLONG MASUKKAN ID MEMBER ANDA : ");
        String id = sc.nextLine();
        if (id.length() == 5) {
            int total = 0;

            for (int i = 0; i < id.length(); i++) {
                char digitChar = id.charAt(i);
                if (Character.isDigit(digitChar)) {
                    int digit = Character.getNumericValue(digitChar);
                    total += digit;
                } else {
                    System.out.println("\nID harus berisi angka 0-9.");
                    member();
                }
            }

            if (total >= 25) {
                System.out.println("ID valid. Jumlah digit ID adalah " + total + ".");
                listBuku();
            } else {
                System.out.println("ID tidak valid. Jumlah digit ID kurang dari 25.");
                member();
            }
        } else {
            System.out.println("ID harus terdiri dari 5 digit.");
            member();
        }
    }

    public static void listBuku() {
        int jawaban;
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================================");
        System.out.println("\n1.SI KANCIL");
        System.out.println("2.UPIN IPIN");
        System.out.println("3.DORAEMON");

        System.out.print("BUKU NOMOR : ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("================================================================================");
                System.out.println("\n1. BELI");
                System.out.println("2. PINJAM");
                System.err.print("UNTUK APA? ");
                jawaban = sc.nextInt();
                switch (jawaban) {
                    case 1:
                        beliBuku(100000);
                        break;

                    case 2:
                        pinjamBuku(10000);
                        break;

                    default:
                        System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
                        listBuku();
                }

            case 2:
                System.out.println("================================================================================");
                System.out.println("\n1. BELI");
                System.out.println("2. PINJAM");
                System.err.print("UNTUK APA? ");
                jawaban = sc.nextInt();
                switch (jawaban) {
                    case 1:
                        beliBuku(200000);
                        break;

                    case 2:
                        pinjamBuku(20000);
                        break;

                    default:
                        System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
                        listBuku();
                }

            case 3:
                System.out.println("================================================================================");
                System.out.println("\n1. BELI");
                System.out.println("2. PINJAM");
                System.err.print("UNTUK APA? ");
                jawaban = sc.nextInt();
                switch (jawaban) {
                    case 1:
                        beliBuku(300000);
                        break;

                    case 2:
                        pinjamBuku(30000);
                        break;

                    default:
                        System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
                        listBuku();
                }

            default:
                System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
                listBuku();

        }

    }

    public static void beliBuku(int harga) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BUKU INI BERNILAI " + harga + "Rp");
        System.out.print("\nAPA ANDA AKAN MELANJUTKAN PEMBAYARAN? (Y/N) : ");
        char jawaban = sc.next().charAt(0);
        System.out.println("================================================================================");
        if (jawaban == 'y' || jawaban == 'Y') {
            System.out.println("\nPILIHAN YANG BAIK");
            System.out.print("\nTOLONG MASUKKAN SALDO ANDA : ");
            int saldo = sc.nextInt();
            if (saldo >= harga) {
                System.out.println("\nANDA MEMASUKKAN SALDO SEBESAR " + saldo + "Rp");
                saldo -= harga;
                System.out.println("\nTERIMA KASIH TELAH MEMBELI BUKU INI");
                if (saldo == 0) {
                    System.out.println("\nUANG YANG KAMI TERIMA PAS YA, TERIMA KASIH!!");
                    System.out.println(
                            "================================================================================");
                    main(null);
                    ;
                } else {
                    System.out
                            .println("\nUANG YANG KAMI TERIMA ADA KEMBALIAN SEBESAR " + saldo + "Rp SILAHKAN DITERIMA");
                    System.out.println(
                            "================================================================================");
                    main(null);
                    ;
                }
            } else {
                System.out.println("\nSALDO ANDA TIDAK MENCUKUPI TRANSAKSI\nMOHON ISI ULANG SALDO ANDA!!");
                System.out.println("================================================================================");
            }

        } else if (jawaban == 'n' || jawaban == 'N') {
            System.out.println("\nSAYANG SEKALI, SELAMAT BERBELANJA");
            listBuku();

        } else {
            System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
            beliBuku(harga);
        }
    }

    public static void pinjamBuku(int biaya) {
        Scanner sc = new Scanner(System.in);
        double fe = 0.02;
        System.out.println("DALAM PEMINJAMAN BUKU AKAN DI KENAKAN BIAYA SEBSESAR " + biaya
                + "Rp\nUNTUK HARI PERTAMA DAN\nDITAMBAHKAN 20% PERHARI UNTUK HARI SELANJUTNYA");
        System.out.print("\nBERAPA HARI ANDA AKAN MELAKUKAN PEMINJAMAN : ");
        int waktuPeminjaman = sc.nextInt();
        double totalFe = (biaya * fe) * (waktuPeminjaman - 1);
        double total = totalFe + biaya;

        System.out.println("UNTUK BUKU INI AKAN DIKENAKAN BIAYA SEBESAR : " + total + "Rp");
        System.out.print("\nAPA ANDA AKAN MELANJUTKAN TRANSAKSI?(Y/N) : ");
        char jawaban = sc.next().charAt(0);
        System.out.println("================================================================================");
        if (jawaban == 'y' || jawaban == 'Y') {
            System.out.println("\nPILIHAN YANG BAIK");
            System.out.print("\nTOLONG MASUKKAN SALDO ANDA : ");
            int saldo = sc.nextInt();
            if (saldo >= total) {
                System.out.println("\nANDA MEMASUKKAN SALDO SEBESAR " + saldo + "Rp");
                saldo -= total;
                System.out.println("\nTERIMA KASIH TELAH MEMBELI BUKU INI");
                if (saldo == 0) {
                    System.out.println("\nUANG YANG KAMI TERIMA PAS YA, TERIMA KASIH!!");
                    System.out.println(
                            "================================================================================");
                    main(null);
                    ;
                } else {
                    System.out
                            .println("\nUANG YANG KAMI TERIMA ADA KEMBALIAN SEBESAR " + saldo + "Rp SILAHKAN DITERIMA");
                    System.out.println(
                            "================================================================================");
                    main(null);
                    ;
                }
            } else {
                System.out.println("\nSALDO ANDA TIDAK MENCUKUPI TRANSAKSI\nMOHON ISI ULANG SALDO ANDA!!");
                System.out.println("================================================================================");
            }
        } else if (jawaban == 'n' || jawaban == 'N') {
            System.out.println("\nSAYANG SEKALI, SELAMAT BERBELANJA");
            listBuku();
        } else {
            System.out.println("\nINPUT TIDAK DIKENALI MOHON ULANGI INPUT");
            pinjamBuku(biaya);
        }

    }

}