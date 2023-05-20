import java.util.ArrayList;
import java.util.List;

public class User {
   static double total=0;
   static String firstName ="";
   static String lastName ="";
   static String invoice ="";
   static List<CartItem> cartItems =new ArrayList() ;
   public static void calc_total() {
	   int totalPrice=0;
	   for (int i=0;i<cartItems.size();i++)
	   {
		   totalPrice+=cartItems.get(i).price;
	   }
	   total=totalPrice;
   }
   public static void create_invoice() {
	   for(int i=0;i<User.cartItems.size();i++)
	   {
		   invoice+= User.cartItems.get(i).name+"   x"+User.cartItems.get(i).quantaty+"\n";
	   }
   }
}

