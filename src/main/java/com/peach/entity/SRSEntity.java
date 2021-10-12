package com.peach.entity;

import java.util.Objects;

/**
 * @Author:peach
 * @Date:2021/9/29 10:03
 * @Content:
 */
public class SRSEntity {
    String action;
    Long client_id;
    String ip;
    String vhost;
    String app;
    String tcUrl;
    String pageUrl;
    Long send_bytes;
    Long recv_bytes;
    String stream;
    String file;
    String cmd;

    public SRSEntity(){}

    public SRSEntity(String action, Long client_id, String ip, String vhost, String app, String tcUrl, String pageUrl, Long send_bytes, Long recv_bytes, String stream, String file, String cmd) {
        this.action = action;
        this.client_id = client_id;
        this.ip = ip;
        this.vhost = vhost;
        this.app = app;
        this.tcUrl = tcUrl;
        this.pageUrl = pageUrl;
        this.send_bytes = send_bytes;
        this.recv_bytes = recv_bytes;
        this.stream = stream;
        this.file = file;
        this.cmd = cmd;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTcUrl() {
        return tcUrl;
    }

    public void setTcUrl(String tcUrl) {
        this.tcUrl = tcUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Long getSend_bytes() {
        return send_bytes;
    }

    public void setSend_bytes(Long send_bytes) {
        this.send_bytes = send_bytes;
    }

    public Long getRecv_bytes() {
        return recv_bytes;
    }

    public void setRecv_bytes(Long recv_bytes) {
        this.recv_bytes = recv_bytes;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        return "SRSEntity{" +
                "action='" + action + '\'' +
                ", client_id=" + client_id +
                ", ip='" + ip + '\'' +
                ", vhost='" + vhost + '\'' +
                ", app='" + app + '\'' +
                ", tcUrl='" + tcUrl + '\'' +
                ", pageUrl='" + pageUrl + '\'' +
                ", send_bytes=" + send_bytes +
                ", recv_bytes=" + recv_bytes +
                ", stream='" + stream + '\'' +
                ", file='" + file + '\'' +
                ", cmd='" + cmd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SRSEntity srsEntity = (SRSEntity) o;
        return Objects.equals(action, srsEntity.action) && Objects.equals(client_id, srsEntity.client_id) && Objects.equals(ip, srsEntity.ip) && Objects.equals(vhost, srsEntity.vhost) && Objects.equals(app, srsEntity.app) && Objects.equals(tcUrl, srsEntity.tcUrl) && Objects.equals(pageUrl, srsEntity.pageUrl) && Objects.equals(send_bytes, srsEntity.send_bytes) && Objects.equals(recv_bytes, srsEntity.recv_bytes) && Objects.equals(stream, srsEntity.stream) && Objects.equals(file, srsEntity.file) && Objects.equals(cmd, srsEntity.cmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, client_id, ip, vhost, app, tcUrl, pageUrl, send_bytes, recv_bytes, stream, file, cmd);
    }
}
