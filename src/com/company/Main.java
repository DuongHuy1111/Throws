package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int tuoi = nhapTuoiNhanVien();
            System.out.println("Tuổi đã nhập: " + tuoi);
        } catch (InputMismatchException | IOException e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ " + e.toString());
        }
    }

    private static int nhapTuoiNhanVien() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập tuổi nhân viên :");
        int tuoi = scanner.nextInt();
        if (tuoi < 0) throw new IOException("tuổi không được nhỏ hơn 0");
        return tuoi;
    }
}
