import java.math.BigDecimal;

class Test{
	public static void main(String args[]){
		Complex<BigDecimal> comp = new Complex<BigDecimal>(new BigDecimal(5.2),new BigDecimal(4.3));
		Complex<BigDecimal> comp2 = new Complex<BigDecimal>(new BigDecimal(7.10),new BigDecimal(5.7));
		Complex<BigDecimal> result = new Complex<BigDecimal>();
		Complex<BigDecimal> result2 = new Complex<BigDecimal>();
	
		result = comp.add(comp2);
		System.out.println("============Addition==================");
		System.out.println("The real part = " + result.getReal());
		System.out.println("The imagine part = " + result.getImagine());
		
		result2 = comp.sub(comp2);
		System.out.println("============Subtraction==================");
		System.out.println("The real part = " + result2.getReal());
		System.out.println("The imagine part = " + result2.getImagine());
	}
}