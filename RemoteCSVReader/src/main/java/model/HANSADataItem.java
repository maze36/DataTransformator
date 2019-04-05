package model;

import java.sql.Timestamp;

public class HANSADataItem {

	private int origin = 3;
	private Timestamp timestamp_sat = null;
	private Timestamp timestamp_ais;
	private int mmsi;
	private String status;
	private double turn;
	private double speed;
	private double lon;
	private double lat;
	private double course;
	private double heading;
	private int imo;
	private String callsign;
	private String shipname;
	private double to_bow;
	private double to_stern;
	private double to_port;
	private double to_starboard;
	private Timestamp eta;
	private double draught;
	private String destination;
	
	public HANSADataItem() {
		
	}
	
	public HANSADataItem(int origin, Timestamp timestamp_sat, Timestamp timestamp_ais, int mmsi, String status,
			double turn, double speed, double lon, double lat, double course, double heading, int imo, String callsign,
			String shipname, double to_bow, double to_stern, double to_port, double to_starboard, Timestamp eta,
			double draught, String destination) {
		super();
		this.origin = origin;
		this.timestamp_sat = timestamp_sat;
		this.timestamp_ais = timestamp_ais;
		this.mmsi = mmsi;
		this.status = status;
		this.turn = turn;
		this.speed = speed;
		this.lon = lon;
		this.lat = lat;
		this.course = course;
		this.heading = heading;
		this.imo = imo;
		this.callsign = callsign;
		this.shipname = shipname;
		this.to_bow = to_bow;
		this.to_stern = to_stern;
		this.to_port = to_port;
		this.to_starboard = to_starboard;
		this.eta = eta;
		this.draught = draught;
		this.destination = destination;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	public Timestamp getTimestamp_sat() {
		return timestamp_sat;
	}
	public void setTimestamp_sat(Timestamp timestamp_sat) {
		this.timestamp_sat = timestamp_sat;
	}
	public Timestamp getTimestamp_ais() {
		return timestamp_ais;
	}
	public void setTimestamp_ais(Timestamp timestamp_ais) {
		this.timestamp_ais = timestamp_ais;
	}
	public int getMmsi() {
		return mmsi;
	}
	public void setMmsi(int mmsi) {
		this.mmsi = mmsi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTurn() {
		return turn;
	}
	public void setTurn(double turn) {
		this.turn = turn;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getCourse() {
		return course;
	}
	public void setCourse(double course) {
		this.course = course;
	}
	public double getHeading() {
		return heading;
	}
	public void setHeading(double heading) {
		this.heading = heading;
	}
	public int getImo() {
		return imo;
	}
	public void setImo(int imo) {
		this.imo = imo;
	}
	public String getCallsign() {
		return callsign;
	}
	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}
	public String getShipname() {
		return shipname;
	}
	public void setShipname(String shipname) {
		this.shipname = shipname;
	}
	public double getTo_bow() {
		return to_bow;
	}
	public void setTo_bow(double to_bow) {
		this.to_bow = to_bow;
	}
	public double getTo_stern() {
		return to_stern;
	}
	public void setTo_stern(double to_stern) {
		this.to_stern = to_stern;
	}
	public double getTo_port() {
		return to_port;
	}
	public void setTo_port(double to_port) {
		this.to_port = to_port;
	}
	public double getTo_starboard() {
		return to_starboard;
	}
	public void setTo_starboard(double to_starboard) {
		this.to_starboard = to_starboard;
	}
	public Timestamp getEta() {
		return eta;
	}
	public void setEta(Timestamp eta) {
		this.eta = eta;
	}
	public double getDraught() {
		return draught;
	}
	public void setDraught(double draught) {
		this.draught = draught;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
