package com.covidhms.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GeneralAppointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int patientId;
	
	private String userName;
	
	private String appointmentDate;
	
	private String dryCough;
	
	private String fever;
	
	private String lossOfTaste;
	
	private String breath;
	
	private String status;
	
	

	public GeneralAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GeneralAppointment(int id, int patientId, String userName, String appointmentDate, String dryCough,
			String fever, String lossOfTaste, String breath, String status) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.userName = userName;
		this.appointmentDate = appointmentDate;
		this.dryCough = dryCough;
		this.fever = fever;
		this.lossOfTaste = lossOfTaste;
		this.breath = breath;
		this.status = status;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getPatientId() {
		return patientId;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getAppointmentDate() {
		return appointmentDate;
	}



	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}



	public String getDryCough() {
		return dryCough;
	}



	public void setDryCough(String dryCough) {
		this.dryCough = dryCough;
	}



	public String getFever() {
		return fever;
	}



	public void setFever(String fever) {
		this.fever = fever;
	}



	public String getLossOfTaste() {
		return lossOfTaste;
	}



	public void setLossOfTaste(String lossOfTaste) {
		this.lossOfTaste = lossOfTaste;
	}



	public String getBreath() {
		return breath;
	}



	public void setBreath(String breath) {
		this.breath = breath;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "GeneralAppointment [id=" + id + ", patientId=" + patientId + ", userName=" + userName
				+ ", appointmentDate=" + appointmentDate + ", dryCough=" + dryCough + ", fever=" + fever
				+ ", lossOfTaste=" + lossOfTaste + ", breath=" + breath + ", status=" + status + "]";
	}
	
	
	

	
	
	
	
	
	
}