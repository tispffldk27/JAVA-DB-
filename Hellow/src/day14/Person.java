package day14;

public class Person {
	//이름 ,나이 , 생일 ,성별 ,주소 , 국적
		private String name;
		private int age;
		private String birthDay;
		private String gender;
		private String address;
		private String nationality;
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getBirthDay() {
			return birthDay;
		}
		public String getGender() {
			return gender;
		}
		public String getAddress() {
			return address;
		}
		public String getNationality() {
			return nationality;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			if(age >=0)
			this.age = age;
			
		}
		public void setBirthDay(String birthDay) {
			//null 값이들어오거나 8자리이상이 들어온다면 return(재입력)
			if(birthDay  == null || birthDay.length() !=8)
				return;
			//yyy년도MM달dd일  
			String sMonth = birthDay.substring(4,6);    //substring은 부분문자열 추출로 4,5번지를 추출
			//문자열 12를 정수 12로 변경
			Integer month = Integer.parseInt(sMonth);	//Integer 정수형클래스다라고 기억
			if(month >=1 && month <=12 )
			
			this.birthDay = birthDay;
		}
		public void setGender(String gender) throws Exception {
			if(gender==null)
				throw new Exception("객체가 null 값입니다.");
			//equals는 입력받는 단어 
			if(gender != null &&(gender.equals("남자")||gender.equals("여자")))
			this.gender = gender;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
	
		public Person(){
			//이름 ,나이 , 생일 ,성별 ,주소 , 국적
			this("","","","남자","20000101",1);
		}
		public Person(Person p){
			this(p.name,p.address,p.nationality,p.gender,p.birthDay,p.age);
		}
		public Person(String name, String adress, String nationali, String gender, String birthDay, int age){
			this.name=name; this.address=address; 
			this.nationality=nationality;	this.age=age;
		try{
			setGender(gender);
		}catch(Exception e){
			this.gender="남자";
		}
			setBirthDay(birthDay);
		}
		
}
