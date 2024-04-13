package programs;
class Department implements Cloneable {
	  int department_id;
	  String department_name;

	  // Department class constructor
	  public Department(int department_id, String department_name) {
	    this.department_id = department_id;
	    this.department_name = department_name;
	  }

	  // clone() method overriding using @Overirde
	  @Override
	  protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	  }

	  public static void main(String[] args) throws CloneNotSupportedException {
	    Department d1 = new Department(202, "electrical");

	    // clone d1 and copy it into d2 Department object

	    Department d2 = (Department) d1.clone();

	    System.out.println(d2.department_id);
	    System.out.println(d2.department_name);
	  }
	}