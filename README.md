# LearnerPS.github.io

//오늘은 Github에 처음으로 글을 쓴다

//아직은 Github란 플랫폼이 낮설고, 쉽지 않은 것이 사실이다

//하지만 교육 받은지 1주일 밖에 되지 않은 사람이 갑자기 잘하는 것도 말이 되지 않기 때문에
//어찌 됐든 열심히, 최선을 다해서 공부해보려 한다

//다른 이들이 포스팅 해놓은 것처럼 화려한 언변과 훌륭한 편집은 없다

//나는 다소 투박하더라도 나의 성장에 실질적 양분이 되는 내용들을 적어 나가려고 하고,
//또 내가 날마다 배운 부분들을 노트하고, 시행착오를 겪으며 해결해나가는 과정을 있는 그대로 기록하려한다

//내가 포기 할 때까진 아직 끝난 게 아니다

=======================================

//먼저 오늘 만든 코드이다

package school;

public class TestSchool {

	public static void main(String[] args) {
		//학교정보 관리기능 구현
		//학생: 이름, 주민번호, 전번, 주소, 이메일, 학번, 학과
		//직원: 이름, 주민번호, 전번, 주소, 이메일, 사번, 부서
		//교수: 이름, 주민번호, 전번, 주소, 이메일, 교번, 연구실주소
		Student s1 = new Student("홍길동", "컴공", 1112);
		Student s2 = new Student("홍길동", 1112, "컴공");
		Student s3 = new Student(1112, "홍길동", "컴공");
		
		Emp e1 = new Emp("김대리", "총무부", 9011);
		e1.printInfo();
		
		Person p1 = new Person("김길동", 1113); //이름, 번호
		
		MyStudent ms1 = new MyStudent("김길동", 1113, "컴공"); //학생 = Person+학과
		ms1.printInfo();
		
		MyEmp me1 = new MyEmp("박대리", 9011, "총무부"); //직원 = Person+부서
		me1.printInfo(); // 박대리, 9011, 총무부
		
		
	}//end main

}//end class

//학교 관련 정보를 입력하고 관리하는 기능을 만들었다

//그리고 여기에 관련된 Student 클래스는 다음과 같다

package school;
/** 학생 정보를 정의하는 클래스, VO, DTO */
public class Student {
	private String name, hakgwa;
	private int hakbun;
	
	//생성자 메서드
	// 기본 생성자 메서드
	public Student() {
	}
	// 모든 변수를 받는 생성자 메서드
	public Student(String name, String hakgwa, int hakbun) {
		super();
		this.name = name;
		this.hakgwa = hakgwa;
		this.hakbun = hakbun;
	}
	
	public Student(String name, int hakbun, String hakgwa) {
		this(name, hakgwa, hakbun);
	}
	
	public Student(int hakbun, String name, String hakgwa) {
		this(name, hakgwa, hakbun);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakgwa() {
		return hakgwa;
	}
	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	// 가지고 있는 모든 변수의 값을 출력
	public void printInfo() {
		System.out.println(name+","+hakbun+","+hakgwa);
	}
}

//기본 생성자 메서드와 모든 변수를 받을 수 있는 생성자 메서드를 먼저 생성했고,

//그리고 private String name, hakgwa;
//private int hakbun; 과 같이 private로 생성된 정보를 호출하기 위해
//getter/setter 기능을 사용해 호출 루트를 확보했다

//그리고 마지막에 printInfo를 통해 정보들이 출력 되도록 설정했는데
//Test 클래스를 보면 Person, MyStudent, MyEmp 까지 생성되어 있지만
//한번에 다 설명하면 너무 길어질 것 같아서 일단 여기까지 기록하고
//또다른 파일에서 이어서 기록해두려고 한다
