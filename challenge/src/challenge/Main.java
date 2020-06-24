package challenge;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		//ArrayChallenges.reverse(5);
		//ArrayChallenges.resizeArray(); //it changes the size of an array
		//ArrayListChallenges.readElements();
		//ArrayList<String> groceryList = new ArrayList<String>( );		//create an object of arraylist

		//Autoboxing(creating/converting an int, a base primitive type, in to an Integer)   and Unboxing( take a value from wrapper/class and convert it to primitiv type)
		//ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		//intClassArrayList.add(new IntClass(54));
		
		/*we use wrappers(class of primitive types)  for this purppose */ 
		//ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		//for (int i=0; i<5; i++) {
		//	intArrayList.add(Integer.valueOf(i)*2);
		//}
		//for (int i=0; i<5; i++) {
			//System.out.println( i + "----->" + intArrayList.get(i).intValue());
		//}

		/*LinkedList */
		//LinkedListDemo.Demo();
		
		/*InnerClass */
		//InnerClassLearnGearbox mcLaren = new InnerClassLearnGearbox(6);
		//InnerClassLearnGearbox.Gear first = mcLaren.new Gear(1, 12.3); //Correct way to create the outer class when inner class is public
		/* 		InnerClassLearnGearbox.Gear second = new cLaren.new Gear(1, 12.3); 	//FALSe
		 *  	InnerClassLearnGearbox.Gear third = new mcLaren.Gear(3, 12.3);	//FALSE
		 */
		//System.out.println(first.driveSpeed(1000));
		/*
		mcLaren.addGear(1, 5.3);
		mcLaren.addGear(2, 10.6);
		mcLaren.addGear(3, 15.9);
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));
		*/
		/*END OF InnerClass */

		/*Generics */
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("<<Adelaide Crows>>");
		adelaideCrows.addPlayer(joe);
		//adelaideCrows.addPlayer(pat); ==> gives error, pat is not a football player
 		
		System.out.println("\nnumber of adelaideCrows' players : "+adelaideCrows.numPlayers());
		
		Team<BaseballPlayer> adelaideCrows2 = new Team<>("<<Adelaide Crows_2>>");
		adelaideCrows2.addPlayer(pat);
		
		Team<SoccerPlayer> adelaideCrows3 = new Team<>("<<Adelaide Crows_3>>");
		adelaideCrows3.addPlayer(beckham);
		/*END OF Generics */

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
