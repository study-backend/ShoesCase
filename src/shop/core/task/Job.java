package shop.core.task;

import java.util.Date;

public interface Job {
	
	// �Ⱓ�� �۾��� ���� ó���ϴ� �κ� 
	public void periodEvent(Date date) throws Exception;
}
