package model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;

public class krypterare {
    private byte[] mesigeByt;
    private byte[] keyByt;

    public krypterare(String mesigeStr, String keyStr) {
        mesigeByt = mesigeStr.getBytes(StandardCharsets.UTF_8);
        keyByt = keyStr.getBytes(StandardCharsets.UTF_8);
    }

    public krypterare(byte[] mesigeByt, byte[] keyByt) {
        this.mesigeByt = mesigeByt;
        this.keyByt = keyByt;
    }

    public krypterare(byte[] mesigeByt, String keyStr) {
        this.mesigeByt = mesigeByt;
        byte[] keySeeding = new byte[mesigeByt.length];
        Random r = new Random(stringToSeed(keyStr));
        r.nextBytes(keySeeding);
        keyByt = keySeeding;
    }

    public String getKryptStr() {
        byte[] inkryptd = bytinkrypter();
        return new String(inkryptd, StandardCharsets.UTF_8);
    }

    public byte[] getKryptByt() {
        return bytinkrypter();
    }

    private byte[] bytinkrypter() {
        int mLength = this.mesigeByt.length;
        int kLength = this.keyByt.length;
        byte[] kryptByteMesige = new byte[mLength];
        int k = 0;
        for (int i = 0; i < mLength; i++, k++) {
            if (k == kLength) {
                k = 0;
            }
            kryptByteMesige[i] = (byte) (this.mesigeByt[i]^this.keyByt[k]);
        }
        return kryptByteMesige;
    }

    static long stringToSeed(String s) {
        if (s == null) {
            return 0;
        }
        long hash = 0;
        for (char c : s.toCharArray()) {
            hash = 31L*hash + c;
        }
        return hash;
    }
}
