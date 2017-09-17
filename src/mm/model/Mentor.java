package mm.model;

import java.util.ArrayList;

public class Mentor extends User{
	  private String role;
	   private boolean activeStatus;
	   private int company;
	   private String experience;
	   private ArrayList<WorkPlace>workplace;
	   private String volunteering;
	   

		public Mentor(int id, String firstName, String lastName, String email, String phoneNumber, String password,
			String gender, String address, String note, String role, boolean activeStatus, int company, String experience,
			ArrayList<WorkPlace> workplace, String volunteering) {
		super(id, firstName, lastName, email, phoneNumber, password, gender, address, note);
		this.role = role;
		this.activeStatus = activeStatus;
		this.company = company;
		this.experience = experience;
		this.workplace = workplace;
		this.volunteering = volunteering;
	}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		public boolean isActiveStatus() {
			return activeStatus;
		}


		public void setActiveStatus(boolean activeStatus) {
			this.activeStatus = activeStatus;
		}


		public int getCompany() {
			return company;
		}


		public void setCompany(int company) {
			this.company = company;
		}


		public String getExperience() {
			return experience;
		}


		public void setExperience(String experience) {
			this.experience = experience;
		}


		public ArrayList<WorkPlace> getWorkplace() {
			return workplace;
		}


		public void setWorkplace(ArrayList<WorkPlace> workplace) {
			this.workplace = workplace;
		}


		public String getVolunteering() {
			return volunteering;
		}


		public void setVolunteering(String volunteering) {
			this.volunteering = volunteering;
		}


}
