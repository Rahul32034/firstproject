public class q1{

     public static void main(String []args){
        System.out.println("Hello World");
        String s1="24.50";
        String s2="67.9";
        //String s3;
        //s3=(String)s1+s2;
        
        Double i=Double.parseDouble(s1);
        Double j=Double.parseDouble(s2);
        Double s3=i*j;
        System.out.println(s3);
     }
}
