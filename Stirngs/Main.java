class Main{
    public static void main(String args[]){
        String s = "Harsh";
        String t = "Harsh";
        String v = new String("Harss");
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        //equal method compares the values
        System.out.println(s.equalsIgnoreCase(t));
        //== operator compares references not values.
        System.out.println(s==t);
        System.out.println(s==v);
        // compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
        System.out.println(s.compareTo(t));
        System.out.println(v.compareTo(t));
        //String concatination
        // by + operator or by concat() method
        System.out.println(s+t);
        System.out.println(s.concat(t));
        //Working with String builder
        StringBuilder s1 = new StringBuilder("Harsh");
        StringBuilder s2 = new StringBuilder("Farkiya");
        System.out.println(s1.append(s2));
        //Substring and split methods
        System.out.println(s.substring(2));
        //StringBuffer Class -- have many inbuilt mehtods to work with
        //StringBuilder, Same as StringBuffer but it is not synchronized 
        System.out.println(s1.capacity());
    }
}