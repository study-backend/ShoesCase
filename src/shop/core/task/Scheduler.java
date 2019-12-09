package shop.core.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler extends ScheduleBase {
	
	
	public Scheduler() { }

	public Scheduler(Job job, Date triggerTime, Date periodTime) {
		this.task = new Task(job);
		this.tread = new Thread(task);
		this.setTriggerTime(triggerTime);
		this.setPeriod(periodTime);

		this.tread.start();
		this.state = State.Running;
	}

	class Task implements Runnable {

		Job job;

		public Task(Job job) {
			this.job = job;
		}

		@Override
		public void run() {

			System.out.println("나는 동작한다");
			// getTime
			Date time = Scheduler.this.getTriggerTime();
			Date period = Scheduler.this.getPeriod();
			
			// formating time
			SimpleDateFormat dateTime = new SimpleDateFormat("HH:mm");
			String triggerTime = dateTime.format(time);
			String periodTime = dateTime.format(period).substring(0, 2);
			int periodmilliseconds = (Integer.parseInt(periodTime) + 1) * 60 * 1000;
			
			// scheduling 
			while(true) {
				Calendar cal = Calendar.getInstance();	
				int h = cal.get(Calendar.HOUR_OF_DAY);
				int mi = cal.get(Calendar.MINUTE);
				
				String t = String.format("%d:%d", h, mi);
				
				if(t.equals(triggerTime)) {
					break;
				}
			}
			
			// timer 
			Timer timer = new Timer();
			TimerTask timerTask = new TimerTask() {

				@Override
				public void run() {
					// �Ϸ��߿� 00:00:00 �� ���ѹ� �߻��ǹǷ�
					try {
						Task.this.job.periodEvent(new Date());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			};
			// 1�еں��� 24�ð� ���� �ѹ��� �ݺ��ϱ� ���ؼ� 
			timer.schedule(timerTask, (1000 * 60), periodmilliseconds);
		}
	}

}
