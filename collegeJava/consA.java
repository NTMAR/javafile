class consA {
  public static void main(String[] args) {
    Upp();
    Low();
    Const();
  }

  public static void Upp() {
    String s1 = "Sai";
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
  }

  public static void Low() {
    String s1 = "Nath";
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
  }

  public static void Const() {
    String s1 = "Sai";
    String s2 = "Nath";
    System.out.println(s1 + "" + s2);
  }
}
