/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a6q5 {static double circleArea(int radius)
    {
    double area = Math.PI*(radius*radius);
    return area;
    }
    
    public static void examGrade(int percentage)
    {
    
        if(percentage<50)
    {
            System.out.println("F");
    }else if(percentage>49 && percentage<60){
            System.out.println("D");
    }else if(percentage>59 && percentage<70){
            System.out.println("C");
    }else if(percentage>69 && percentage<80){
            System.out.println("B");
    }else{
            System.out.println("A");
    }
     }
    
    public static void factors(int number){
    int i;
    for(i=1;i<=number;i++){
    if(number%i==0){
        System.out.println(i);
    }    
  }
    }
    
    static double compoundInterest(double principal, double interest, int years)
    {
    double Balance = principal*(Math.pow(1+interest,years));
    Balance = Math.round(Balance * 100.0) / 100.0;
    return Balance;
    }
    
    public static void chaotic(int lines){
    int i;
    int n;
    int randNum;
    int num;
    String x;
    for(i=1;i<=lines;i++)
    {
    randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
    
    x = "";
    while(randNum>0){
    x += "*";
    randNum--;
    }
    
        
        System.out.println(x);    
        
    }
    }
    
    
    static double lastInt(int x){
   int y = x%10;
   if (y<0)
           {
            y = y * -1;   
           }
    return y;
    }
    
    static double firstInt(int x){
   
       int n = 0;
       int y = x;
       
       while(y>0){
       n++;
       y = y/10;
       
       }
       n = n-1;
       
       while(n>0){
       x = x/10;
       n--;
       }
       
       return x;
    }
   
    
    static String season(int month, int day ){
    String winter = "Winter";
    String summer = "summerr";
    String fall = "fall";
    String spring = "spring";
    String str = "";
    
    if(month==12 || month<3){
    str = winter;   
    }
    
    else if(month>3 || month<6){
    str = spring;   
    }    
    
    else if(month>6 || month<9){
    str = summer;   
    }    
    
    else if(month>9 || month<12){
    str = fall;   
    }    
    
    if(month==12){
     if(day>=16){
     str = winter;   
     }else{
     str = fall;    
    }
    }
        
    if(month==3){
    if(day<=15){
    str = winter;   
    }else{
    str = spring;    
    }
    }   
        
    if(month==6){
    if(day<=15){
    str = spring;   
    }else{
    str = summer;    
    }
    }  
    
    if(month==9){
    if(day<=15){
    str = summer;   
    }else{
    str = fall;    
    }
    }  
    
    
   return str;
    }
        
    
    
    public static String allDigitsOdd(int number){
    String str = "" + number;
    String r = "";
    if (str.contains("2") || str.contains("4") || str.contains("6") || str.contains("8")){
      r = "false";  
    }else{
      r = "true";  
    }
    
    return r;
    }
    
    
    public static String sameDashes(String line1 , String line2){
    String r = "";
    int length1 = line1.length();
    int length2 = line2.length();
    int length = 0;
    
    if(length1>length2){
     length = length2;   
    }else{
        length=length1;
    }


    int i = 0;
    String test = "";
    for(i=0;i<length;i++){
        if(line1.charAt(i) == '-' && line2.charAt(i) == '-') {   
            test += "a";
        }else if(line1.charAt(i) == '-' && line2.charAt(i) != '-' ){
            test += "b"; 
        }else if(line2.charAt(i) == '-' && line1.charAt(i) != '-' ){
            test += "b" ; 
        }
        
     }
   int lengthtest = test.length();
   int n = 0; 
    for(i=0;i<lengthtest;i++){
    if(test.charAt(i)=='a') {
     n++;   
    }   
        
    }
    if(n==lengthtest){
        r = "true";
    }else if(n!=lengthtest){
        r = "false";
    }
    
    return r;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      String r = sameDashes("-bbck-mk","-abc-");
        System.out.println(r);
        
        
    }
}
    
    static void chaotic (int asterik){
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
