package recon.model;
import javax.persistence.*;

@Entity
@Table(name = "receitas")
public class Receita {

	  @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @Column
	  private String nome;
	  
	  @Column
	  private String dificuldade;
	  
	  @Column
	  private int nota;
	  
	  @Column
	  private String link;
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int i) {
		this.nota = i;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	 
}
