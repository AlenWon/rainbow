### Rainbow����:
 ����Ϊ:Spring mvc + Spring + mybatis��װ�Ŀ���ƽ̨��������΢����ܹ���
 
##CRUD�����д��
 
 @Lazy
 @Service
 public class DemoService extends BaseService{
		private static final String NAMESPACE = "SYSJMX";

		public RainbowContext query(RainbowContext context) {
			super.query(context, NAMESPACE);
			return context;
		}

		public RainbowContext insert(RainbowContext context) {
			try {
				context.addAttr("guid", new ObjectId().toString());
				super.insert(context, NAMESPACE);
			} catch (Exception e) {
				context.setSuccess(false);
				context.setMsg(e.getMessage());
			}
			return context;
		}
		
		public RainbowContext update(RainbowContext context) {
			super.update(context, NAMESPACE);
			return context;
		}
		
		public RainbowContext delete(RainbowContext context) {
			super.getDao().delete(NAMESPACE, "delete", context.getAttr());
			context.getAttr().clear();
			return context;
		}
 }

## ������ã�
	RainbowContext context = new RainbowContext("demoService", "query"); //��֯����������
        context.addAttr("name","rainbow");//���񴫲���

	context = SoaManager.getInstance().invoke(context);//����������÷���

	context = SoaManager.getInstance().invokeNoTx(context);	//���ڷ�������÷���
	
	System.out.println("��������Ϣ:" + context.getMsg());
	System.out.println("������״̬:" + context.isSuccess());
	System.out.println("����������б�:" + context.getRows());
