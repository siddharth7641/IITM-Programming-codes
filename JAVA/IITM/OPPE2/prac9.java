/*
Write a Java program that, given a list of cricket players, eliminates the players who have
not yet scored a century, and prints the names of remaining players and the total number of
centuries each has scored.
Class Player has the following members:
b" String name, String year and int nCenturies as private instance variables
b" Constructor and accessor methods
Class StreamTest has the following members:

b" Method getBatsmenCenturies(ArrayList<Player> pList) that eliminates the play-
ers who have not yet scored a century and collects the result to a map.

b" main method that does the following:
b Accepts the name, year, and number of centuries of a fixed number of players,
invokes method getBatsmenCenturies, and prints the filtered list.

What you have to do
b" Define method getBatsmenCenturies(ArrayList<Player> pList) in class StreamTest
*/

import java.util.*;
import java.util.stream.Collectors;
class Player {
	private String name;
	private String year;
	private int nCenturies;
	public Player(String name, String year, int nCenturies) {
		this.name = name;
		this.year = year;


		this.nCenturies = nCenturies;
	}
	public String getName() {
		return name;
	}
	public int getnCenturies() {
		return nCenturies;
	}
}
public class prac9 {
	public static Map<String,Integer> getBatsmenCenturies(ArrayList<Player> pList) {
		TreeMap<String,Integer> rmap;
		Map<String,Integer> map;
//****** Collect the pList to map
		map = pList.stream()
			.filter(
				p -> p.getnCenturies()!=0
			)
			.collect(Collectors.toMap(
				Player::getName,
				Player :: getnCenturies,
				(o,n)-> o+n
			)
		);
		rmap = new TreeMap<String, Integer>(map);
		return rmap;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> list = new ArrayList<Player>();
		for (int i = 0; i < 6; i++)
			list.add(new Player(sc.next(), sc.next(), sc.nextInt()));
		System.out.println(getBatsmenCenturies(list));
	}
}