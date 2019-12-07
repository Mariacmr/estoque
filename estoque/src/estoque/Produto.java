package estoque;

import java.math.BigDecimal;
import java.util.Calendar;

public class Produto {

	private long id;
	private BigDecimal preco;
	private Calendar data_val;
	private String descricao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Calendar getData_val() {
		return data_val;
	}
	public void setData_val(Calendar data_val) {
		this.data_val = data_val;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
