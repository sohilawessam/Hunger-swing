import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Globals {
	static Item itemb1= new Item("Big Mac",80,11,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Bigmac.png",31,604);
	static Item itemb2= new Item("Big Tasty",100,12,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Big-tasty-Beef.png",47,854);
	static Item itemb3= new Item("Cheese Burger",40,13,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\CheeseBurger.png",18,340);
	static Item itemb4= new Item("Chicken Fillet",50,14,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Chicken-Fillet.png",21,467);
	static Item itemb5= new Item("Chicken Mac",80,15,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Chicken-Mac.png",19,511);
	static Item itemb6= new Item("Chicken Macdo",60,16,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Chicken-MACDO.png",14,350);
	static Item itemb7= new Item("Fillet Fish",45,17,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Filet-O-Fish.png",20,401);
	static Item itemb8= new Item("Littel Tasty",40,18,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Little-tasty.png",26,467);
	static Item itemb9= new Item("McRoyal",70,19,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\McRoyal.png",41,786);
	   
	public static Item[] burgerItems = {itemb1,itemb2,itemb3,itemb4,itemb5,itemb6,itemb7,itemb8,itemb9};
	
	static Item items1= new Item("Sunday",25,21,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Chocolate.png",7,303);
	static Item items2= new Item("Cookie",10,22,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Chocolate-cookie.png",2,122);
	static Item items3= new Item("Chocolate cake",20,23,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Chocolate-Fudge.png",1,100);
	static Item items4= new Item("PanCake",30,24,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\PanCakes.png",1,70);
	static Item items5= new Item("Red Velvet",20,25,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Red-Velvet.png",1,91);
	
	public static Item[] sweetsItems = {items1,items2,items3,items4,items5};
	
	static Item itemd1= new Item("Coca-Cola",20,31,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\coca-cola.png",0,150);
	static Item itemd2= new Item("Sprite",20,32,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Sprite.png",0,120);
	static Item itemd3= new Item("Fanta",20,33,"C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Fanta.png",0,63);
	
	public static Item[] drinksItems = {itemd1,itemd2,itemd3};
	
	public static Item[] listItems = Globals.burgerItems;
	
	public static Map<String,Double> coupons= Collections.singletonMap("off20", 20.0);
	
	
}
