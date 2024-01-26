package days16;

// 임시직 사원 클래스
public class Temp extends Employee{
	
	// 필드 - name, address, tel, hiredate, basepay
	// 생성자 X
	// 메서드 - dispEmployeeInfo(), @toString(), getter, setter
	private int workDays;		// 근무 일수
	private int payOfDay;		// 하루 일당
	
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨");
	}

	public Temp(String name, String address, String tel, String hiredate, int workDays, int payOfDay) {
		super(name, address, tel, hiredate);
		this.workDays = workDays;
		this.payOfDay = payOfDay;
		System.out.println("> Temp 6 생성자 호출됨");
	}
	
	@Override
	public int getPay() {
		return this.workDays * this.payOfDay;
	}

	@Override
	public void dispEmployeeInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 근무일수:%d, 하루일당:%d\n", 
				this.getName(), this.getAddress(), this.getTel(), this.getHiredate(), this.workDays, this.payOfDay);
	}
	
	
	
}
