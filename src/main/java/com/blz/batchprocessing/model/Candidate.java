package com.blz.batchprocessing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @Column(name = "CANDIDATE_ID")
    private Long candidateId;
    @Column(name = "CICID")
    private String cicId;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNum;
    @Column(name = "HIRED_DATE")
    private String hiredDate;
    @Column(name = "DEGREE")
    private String degree;
    @Column(name = "AGREE_PER")
    private double aggrPer;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "PREFERREDJOBLOCATION")
    private String preferredJobLocation;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PASSED_OUT_YEAR")
    private String passedOutYear;
    @Column(name = "CREATOR_USER")
    private String creatorUser;
    @Column(name = "CANDIDATE_STATUS")
    private String candidateStatus;
}
