package model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class filhanterare {
    private String filvag;
    private boolean saveAssString;
    private String kye;
    private DataInputStream binIn;
    private byte[] meside;

    // DataInputStream binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filenameBin)));
    public void setFilVag(String filVag) throws IOException {
        binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filVag)));
        meside = binIn.readAllBytes();
    }
}
