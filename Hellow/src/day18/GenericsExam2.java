package day18;

public class GenericsExam2 {

	public static void main(String[] args) {
		FruitBox<Fruti> fBox1 = new FruitBox<>();
		//FruitBox<String> fBox2 = new FruitBox<>();

	}

}
//과일클래스
class Fruti{}
//과일클래스를 상속 받은 사과클래스
class Apple extends Fruti{}
//과일박스 지네릭 클래스
//Eat란 인터페이스를 구현하고 Fruit클래스를 상속받은 클래스만
//타입변수 T로 올수있따
class FruitBox<T extends Fruti& Eat>{}

interface Eat{}
