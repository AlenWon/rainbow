=====================================================================
Rainbow 1.5.9-RELEASE 2015-09-22
1:�����޸���RSA�ǶԳƼ��ܽ���API org.hx.rainbow.common.security.rsa����������
pom:
������	<dependency>
			<groupId>bouncycastle</groupId>
			<artifactId>bcprov-jdk16</artifactId>
			<version>140</version>
		</dependency>

=====================================================================
Rainbow 1.5.8-RELEASE 2015-08-13
1:���ӣ�SoaManger�������invokeNoTx(), �˷���ֱ�ӻ�ȡspring ioc������е��ã����������ݿ�������service�У��������Ҫ���ݿ�
�����ķ�����ֱ��ʹ��invokeNoTx()�����������������ܡ�
2:ȥ��rainbow-common���е�log��,��־ȫ��ʹ��log4j2���ֲ�ʽ��־����rainbow-plugin����rainbow-plugin-logger
4:��Դspringmvc ���л���fastjson ��jackjson��ԭ������fastjson����Ϊһ��json�ַ�������ͨ��ajax�󶨱������ʱ������jackjson

=====================================================================
Rainbow 1.5.7-RELEASE
1:����spring4.1.6
2:����mybatis3.2.8
3:����mybatis-spring1.2.2
4:ȥ��springmvc��jackjson ��Ϊfastjson �޸���Ӧ��spring-mvc.xml �޸�web.xml�� �ַ��������á�spring mvc ����������
=====================================================================
Rainbow 1.5.6-RELEASE
1:��Dao ��Ӷ�����Դ����,Ĭ�ϵ�ֵΪapplicationContext-db.xml�����õ�SQLģ��ΪsqlSessionTemplate
=====================================================================
Rainbow 1.5.5-RELEASE
1:��RainbowContext�� ���clone(); deepClone();����
====================================================================
Rainbow 1.5.4-RELEASE 
1:��Rainbow-common�����в��,�γɲ��ģʽ����Rainbow-commonǨ��
  rainbow-plugin-auth:ϵͳȨ�޹���;
  rainbow-plugin-login:ϵͳ��ȫ��¼;
  rainbow-plugin-ddd:��������������ƿ��;
  rainbow-plugin-quartz:������ȷ���;
  rainbow-plugin-aq:����oracle�е�advanced queue�Ŀͻ���ʵ��;
2:��BaseService���е�update,insert�������쳣������־��ӡ���쳣��ջ�׳�

