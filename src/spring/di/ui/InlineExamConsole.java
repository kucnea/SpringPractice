package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	@Autowired
	@Qualifier("exam1")
	private Exam exam;
	
	
	public InlineExamConsole() {
		System.out.println("생성자");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("오버로드 생성자");
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());

	}


//	@Autowired
//	@Qualifier("exam1")
	@Override
	public void setExam(Exam exam) {
		System.out.println("세터");
		this.exam = exam;
		
	}

}
