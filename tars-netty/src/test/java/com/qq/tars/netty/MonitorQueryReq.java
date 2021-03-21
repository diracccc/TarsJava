// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package com.qq.tars.netty;

import com.qq.tars.protocol.tars.TarsInputStream;
import com.qq.tars.protocol.tars.TarsOutputStream;
import com.qq.tars.protocol.tars.annotation.TarsStruct;
import com.qq.tars.protocol.tars.annotation.TarsStructProperty;
import com.qq.tars.protocol.util.TarsUtil;

@TarsStruct
public class MonitorQueryReq {

    @TarsStructProperty(order = 0, isRequire = true)
    public String uid = "";
    @TarsStructProperty(order = 1, isRequire = true)
    public String method = "query";
    @TarsStructProperty(order = 2, isRequire = true)
    public String dataid = "";
    @TarsStructProperty(order = 3, isRequire = true)
    public String date = "";
    @TarsStructProperty(order = 4, isRequire = true)
    public String tflag1 = "";
    @TarsStructProperty(order = 5, isRequire = true)
    public String tflag2 = "";
    @TarsStructProperty(order = 6, isRequire = true)
    public java.util.List<Condition> conditions = null;
    @TarsStructProperty(order = 7, isRequire = true)
    public java.util.List<String> indexs = null;
    @TarsStructProperty(order = 8, isRequire = true)
    public java.util.List<String> groupby = null;
    @TarsStructProperty(order = 9, isRequire = false)
    public int intervalTime = 5;
    @TarsStructProperty(order = 10, isRequire = false)
    public int dateType = 0;
    @TarsStructProperty(order = 11, isRequire = false)
    public long startTime = 0L;
    @TarsStructProperty(order = 12, isRequire = false)
    public long endTime = 0L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTflag1() {
        return tflag1;
    }

    public void setTflag1(String tflag1) {
        this.tflag1 = tflag1;
    }

    public String getTflag2() {
        return tflag2;
    }

    public void setTflag2(String tflag2) {
        this.tflag2 = tflag2;
    }

    public java.util.List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
    }

    public java.util.List<String> getIndexs() {
        return indexs;
    }

    public void setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
    }

    public java.util.List<String> getGroupby() {
        return groupby;
    }

    public void setGroupby(java.util.List<String> groupby) {
        this.groupby = groupby;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public int getDateType() {
        return dateType;
    }

    public void setDateType(int dateType) {
        this.dateType = dateType;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public MonitorQueryReq() {
    }

    public MonitorQueryReq(String uid, String method, String dataid, String date, String tflag1, String tflag2, java.util.List<Condition> conditions, java.util.List<String> indexs, java.util.List<String> groupby, int intervalTime, int dateType, long startTime, long endTime) {
        this.uid = uid;
        this.method = method;
        this.dataid = dataid;
        this.date = date;
        this.tflag1 = tflag1;
        this.tflag2 = tflag2;
        this.conditions = conditions;
        this.indexs = indexs;
        this.groupby = groupby;
        this.intervalTime = intervalTime;
        this.dateType = dateType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + TarsUtil.hashCode(uid);
        result = prime * result + TarsUtil.hashCode(method);
        result = prime * result + TarsUtil.hashCode(dataid);
        result = prime * result + TarsUtil.hashCode(date);
        result = prime * result + TarsUtil.hashCode(tflag1);
        result = prime * result + TarsUtil.hashCode(tflag2);
        result = prime * result + TarsUtil.hashCode(conditions);
        result = prime * result + TarsUtil.hashCode(indexs);
        result = prime * result + TarsUtil.hashCode(groupby);
        result = prime * result + TarsUtil.hashCode(intervalTime);
        result = prime * result + TarsUtil.hashCode(dateType);
        result = prime * result + TarsUtil.hashCode(startTime);
        result = prime * result + TarsUtil.hashCode(endTime);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MonitorQueryReq)) {
            return false;
        }
        MonitorQueryReq other = (MonitorQueryReq) obj;
        return (
                TarsUtil.equals(uid, other.uid) &&
                        TarsUtil.equals(method, other.method) &&
                        TarsUtil.equals(dataid, other.dataid) &&
                        TarsUtil.equals(date, other.date) &&
                        TarsUtil.equals(tflag1, other.tflag1) &&
                        TarsUtil.equals(tflag2, other.tflag2) &&
                        TarsUtil.equals(conditions, other.conditions) &&
                        TarsUtil.equals(indexs, other.indexs) &&
                        TarsUtil.equals(groupby, other.groupby) &&
                        TarsUtil.equals(intervalTime, other.intervalTime) &&
                        TarsUtil.equals(dateType, other.dateType) &&
                        TarsUtil.equals(startTime, other.startTime) &&
                        TarsUtil.equals(endTime, other.endTime)
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MonitorQueryReq(");
        sb.append("uid:");
        if (this.uid == null) {
            sb.append("null");
        } else {
            sb.append(this.uid);
        }
        sb.append(", ");
        sb.append("method:");
        if (this.method == null) {
            sb.append("null");
        } else {
            sb.append(this.method);
        }
        sb.append(", ");
        sb.append("dataid:");
        if (this.dataid == null) {
            sb.append("null");
        } else {
            sb.append(this.dataid);
        }
        sb.append(", ");
        sb.append("date:");
        if (this.date == null) {
            sb.append("null");
        } else {
            sb.append(this.date);
        }
        sb.append(", ");
        sb.append("tflag1:");
        if (this.tflag1 == null) {
            sb.append("null");
        } else {
            sb.append(this.tflag1);
        }
        sb.append(", ");
        sb.append("tflag2:");
        if (this.tflag2 == null) {
            sb.append("null");
        } else {
            sb.append(this.tflag2);
        }
        sb.append(", ");
        sb.append("conditions:");
        if (this.conditions == null) {
            sb.append("null");
        } else {
            sb.append(this.conditions);
        }
        sb.append(", ");
        sb.append("indexs:");
        if (this.indexs == null) {
            sb.append("null");
        } else {
            sb.append(this.indexs);
        }
        sb.append(", ");
        sb.append("groupby:");
        if (this.groupby == null) {
            sb.append("null");
        } else {
            sb.append(this.groupby);
        }
        sb.append(", ");
        sb.append("intervalTime:");
        sb.append(this.intervalTime);
        sb.append(", ");
        sb.append("dateType:");
        sb.append(this.dateType);
        sb.append(", ");
        sb.append("startTime:");
        sb.append(this.startTime);
        sb.append(", ");
        sb.append("endTime:");
        sb.append(this.endTime);
        sb.append(")");
        return sb.toString();
    }

    public void writeTo(TarsOutputStream _os) {
        _os.write(uid, 0);
        _os.write(method, 1);
        _os.write(dataid, 2);
        _os.write(date, 3);
        _os.write(tflag1, 4);
        _os.write(tflag2, 5);
        _os.write(conditions, 6);
        _os.write(indexs, 7);
        _os.write(groupby, 8);
        _os.write(intervalTime, 9);
        _os.write(dateType, 10);
        _os.write(startTime, 11);
        _os.write(endTime, 12);
    }

    static java.util.List<Condition> cache_conditions;

    static {
        cache_conditions = new java.util.ArrayList<Condition>();
        Condition var_1 = new Condition();
        cache_conditions.add(var_1);
    }

    static java.util.List<String> cache_indexs;

    static {
        cache_indexs = new java.util.ArrayList<String>();
        String var_2 = "";
        cache_indexs.add(var_2);
    }

    static java.util.List<String> cache_groupby;

    static {
        cache_groupby = new java.util.ArrayList<String>();
        String var_3 = "";
        cache_groupby.add(var_3);
    }

    public void readFrom(TarsInputStream _is) {
        this.uid = _is.readString(0, true);
        this.method = _is.readString(1, true);
        this.dataid = _is.readString(2, true);
        this.date = _is.readString(3, true);
        this.tflag1 = _is.readString(4, true);
        this.tflag2 = _is.readString(5, true);
        this.conditions = (java.util.List<Condition>) _is.read(cache_conditions, 6, true);
        this.indexs = (java.util.List<String>) _is.read(cache_indexs, 7, true);
        this.groupby = (java.util.List<String>) _is.read(cache_groupby, 8, true);
        this.intervalTime = _is.read(intervalTime, 9, false);
        this.dateType = _is.read(dateType, 10, false);
        this.startTime = _is.read(startTime, 11, false);
        this.endTime = _is.read(endTime, 12, false);
    }

}