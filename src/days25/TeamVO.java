package days25;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TeamVO {
	
	public TeamVO() {}
	
	private String name;
	private String leader;
	private int totalNumber;
	
}
