package shop.core.task;

import java.util.Date;

public abstract class ScheduleBase {
	public enum State {
	    Running, Stop, Waiting, Terminated
	}
	public State state = State.Terminated;
	
	protected Date triggerTime = null; 
	protected Date period = null;
	protected Runnable task = null;
    protected Thread tread = null;

	public ScheduleBase() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the triggerDate
	 */
	public Date getTriggerTime() {
		return triggerTime;
	}

	/**
	 * @param triggerDate the triggerDate to set
	 */
	public void setTriggerTime(Date triggerTime) {
		this.triggerTime = triggerTime;
	}
	
	/**
	 * @return the period
	 */
	public Date getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public void setPeriod(Date period) {
		this.period = period;
	}

}
