package factory;

/**
 * @author ljj
 *
 */
public class DealTest {
	
/**���Թ���ģʽ��
 * @param type
 * @return
 */
public static DealAll getbean(String type){
	if("one".equals(type)){
		return new ChildDealOne();
	}
	else if ("two".equals(type)){
		return new ChildDealSecond();
	}
	else{
		return null;
	}
}
public static void main(String[] args){
	//��ȡ��Ӧ�Ķ���
	DealAll all = getbean("one");
	all.dealThings();
}
}
