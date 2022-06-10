package test.t06091;

public class BMICalcVO implements Diet {
	private double weight;
	private double normal;
	private double heivy;
	private PersonVO personVO;

	public BMICalcVO(double weight, double normal, double heivy) {
		this.weight = weight;
		this.normal = normal;
		this.heivy = heivy;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getHeivy() {
		return heivy;
	}
	public void setHeivy(double heivy) {
		this.heivy = heivy;
	}
	
	public PersonVO getPersonVO() {
		return personVO;
	}
	public void setBmiCalcVO(PersonVO personVO) {
		this.personVO = personVO;
	}

	public void bmiCalculator(String name, double height, double weight) {
		double h = height / 100;
		double result = weight / (h * h);
		System.out.println(name + "의 BMI 지수 : " + (int) result);
		
		if (result > normal) {
			if (result > heivy) {
				System.out.println("비만");
			}	else {
				System.out.println("정상");
			}
		} else if (result < normal) {
			if (result < weight) {
				System.out.println("약골");
			} else {
				System.out.println("정상");
			}
		}
	}
	public void bmiCalculator(PersonVO vo) {
		double h = vo.getHeight() / 100;
		double result = weight / (h * h);
		System.out.println(vo.getName() + "의 BMI 지수 : " + (int) result);
		
		if (result > normal) {
			if (result > heivy) {
				System.out.println("비만");
			}	else {
				System.out.println("정상");
			}
		} else if (result < normal) {
			if (result < weight) {
				System.out.println("약골");
			} else {
				System.out.println("정상");
			}
		}
	}
}
