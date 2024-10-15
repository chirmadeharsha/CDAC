package assignmen5;
		class Vehicles {
		    private String make;
		    private int year;

		    public void Vehicle(String make, int year) {
		        this.make = make;
		        this.year = year;
		    }

		    public String getMake() {
		        return make;
		    }

		    public int getYear() {
		        return year;
		    }
		}

		class Car extends Vehicles {
		    private String model;

		    public Car(String make, int year, String model) {
		        super();
		        this.model = model;
		    }

		    public String getModel() {
		        return model;
		    }

		    public void displayDetails() {
		        System.out.println("Make: " + getModel());
		        System.out.println("Year: " + getYear());
		        System.out.println("Model: " + model);
		    }

			private String getYear() {
				return null;
			}
		}

		public class vehicles {
		    public static void main(String[] args) {
		        Car car = new Car("Toyota", 2020, "Corolla");
		        car.displayDetails();
		    }

	}


