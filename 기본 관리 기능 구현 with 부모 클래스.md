
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***

//학교 정보를 관리할 때 당연히 학생들의 정보만 있는 것은 아닐 것이다

//따라서 다음과 같이 직원들의 정보를 관리할 수 있는 클래스도 함께 생성했다

***
```ruby

package school;

public class Emp {
	private String name, booseo;
	private int sabun;

	public Emp() {
	}

	public Emp(String name, String booseo, int sabun) {
		super();
		this.name = name;
		this.booseo = booseo;
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBooseo() {
		return booseo;
	}

	public void setBooseo(String booseo) {
		this.booseo = booseo;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	
	
	public void printInfo() {
	
		System.out.println(name+","+booseo+","+sabun);
	}
	
}//end class

```
***

//employee의 약자 Emp로 클래스 이름을 구성했는데

//이것은 당연히 전자기 펄스를 뜻하는 EMP(electromagnetic pulse)와 다르다..

***

//다음으로 상속의 개념을 공부할 수 있는 Person 클래스를 생성했다

//직접 사용할 일은 없지만 코딩량을 줄여주는 용도로서 매우 유용하고 필수적인 기능이다

//구성은 다음과 같다

***
```ruby

package school;

public class Person { //역할 : 학생과 직원의 공통변수를 정의하는 용도
					 
	private String name;
	private int no;

	public Person(String name, int no) {
		this.name = name;
		this.no = no;
		
	
	}
	//기본생성자 메서드
	public Person() {
	}
	// getter/setter 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
	public void printInfo() {
		System.out.println(name+","+no);
	}
}//end class

```
***

//다른 클래스들에게 부모 역할을 해줄 Person 클래스는

//학생들과 직원들 사이의 공통적인 정보를 묶어서 관리하기 위해 만들었다

//서로 상이한 정보는 별도로 입력해서 관리를 용이하게 하며 코딩량을 줄일 수 있을 것이다

//이 코드와 연결되는 자식 클래스는 다른 문서에 이어서 기록해야겠다

***
