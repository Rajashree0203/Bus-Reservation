package busRerv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int no, boolean ac, int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusNo() {
		return busNo;
	}

	public boolean getAC() {
		return ac;
	}

	public int getCapcity() {
		return capacity;
	}

	public void setBusNo(int no) {
		busNo = no;
	}

	public void setAc(boolean val) {
		ac = val;
	}

	public void setCapcity(int cap) {
		capacity = cap;
	}

	public void displayBusInfo() {
		System.out.println("BusNo:" + busNo + " AC:" + ac + " Total Capacity:" + capacity);
	}
}
