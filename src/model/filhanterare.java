package model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class filhanterare {
    private String filvag;
    private boolean saveAssString;
    private String kye;
    private String mesige;
    private DataInputStream binIn;
    private byte[] meside;

    public filhanterare(boolean saveAssString, String kye) {
        this.saveAssString = saveAssString;
        this.kye = kye;
    }

    public filhanterare(boolean saveAssString, String kye, String mesige) {
        this.saveAssString = saveAssString;
        this.kye = kye;
        this.mesige = mesige;
    }

    public void setFilVag(String filVag) throws IOException {
        binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filVag)));
        meside = binIn.readAllBytes();
    }
}


// DataInputStream binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filenameBin)));