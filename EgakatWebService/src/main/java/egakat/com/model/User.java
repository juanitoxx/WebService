package egakat.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS", schema = "EGAKATLOCALTEL")
public class User implements Serializable {

	private static final long serialVersionUID = -7675672871801127430L;
	@Id
	@Column(name = "ID_US")
	private Integer idUser;
	@Column(name = "US_NAM")
	private String userName;
	@Column(name = "PAS_US")
	private String password;
}
