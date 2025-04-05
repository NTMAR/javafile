class StudentNext {

  private int id;
  private String name;
  private double marks;

  StudentNext(int id, String name, double marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
  }

  void Display() {
    System.out.println("id=" + id + "\nname=" + name + "\nmarks=" + marks);
  }

  public static void main(String[] args) {
    StudentNext obj = new StudentNext(01, "Nitish", 33.33);
    obj.Display();
  }
}