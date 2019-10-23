package ejercico1;

public class Numero implements IOperacion {
	private Integer numeroEntero;
	private Double numeroComplejo;
	
	public Numero(int numero) {
		this.numeroEntero=numero;
		this.numeroComplejo=null;
	}
	
	public Numero(double numero) {
		this.numeroComplejo=numero;
		this.numeroEntero=null;
	}

	
	
	public void setNumeroEntero(Integer numeroEntero) {
		this.numeroEntero = numeroEntero;
		this.numeroComplejo=null;
	}

	public void setNumeroComplejo(Double numeroComplejo) {
		this.numeroComplejo = numeroComplejo;
		this.numeroEntero=null;
	}

	public Integer getEntero(){
		return this.numeroEntero;
	}
	
	public Double getDouble(){
		return this.numeroComplejo;
	}
	
	

	@Override
	public void suma(Numero numero) {
		// TODO Auto-gene0thisrated method stub
		if (this.numeroEntero!= null) {
			if (numero.getEntero() != null) {
				this.numeroEntero=this.numeroEntero+numero.getEntero();
			}else {
				System.out.println("Como se realiza la suma con un numero entero, tomamos solo la parte entera!!");
				this.numeroEntero=this.numeroEntero+ numero.getDouble().intValue();
			}
		}else {
			if (numero.getDouble()!= null) {
				this.numeroComplejo=this.numeroComplejo+numero.getDouble();
			}else {
				System.out.println("Como se realiza la suma con un numero real, el resultado es real!!");
				this.numeroComplejo=this.numeroComplejo+ numero.getEntero().doubleValue();
			}
		}
		
	}

	
	@Override
	public void resta(Numero numero) {
		// TODO Auto-generated method stub
		if (this.numeroEntero!= null) {
			if (numero.getEntero() != null) {
				this.numeroEntero=this.numeroEntero-numero.getEntero();
			}else {
				System.out.println("Como se realiza la suma con un numero entero, tomamos solo la parte entera!!");
				this.numeroEntero=this.numeroEntero- numero.getDouble().intValue();
			}
		}else {
			if (numero.getDouble()!= null) {
				this.numeroComplejo=this.numeroComplejo-numero.getDouble();
			}else {
				System.out.println("Como se realiza la suma con un numero real, el resultado es real!!");
				this.numeroComplejo=this.numeroComplejo- numero.getEntero().doubleValue();
			}
		}	}

	
	@Override
	public void multiplicacion(Numero numero) {
		// TODO Auto-generated method stub
		if (this.numeroEntero!= null) {
			if (numero.getEntero() != null) {
				this.numeroEntero=this.numeroEntero*numero.getEntero();
			}else {
				System.out.println("Como se realiza la suma con un numero entero, tomamos solo la parte entera!!");
				this.numeroEntero=this.numeroEntero*numero.getDouble().intValue();
			}
		}else {
			if (numero.getDouble()!= null) {
				this.numeroComplejo=this.numeroComplejo*numero.getDouble();
			}else {
				System.out.println("Como se realiza la suma con un numero real, el resultado es real!!");
				this.numeroComplejo=this.numeroComplejo* numero.getEntero().doubleValue();
			}
		}
	}
	
	
}
