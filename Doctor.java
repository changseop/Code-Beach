import java.util.LinkedList;

import javax.swing.JPanel;

public class Doctor extends Account
{
String name;//医生姓名
private LinkedList<Patient> patList = new LinkedList<Patient>();//排队的病人队列，第一个病人当前正在看病
JPanel docPanel1=new JPanel();//医生登陆后的面板


public Doctor(String id,String pwd,String name)
//构造函数
  {
this.id=id;
this.pwd=pwd;
this.name=name;
  }

public void recipe(/*处方*/)
//开处方
  {
   /*查询药品*/
   /*在处方中添加药品*/
   }

public void cure(Patient patient)
//看完一个病人
  {/*排在第一个的病人出队列*/
  }
public void turnToPanel()
  {
   }

}
