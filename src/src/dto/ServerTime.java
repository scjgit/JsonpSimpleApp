package src.dto;

import java.io.Serializable;

public class ServerTime implements Serializable {

	private static final long serialVersionUID = 1L;

	private String serverHour;
	private String serverMin;
	private String serverSec;
	private String serverDay;
	private String serverMon;

	public String getServerHour() {
		return serverHour;
	}

	public void setServerHour(String serverHour) {
		this.serverHour = serverHour;
	}

	public String getServerMin() {
		return serverMin;
	}

	public void setServerMin(String serverMin) {
		this.serverMin = serverMin;
	}

	public String getServerSec() {
		return serverSec;
	}

	public void setServerSec(String serverSec) {
		this.serverSec = serverSec;
	}

	public String getServerDay() {
		return serverDay;
	}

	public void setServerDay(String serverDay) {
		this.serverDay = serverDay;
	}

	public String getServerMon() {
		return serverMon;
	}

	public void setServerMon(String serverMon) {
		this.serverMon = serverMon;
	}

	@Override
	public String toString() {
		return "ServerTime - " + serverDay + "/" + serverMon + " | "
				+ serverHour + " : " + serverMin + " : " + serverSec;
	}

}
