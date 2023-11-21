package th.mfu.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "menstrual_page")
public class menstrual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "period_start_date")
    private Date periodStartDate;

    @Column(name = "period_end_date")
    private Date periodEndDate;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "is_period_on_time")
    private Boolean isPeriodOnTime;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(Date periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public Date getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(Date periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Boolean getIsPeriodOnTime() {
        return isPeriodOnTime;
    }

    public void setIsPeriodOnTime(Boolean isPeriodOnTime) {
        this.isPeriodOnTime = isPeriodOnTime;
    }
}