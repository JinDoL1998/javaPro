package days16;


// [정규직] 사원클래스
public class Regular extends Employee{
	
	// [Object] 멤버들도 상속.
	// [Employee] 멤버들도 상속
	// 필드 - name, address, tel, hiredate
	// 생성자는 상속 x
	// 메서드 - dispEmployeeInfo, @toString()
	
	private int basePay;	// 기본급

	
	// 생성자
	public Regular() {
		super();	// 생성자에서 부모의 생성자를 호출할 때의 super 키워드
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String address, String tel, String hiredate, int basePay) {
		// The field Employee.name is not visible
		// this.name = name;
		super(name, address, tel, hiredate);
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");
		
	}
	
	// Getter Setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	@Override
	public void dispEmployeeInfo() {
		/*
		super.dispEmployeeInfo();
		System.out.printf(", 기본급:%d\n", this.basePay);
		*/
		
		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d\n", 
				this.getName(), this.getAddress(), this.getTel(), this.getHiredate(), this.basePay);
	}

	@Override
	public String toString() {
		return super.toString() + "Regular [basePay=" + basePay + "]";
	}
	
	// 급여 계산 메서드
	@Override
	public int getPay() {
		return this.basePay;	// 정규직 사원은 기본급만이 있을 뿐
	}
	
	
	
} // class
