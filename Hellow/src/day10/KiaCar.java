package day10;

import day9.Car;

public class KiaCar extends Car{
	public final static String bran = "KIA";
	public KiaCar(){
		//speed= 1;  //접근 불가=> 부모에서 접근 제한자가 private이기 때문에
		setSpeed(0);
	}
	
}
