import java.util.ArrayList;

public class Department
//科室类
{
String id;//科室编号
String name;//科室名称
int patNum;  //科室当前排队总人数（包含正在就诊）
int docNum;  //科室下属医生总数
ArrayList <Doctor> docArray=new ArrayList <Doctor>();//各科室存放医生的集合类
ArrayList <Patient> patArray=new ArrayList <Patient>();//各科室存放已预约的病人的集合类


public Department(String id,String name,int docNum)
//构造函数
   {
	this.id=id;
	this.name=name;
	this.patNum=0;
    for(int i=0;i<docNum;i++)
      {Doctor a=new Doctor(String id,String pwd,String name);//创建医生实例
       docArray.add(a);
       }
    }

public void appointdoctor(Patient patient)
//添加科室预约记录
  {
   }

public void appointdoctor(Patient patient)
//取消科室预约记录（病人未到达的情况）
  {
   }


public void curePatient(Patient patient)
//删除科室排队中的病人数目（病人看好病离开的情况）
  {
   }

public int showAssignment(Doctor doctor)
//查询该科室某医生排队人数
  {
   }

public void assignPatient(Patient patient)
//为科室内医生分配病人
  {
   }



}