package day19t;
							//학교정보 
public class Std {
	
	private String aa="";	//이름
	private String bb="";	//학번
	
	private String cc="";	//학과
	private String dd="";	//전공
	private double ee=0.0;	//학점
	
	
	public String getAa() {
		return aa;
	}
	public String getBb() {
		return bb;
	}
	public String getCc() {
		return cc;
	}
	public String getDd() {
		return dd;
	}
	public double getEe() {
		return ee;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	public void setBb(String bb) {
		this.bb = bb;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}
	public void setEe(double ee) {
		if(ee > 4.5 || ee <0)
			return;
		this.ee = ee;
	}
	@Override
	public String toString() {
		return "Std [이름=" + aa + ", 학번=" + bb + ", 학과=" + cc + ", 전공=" + dd + ", 학점=" + ee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bb == null) ? 0 : bb.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (bb == null) {
			if (other.bb != null)
				return false;
		} else if (!bb.equals(other.bb))
			return false;
		return true;
	}
	
	
	public Std(){}  //생성자
	public Std(Std s){ //복사생성자
		
		this(s.aa,s.bb,s.cc,s.dd,s.ee);
	}
	public Std(String aa, String bb,String cc, String dd, double ee){  //오버로딩
		
		this.aa=aa;
		this.bb=bb;
		this.cc=cc;
		this.dd=dd;
		this.ee=ee;
				
	}
	
	
	
	
	
}
