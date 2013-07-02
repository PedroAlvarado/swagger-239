package com.wordnik.swagger.sample.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "school")
@XmlAccessorType(XmlAccessType.FIELD)
public class School {
  public static final String INTERVAL_ALL = "all";
  public static final String INTERVAL_DAY = "day";

  @XmlElement(name = "channel_id")
  private long channelId;
  @XmlElement(name = "channel_name")
  private String channelName;
  @XmlElement(name = "school_performance")
  List<SchoolPerformance> schoolPerformanceList;

  public long getChannelId() {
    return channelId;
  }

  public void setChannelId(long channelId) {
    this.channelId = channelId;
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public List<SchoolPerformance> getSchoolPerformanceList() {
    return schoolPerformanceList;
  }

  public void setSchoolPerformanceList(
          List<SchoolPerformance> schoolPerformanceList) {
    this.schoolPerformanceList = schoolPerformanceList;
  }
}
