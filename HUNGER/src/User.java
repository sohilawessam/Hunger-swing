
public class User {
   static int total=0;
   static String firstName ="";
   static String LastName ="";
   static CartItem[] cartItems ;
   public void calc_Total() {
	   int totalPrice=0;
	   for (int i=0;i<cartItems.length;i++)
	   {
		   totalPrice+=cartItems[i].price;
	   }
	   total=totalPrice;
   }
   public void add_cart_item() {
	   
   }
}
class CartItem{
	int price;
	String Name;
	int quantaty;
}
