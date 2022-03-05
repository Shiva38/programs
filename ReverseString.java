package capOnString;


class ReverseString  {
    public static void main (String[] args) {
       
        String str= "JAVA", rstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("JAVA"); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        rstr= ch+rstr;
      }
      System.out.println("Reversed word: "+ rstr);
    }
}
