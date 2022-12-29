interface Shopping{
	static void first(){
		System.out.println("\t \t!!!!!! Welcome to Naveeen SuperMarket!!!!!");
		System.out.println();
		System.out.println("Your Product are Listed Below:");
	}
		void itemPurchase(String item[]);
}
class Glorary1{
			public static void main(String args[]){
				
				String p[] = {"Ghee->1kg","Cashew->100g","Badam->150g","Noodles->2pcks","Sunflower oil->1liter"};
				Shopping.first();
				Shopping n =(String item[])->{for(String x:item){System.out.println(x);}};
			      n.itemPurchase(p);
				  
				  System.out.println("Total Product is: " +String item[].length() );
			}
}
		