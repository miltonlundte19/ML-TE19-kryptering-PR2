package model;

import java.util.ArrayList;

public class krypterare {
    public static void main(String[] args) {
        String masige = "hhhhhhhhhh";
        String kye = "jjj";
        ArrayList<Character> krypt = inkrypterr(masige,kye);
    }

    private static ArrayList<Character> inkrypterr(String masige, String kye) {
        return null;
    }

    private ArrayList<Character> inkrypter(String mesige, String kye) {
        ArrayList<Character> krypt = new ArrayList<>();
        int m = mesige.length();
        int k = kye.length();
        int kountK = 0;
        for (int i = 0; i < m; i++, kountK++) {
            if (kountK == k) {
                kountK = 0;
            }
            System.out.println(i + "  " + kountK);

        }
        return krypt;
    }
}
