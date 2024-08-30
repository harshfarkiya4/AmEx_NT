package exercises;
import java.util.HashMap;
import java.util.Arrays;
// import Gender;
class Customer {
    String customerName = "";
    String phoneNumber = "";
    Gender gender;
    static HashMap<Gender, Integer> gender_counts = new HashMap<>();
    // Static block to initialize the HashMap with default values
    static {
        gender_counts.put(Gender.MALE, 0);
        gender_counts.put(Gender.FEMALE, 0);
        gender_counts.put(Gender.OTHERS, 0);
    }
    Customer(String customerName, String phoneNumber, Gender gender) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        Integer prevCount = gender_counts.get(gender);
        if (prevCount == null) {
            prevCount = 0;
        }
        gender_counts.put(gender, prevCount + 1);
        this.gender = gender;        
    }
    void getGenderCounts(){
        gender_counts.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" : "+ entry.getValue()));
    }
    void AvailableGenders(){
        Arrays.stream(Gender.values()).forEach(System.out::println);
    }
    public static void main(String args[]){
        Customer customer = new Customer("Harsh", "9575594938",Gender.MALE);
        Customer customer2 = new Customer("Sajal", "9575594938",Gender.FEMALE);
        Customer customer3 = new Customer("Harsh", "9575594938",Gender.MALE);
        Customer customer4 = new Customer("Harsh", "9575594938",Gender.OTHERS);
        customer.getGenderCounts();
        customer.AvailableGenders();
    }
}
