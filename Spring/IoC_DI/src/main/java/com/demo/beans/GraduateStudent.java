package com.demo.beans;

import java.time.LocalDate;

// Graduate student is a student
public class GraduateStudent extends Student {
	private LocalDate thesisstdate;
	private String thesistopic;
	private LocalDate thesisenddate;

	public GraduateStudent() {
		super();
	}

	public GraduateStudent(LocalDate thesisstdate, String thesistopic, LocalDate thesisenddate) {
		super();
		this.thesisstdate = thesisstdate;
		this.thesistopic = thesistopic;
		this.thesisenddate = thesisenddate;
	}

	public GraduateStudent(int sid, String sname, int sage, Course cse, LocalDate thesisstdate, String thesistopic,
			LocalDate thesisenddate) {
		super(sid, sname, sage, cse);
		this.thesisstdate = thesisstdate;
		this.thesistopic = thesistopic;
		this.thesisenddate = thesisenddate;
	}

	public GraduateStudent(int sid, String sname, int sage, LocalDate thesisstdate, String thesistopic,
			LocalDate thesisenddate) {
		super(sid, sname, sage);
		this.thesisstdate = thesisstdate;
		this.thesistopic = thesistopic;
		this.thesisenddate = thesisenddate;
	}

	public LocalDate getThesisstdate() {
		return thesisstdate;
	}

	public void setThesisstdate(LocalDate thesisstdate) {
		this.thesisstdate = thesisstdate;
	}

	public String getThesistopic() {
		return thesistopic;
	}

	public void setThesistopic(String thesistopic) {
		this.thesistopic = thesistopic;
	}

	public LocalDate getThesisenddate() {
		return thesisenddate;
	}

	public void setThesisenddate(LocalDate thesisenddate) {
		this.thesisenddate = thesisenddate;
	}

	@Override
	public String toString() {
		return "GraduateStudent [thesisstdate=" + thesisstdate + ", thesistopic=" + thesistopic + ", thesisenddate="
				+ thesisenddate + "]";
	}

}
