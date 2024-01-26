package days16;

// 영업직 사원 최종(마지막) 클래스
// final class - 자식클래스를 가질 수 없는 최종 클래스
public final class SalesMan extends Regular{
	
	// 필드 - name, address, tel, hiredate, basepay
	// 생성자 X
	// 메서드 - @dispEmployeeInfo(), @toString(), getPay()
	private int sales;		// 판매량
	private int commission;	// 커미션
	
	// 생성자
	public SalesMan() {			
		super();	// 부모(Regular) 클래스의 디폴트 생성자 호출
		System.out.println("> SalesMan 디폴트 생성자 호출됨");
	}

	public SalesMan(String name, String address, String tel, String hiredate, int basePay, int sales, int commission) {
		super(name, address, tel, hiredate, basePay);
		this.sales = sales;
		this.commission = commission;
		System.out.println("> SalesMan 7 생성자 호출됨");
	}

	@Override
	public void dispEmployeeInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d, 판매량:%d, 커미션:%d\n", 
				this.getName(), this.getAddress(), this.getTel(), this.getHiredate(), this.getBasePay(), this.sales, this.commission);
	}

	@Override
	public int getPay() {
		return super.getPay() + this.sales * this.commission;
	}
		
}

/*
// The type Child cannot subclass the final class SalesMan
class Child extends SalesMan{
	
}
*/
