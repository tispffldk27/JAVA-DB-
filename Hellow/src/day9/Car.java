package day9;

public class Car { 				//자동차 전체라고 생각하면됨
		
		//1.맴버 변수를 설정 => 필요한 부품,요소
	/* 속도
    시동
    기어
    전방등
    후방등
   와이퍼 속도
*/	
	
	
		private int speed;							//속도
		private boolean power;						//시동
		private char gear;							//기어
		private boolean frontLight;					//전방등
		private boolean backLight;					//후방등
		private int wiperSpeed;						//와이퍼 속도
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public boolean isPower() {
			return power;
		}
		public void setPower(boolean power) {
			this.power = power;
		}
		public char getGear() {
			return gear;
		}
		public void setGear(char gear) {
			this.gear = gear;
		}
		public boolean isFrontLight() {
			return frontLight;
		}
		public void setFrontLight(boolean frontLight) {
			this.frontLight = frontLight;
		}
		public boolean isBackLight() {
			return backLight;
		}
		public void setBackLight(boolean backLight) {
			this.backLight = backLight;
		}
		public int getWiperSpeed() {
			return wiperSpeed;
		}
		public void setWiperSpeed(int wiperSpeed) {
			this.wiperSpeed = wiperSpeed;
		}
		
		
		
		
			
		//2. 생성자를 생성=> 멤버 변수 초기화
		/*  속도= 0, 시동 = off , 기어 = 파킹       전방,후방등=off
		   	와이퍼속도 =0
		*/
		public Car(){
			this.power = false;
			this.speed = 0;
			this.gear = 'P';
			this.frontLight = false;
			this.backLight = false;
			this.wiperSpeed=0;
			
		}
		
	
		
	    //3. 멤버 메소드를 생성 및 구현 => 필요한 기능
		
		public void turnOn(){
			this.power=true;
		}
		public void turnOff(){
			if(speed ==0)			
			this.power=false;
		}
		public void accCar(){					
			if(power && (gear == 'D'|| gear== 'd')){		//파워가 사실이면 D랑 d가 눌리면 속도증가
				speed++;
			}
		}
		public void breakCar(){								//파워가 트루면 D랑 d가 눌리면서 속도감소
			if(power && (gear == 'D'|| gear== 'd')){
				speed--;
			}
		}
		
		public void turnFrontLight(){
			frontLight = !frontLight;
		}
		public void turnBackLight(){
			backLight = !backLight;
		}
		public void printCar(){
			System.out.println("--------------------------------");
			if(power)		System.out.println("시동이 켜져(on)있습니다.");
			else  			System.out.println("시동이 꺼져(off)있습니다.");
			
			System.out.println("속도 :  "+speed);
			switch(gear){
			case 'P' : System.out.println("기어 : P");  break;
			case 'D' : System.out.println("기어 : D");  break;
			case 'N' : System.out.println("기어 : N");  break;
			case 'R' : System.out.println("기어 : R");  break;
			}
			if(frontLight)  System.out.println("전방등이 켜져있습니다 . on");
			else			System.out.println("전방등이 꺼져있습니다 . off");
		
			if(backLight)  	System.out.println("후방등이 켜져있습니다 . on");
			else			System.out.println("후방등이 꺼져있습니다 . off");
		
			switch(wiperSpeed){
			case 0: System.out.println("와이퍼: 정지 "); break;
			case 1: System.out.println("와이퍼: 천천히 "); break;
			case 2: System.out.println("와이퍼: 보통 "); break;
			case 3: System.out.println("와이퍼: 빠르게 "); break;
			}
			System.out.println("--------------------------------");	
		}
		
		
		/* 		시동 on /off
		    	엑셀on  /브레이크 on
		  		전방등 on /  off
		  		와이퍼 제어
		 */
}
