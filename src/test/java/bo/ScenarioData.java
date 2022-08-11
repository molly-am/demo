package bo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScenarioData implements Serializable {

	private boolean onlyForManager;
	private String firstName;
	private String login;
	private String lastName;
	private String paymentType;

}
