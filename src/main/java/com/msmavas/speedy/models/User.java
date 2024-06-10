package com.msmavas.speedy.models;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="name")
    private String name;

    @Column(name="shortbio")
    private String shortBio;

    @Column(name="aboutme")
    private String aboutMe;

    @Column(name="website")
    private String website;

    @Column(name="profilephoto")
    private String profilePhoto;

    @Column(name="email")
    private String email;

    @Column(name="mobile")
    private String mobile;

    @Column(name="gender")
    private String gender;

    @Column(name="dateofbirth")
    private Date dateOfBirth;

    @Column(name="city")
    private String city;

    @Column(name="location")
    private String location;

    @Column(name="password")
    private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortBio() {
		return shortBio;
	}

	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int id, String name, String shortBio, String aboutMe, String website, String profilePhoto,
			String email, String mobile, String gender, Date dateOfBirth, String city, String location,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.shortBio = shortBio;
		this.aboutMe = aboutMe;
		this.website = website;
		this.profilePhoto = profilePhoto;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.location = location;
		this.password = password;
	}

	public User() {
		super();
	}
    
    

	
	

}
