package test.t06091;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BMIRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/bmiBeans.xml");
		PersonVO pVo1 = (PersonVO) ctx.getBean("pVo1");
		pVo1.personPrint();
		PersonVO pVo2 = (PersonVO) ctx.getBean("pVo2");
		pVo2.personPrint();
		
		//BMICalcVO bmiCalcVO = (BMICalcVO) ctx.getBean("bmiCalcVO");
		Diet bmiCalcVO = (Diet) ctx.getBean("bmiCalcVO");
		bmiCalcVO.bmiCalculator(pVo1);
		bmiCalcVO.bmiCalculator(pVo2);
		
		BMIService bMIService = (BMIService) ctx.getBean("bMIService");
		bMIService.calculator();
	}
}