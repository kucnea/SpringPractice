package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	@Autowired
	@Qualifier("exam1")
	private Exam exam;
	
	
	public InlineExamConsole() {
		System.out.println("������");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("�����ε� ������");
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
		System.out.println("����");
		this.exam = exam;
		
	}

}
