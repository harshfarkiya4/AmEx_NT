package exercises;
import java.util.HashMap;

class Customer {
    enum Gender {
        MALE,
        FEMALE,
        OTHERS
    }

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
    Customer(String customerName, String phoneNumber, String gender) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        if(gender.toLowerCase().equals("male")){
            this.gender = Gender.MALE;
            // Update the gender count
            Integer prevCount = gender_counts.get(Gender.MALE);
            if (prevCount == null) {
                prevCount = 0;
            }
            gender_counts.put(Gender.MALE, prevCount + 1);
        }
        else if(gender.toLowerCase().equals("female")){
            this.gender = Gender.FEMALE;
            // Update the gender count
            Integer prevCount = gender_counts.get(Gender.FEMALE);
            if (prevCount == null) {
                prevCount = 0;
            }
            gender_counts.put(Gender.FEMALE, prevCount + 1);
        }
        else{
            Integer prevCount = gender_counts.get(Gender.OTHERS);
            if (prevCount == null) {
                prevCount = 0;
            }
            gender_counts.put(Gender.OTHERS, prevCount + 1);
        }
        
    }
    void getGenderCounts(){
        for (Gender key : gender_counts.keySet()) {
            System.out.println(key + ": " + gender_counts.get(key));
        }
    }
    void AvailableGenders(){
        for (Gender gender : Gender.values()) {
            System.out.println(gender);
        }
    }
    public static void main(String args[]){
        Customer customer = new Customer("Harsh", "9575594938","MALE");
        Customer customer2 = new Customer("Sajal", "9575594938","FEMALE");
        Customer customer3 = new Customer("Harsh", "9575594938","MALE");
        customer.getGenderCounts();
        customer.AvailableGenders();
    }
}
