package A.SingleLeton;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��17�� ����10:35:28 
* ����ģʽ--����ʽ 
*/
public class SingletonLazy {

	public static void main(String[] args) {
		President zt1 = President.getInstance();
		zt1.getName();//�����ͳ������
		President zt2 = President.getInstance();
		zt2.getName();//�����ͳ����
		if(zt1==zt2){
			System.out.println("������ͬһ�ˣ�");
		}else{
			System.out.println("���ǲ���ͬһ�ˣ�");
		}

	}

}

class President{
	private static volatile President instance=null;//��֤instance��
	//�����߳���ͬ��
	private President(){
		System.out.println("����һ����ͳ��");
	}
	
	public static synchronized President getInstance(){
		//��getInstance�����ϼ�ͬ��
		if(instance==null){
			instance=new President();
		}else{
			System.out.println("�Ѿ���һ����ͳ�����ܲ�������ͳ��");
		}
		return instance;
	}
	
	public void getName(){
		System.out.println("����������ͳ��XXX��");
	}
}