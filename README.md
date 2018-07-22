# caipiao
caipiao 
这个彩票系统目前可以实现两大块功能：
1、利用数据库查询之前各期的中奖号码以及号码的趋势
2、随机选号（包括有条件和无条件两种情况）以及彩票的购买功能

运用到的环境及配置要求：
1、JDK1.8
2、Eclipse IDE for Java Developers
3、数据库：MySQL 8.0
4、开发语言:Java / SQL

所用知识点
1、Java语言基础：分支结构、循环结构与控件循环结构、数据基本类型、类的继承与封装、Java集合类、异常处理
2、多线程编程：实现Runnable接口创建线程类、启动线程的start（）方法、执行线程的run（）方法、线程休眠的sleep（）方法
3、Swing控件：JFrame控件、JDialog控件、JPanel控件、JButton控件、JTable控件、JTabbedPane控件、JProgressBar控件
4、数据库技术：JDBC基础、SQL语言、Statement的execute（）方法、PreparedStatement对象、ResultSet对象

具体操作：
1、将“caipiao”下载好后，利用eclipse将它导入进项目中，将db_lottery导入进MySQL中
2、打开com.db包内的ConnMySQL.java，将里面：
private static final String URL = "jdbc:mysql://127.0.0.1:3306/db_lottery?useUnicode=true&characterEncoding=utf8";
中的127.0.0.1:3306按自己配置的MySQL来填写；
private static final String USERNAME = "root";
private static final String PASSWORD = "654321";中的root和654321用户名和密码也改为自己的
3、修改完成后点击com.frame包下的LoginMain.java，将它Run As...，会弹出来登录界面框，点击任意地方，进入主界面，然后可以对界面进行操作
4、主界面中目前只实现了两个功能，即只能点击“查询号码走势”和“随机选号”功能
5、进入查询号码走势，是调用数据库的资料将其进行汇总，然后生成数据条和折线图
6、进入随机选号功能，其实就是一个随机数生成和限制，然后就是有条件的随机选号
7、有条件的选号中，如果不选择条件，会弹出提示对话框，选择条件不满足要求，也会弹出对话框

