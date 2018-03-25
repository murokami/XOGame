
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Alien implements Serializable {
}

class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("X.files"));
        Alien quellek = new Alien();
        out.writeObject(quellek);
    }
}