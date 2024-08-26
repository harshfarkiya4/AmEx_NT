package exceptions;
class ExceptionHandling{
    static void age_checker(int age) throws CustomException{
        if(age<18){
            throw new CustomException("Age must be greater then 18");
        }
        else{
            
        }
    }
    public static void main(String args[]) throws CustomException{
        int age = 10;
        try{
            age_checker(age);
            System.out.println("Here we are!!!");
        }
        catch(CustomException e){
            System.out.println(e);
        }
    }
}