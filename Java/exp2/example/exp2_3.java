class Car{
  String brands;
  public Car(String brand)
  {
    brands = brand;
  }
  public void displayCar()
  {
    System.out.println(this.brands);
  }
  public static void main(String[] args)
  {
    Car new_car = new Car("Ford");
    new_car.displayCar();
  }
}