
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***

//이번에는 다소 간단해보이지만, 매우 중요하고 유용한 자식 클래스를 생성할 차례이다

//부모에게로부터 상속을 받아서 자식이 편해지는.. 매우 부러운... 아니..

//코딩량을 줄여줄 수 있는 필수적인 방식! :)

***
```ruby

package school;

public class MyStudent extends Person {
	
	private String hakgwa;

	public MyStudent(String name, int no, String hakgwa) {
		this.hakgwa = hakgwa;
		setName(name);
		setNo(no);
	}

}//end class

```
***
//우선 MyStudent라는 이름으로 자식 클래스를 생성한다

//MyStudent 뒤의 extends가 부모 클래스를 지정해주게 된다

//위의 코드에서는 extends Person이기 때문에 부모 클래스가 Person이라는 뜻이 된다

//다음으로 직원에 관련된 자식 클래스를 MyEmp라는 이름으로 생성.. 하려 했는데..

***
```ruby

package school;

public class MyEmp {extends Person {
	
	public MyEmp(String name, int booseo, String sabun) {
		set.dept = dept;
		this.booseo = booseo;
		this.sabun = sabun;
		setName(name, booseo, sabun);
		
	}

	public void printInfo() {
		System.out.println(setname+","+setbooseo+","+setsabun);
		
	}

}//end class

```
***

//하다가 보니 빨간줄 투성이가 되고 여기저기가 뒤엉켜버렸다... 하..

//우선 오류를 해결하기 위해서

//전에 잘 실행되었던 MyStudent 클래스와 MyEmp를 대조하며 실수를 고쳐보려 한다..

//빨간줄이 여럿 그어진 모습을 보니 이름 그대로 EMP가 터져버린 느낌이다...

//먼저 해결해보고 진행 상황을 이어서 업로드 해야겠다..

***
