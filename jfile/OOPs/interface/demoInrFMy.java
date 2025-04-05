import java.io.*;

interface Secure {
  public static final int x = 0;
  public static final int y = 0;

  public abstract void here(int z);

  public abstract void act(int e);
}

class Next implements Secure {
  public void here(int z) {
    System.out.println(z + x);
  }

  public void act(int e) {
    System.out.println(e + y);
  }
}

class demoInrFMy {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.here(1);
    net.act(1);
  }
}