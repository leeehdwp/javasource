package ch1;

public class VarcharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한개 => 'a', '미 ' ' '
        // 문자열 : 글자 한개 ~ 여러개 => "미","a","abc","대한민국"," " 
        // ch1의 값을 unicode 변수에 대입
       
       
       
         char ch1 = '기';
         int unicode = ch1;
         System.out.println("ch1 = "+ch1);
         System.out.println("unicode = "+unicode);  
      
         char ch2 = 'a';
         unicode = ch2;
         System.out.println("ch2 = "+ch2);
         System.out.println("unicode = "+unicode);
  }
}       