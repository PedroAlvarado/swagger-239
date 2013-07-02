package com.wordnik.swagger.sample.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "school_performance")
@XmlAccessorType(XmlAccessType.FIELD)
public class SchoolPerformance {
  @XmlElement(name = "datetime_begin")
  private Date beginDate;
  @XmlElement(name = "datetime_end")
  private Date endDate;
  @XmlElement(name = "event_total")
  private Long eventTotal;
  @XmlElement(name = "conversion_rate")
  private Double conversionRate;
  @XmlElement(name = "school_event_performance")
  List<SchoolEventPerformance> eventPerformanceList;

  public Date getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Long getEventTotal() {
    return eventTotal;
  }

  public void setEventTotal(Long eventTotal) {
    this.eventTotal = eventTotal;
  }

  public Double getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Double clickRate) {
    this.conversionRate = clickRate;
  }

  public List<SchoolEventPerformance> getEventPerformanceList() {
    return eventPerformanceList;
  }

  public void setEventPerformanceList(
          List<SchoolEventPerformance> eventPerformanceList) {
    this.eventPerformanceList = eventPerformanceList;
  }
}
