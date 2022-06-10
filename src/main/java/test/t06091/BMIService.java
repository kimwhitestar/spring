package test.t06091;

public class BMIService {
	private BMICalcVO bMICalcVO;
	
	private void BMIService(BMICalcVO bMICalcVO) {
		this.bMICalcVO = bMICalcVO;
	}
	
	public void calculator() {
		PersonVO vo = new PersonVO();
		vo.setName("홍길동");
		vo.setHeight(160);
		vo.setWeight(80);
		bMICalcVO.bmiCalculator(vo);
	}
}
