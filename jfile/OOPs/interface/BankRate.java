import java.io.*;

interface RBI {
  public abstract double rate();
}

class SBI implements RBI {
  public double rate() {
    return (8.5);
  }
}

class BOI implements RBI {
  public double rate() {
    return (18.2);
  }
}

class ICICI implements RBI {
  public double rate() {
    return (10.4);
  }
}

class BankRate {
  public static void main(String[] args) throws IOException {
    SBI cl = new SBI();
    BOI ol = new BOI();
    ICICI ic = new ICICI();
    System.out.println("Rate of interest of SBI :-" + cl.rate());
    System.out.println("Rate of interest of BOI :-" + ol.rate());
    System.out.println("Rate of interest of ICICI :-" + ic.rate());
  }
}
