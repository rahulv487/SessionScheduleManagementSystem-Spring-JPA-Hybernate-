package com.cg.ssms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
    
    @Entity
	@Table(name = "ScheduledSessions")
	public class Client {

		@Id
		@Column(name="id")

		Integer Id;
		@Column(name="name")
		
		String name;
		@Column(name="duration")

		Double Duration;
		@Column(name="faculty")
		String Faculty;
		@Column(name="mode1")
		String Mode1;
		
		public Client() {
		
		}
		
		
		public Client(Integer Id, String name, Double Duration,
			String Faculty, String Mode1) {
			super();
			this.Id = Id;
			this.name = name;
			this.Duration = Duration;
			this.Faculty = Faculty;
			this.Mode1 = Mode1;
		}


		public Integer getId() {
			return Id;
		}
		public void setId(Integer Id) {
			this.Id = Id;
		}
		public String getName() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		public Double getDuration() {
			return Duration;
		}
		public void setDuration(Double Duration) {
			this.Duration = Duration;
		}
		public String getFaculty() {
			return Faculty;
		}
		public void setFaculty(String Faculty) {
			this.Faculty = Faculty;
		}
		public String getMode1() {
			return Mode1;
		}
		public void setMode1(String Mode1) {
			this.Mode1 = Mode1;
		}
		
		
	}


