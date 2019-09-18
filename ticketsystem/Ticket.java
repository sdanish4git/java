package ticketsystem;

public class Ticket {
	
	private String ticketNumber;
	private String createdBy;
	private String assignTo;
	private String ticketDesc;
	private int ticketType; //1-DB 2.WAS ticket 3- Network 
	private int status;  //0-new 1-Assigned 2-Inprogress 3-close 4-Cancelled
	private String comments;
	
	Ticket(){
		
	}
	
	
	
	public void updateComments(String comments) {
		this.comments=this.comments+"   "+comments;
	}
	
	public void printTicket() {
		System.out.println("Ticket Number "+ticketNumber+"  comments: "+comments);
	}
	
	
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getAssignTo() {
		return assignTo;
	}
	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}
	public String getTicketDesc() {
		return ticketDesc;
	}
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}
	public int getTicketType() {
		return ticketType;
	}
	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
