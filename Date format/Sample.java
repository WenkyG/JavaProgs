import java.util.*;
import java.text.*;
class Sample {
   public static void main(String[] args)  {
      Scanner in = new Scanner(System.in);
      String time = in.nextLine();
      SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
      SimpleDateFormat parseF = new SimpleDateFormat("HH:mm:ss");
      Date date = null;
      try {
         date = parseFormat.parse(time);
      }catch (ParseException e) {
       e.printStackTrace();
      }
      System.out.println(parseF.format(date));    
   }
}