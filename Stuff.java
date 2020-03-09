
public class Stuff extends Person {
					private String school;
					private double pay;
					public Stuff(String name, String address, String school, double pay) {
						super(name, address);
						this.school = school;
						this.pay = pay;
					}
					public Stuff(String name, String address) {
						super(name, address);
					}
					@Override
					public String toString() {
						return "Stuff [school=" + school + ", pay=" + pay + "]";
					}
					public String getSchool() {
						return school;
					}
					public void setSchool(String school) {
						this.school = school;
					}
					public double getPay() {
						return pay;
					}
					public void setPay(double pay) {
						this.pay = pay;
					}	
					

}
