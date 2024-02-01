package days24;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// Value Object == 값을 저장할 용도의 객체
@Data
@AllArgsConstructor
@Builder
public class MemberVO {

	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String position;	// 팀장, 팀원
	

}
