package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class program {

	public static void main(String[] args) {
		
		/*
		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole(exam);
//		ExamConsole console = new GridExamConsole(exam);
		ExamConsole console = new InlineExamConsole();
		console.setExam(exam);
		console.print();
		*/
//		스프링에게 지시하는 방법으로 코드를 변경
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		Exam exam = (Exam) context.getBean("exam");
//		System.out.println(exam.toString());
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = (ExamConsole) context.getBean(ExamConsole.class);
		
		console.print();
		System.out.println("=====");
		
//		Exam oExam = (Exam) context.getBean("oExam");
		ExamConsole oConsole = (ExamConsole) context.getBean("oConsole");
		oConsole.print();
		System.out.println("==last test==");
		System.out.println();
		
		
//		List<Exam> exams = new ArrayList<>();
		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));
		
		for(Exam e : exams) {
			System.out.println(e);
		}
	}

}
 