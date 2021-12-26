import java.lang.Math;
import java.math.BigDecimal;
import java.lang.Number; 

class Complex<T extends BigDecimal>{
	
	private T real;
    private T imagine;
	
	public Complex(){

	}

	public Complex(T real, T imagine){
		this.real = real;
		this.imagine = imagine;
	}

    public void setReal(T real){
		this.real = real;
	}
	
    public void setImagine(T imagine){
		this.imagine = imagine;
	}
	
    T getReal(){
		return this.real;
	}
	
    T getImagine(){
		return this.imagine;
	}
	
    public Complex add(Complex comp){

		return new Complex(this.real.add(comp.real), this.imagine.add(comp.imagine));
	}
	
    public Complex sub(Complex comp){

		return new Complex(this.real.subtract(comp.real), this.imagine.subtract(comp.imagine));
	}
	
	// public Complex add(Complex comp){
		// ComplexNumbers tmp;
		// tmp.real = this.real + comp.real;
		// tmp.imagine = this.imagine + comp.imagine;

		// return tmp;
	// }
	
    // public Complex sub(Complex comp){
		// ComplexNumbers tmp;
		// tmp.real = this.real - comp.real;
		// tmp.imagine = this.imagine - comp.imagine;

		// return tmp;
	// }
	
    // public Complex mul(Complex comp){
		// ComplexNumbers tmp;
		// tmp.real = (this.real * comp.real) - (this.imagine * comp.imagine);
		// tmp.imagine = (this.imagine * comp.real) + (comp.imagine * this.real);

		// return tmp;
	// }
    // public Complex div(Complex comp){
		// ComplexNumbers tmp;
		// tmp.real = ((this.real * comp.real) + (this.imagine * comp.imagine)) / (pow(comp.real, 2) + pow(comp.imagine, 2));
		// tmp.imagine = ((this.imagine * comp.real) - (comp.imagine * this.real)) / (pow(comp.real, 2) + pow(comp.imagine, 2));

		// return tmp;
	// }
	
	// private Number addNumbers(Number a, Number b) {
		// if(a instanceof Double || b instanceof Double) 
			// return a.doubleValue() + b.doubleValue();
		// else if(a instanceof Float || b instanceof Float) 
			// return a.floatValue() + b.floatValue();
		// else if(a instanceof Long || b instanceof Long) 
			// return a.longValue() + b.longValue();
		// else 
			// return a.intValue() + b.intValue();
    // }
	/*
	public void printEquation(){
		if(this.imagine != 0){
			if(this.real != 0){
				if(this.imagine < 0){
					if (this.imagine == -1)"Draw Rectangle");
						System.out.println(this.real + " - i");
					else
						System.out.println(this.real + " - " + Math.abs(this.imagine) + "i");
				}
				else if(this.imagine > 0 && this.real != 0){
					if (this.imagine == 1)
						System.out.println(this.real + " + i");
					else
						System.out.println(this.real + " + " + this.imagine + "i");
				}
			}
			if(this.real == 0){
				if(this.imagine < 0){
					if (this.imagine == -1)
						System.out.println(" - i");
					else
						System.out.println(" - " + Math.abs(this.imagine) + "i");
				}
				else if(this.imagine > 0){
					if (this.imagine == 1)
						System.out.println("i");
					else
						System.out.println(this.imagine + "i");
				}
			}
		}
		else{
			if(this.real != 0)
			System.out.println(this.real);

			else if(this.real == 0)
			System.out.println(this.imagine);
		}
	}
	*/
}