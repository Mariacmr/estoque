package estoque;

public class Venda {
	
	private long id;
	private Produto pid;
	private Funcionario fid;
	private int quantProd;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Produto getPid() {
		return pid;
	}
	public void setPid(Produto pid) {
		this.pid = pid;
	}
	public Funcionario getFid() {
		return fid;
	}
	public void setFid(Funcionario fid) {
		this.fid = fid;
	}
	public int getQuantProd() {
		return quantProd;
	}
	public void setQuantProd(int quantProd) {
		this.quantProd = quantProd;
	}
	
	
	

}
