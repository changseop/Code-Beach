
public class Patient {
	long id;//身份证号
	String appointedDepart;//预约科室
	String appointedDoctor;//预约医生
	String appointedTime;//预约就诊时间
	String name;//姓名
	String sex;//性别
	int age;//年龄
	String contactNum;//联系方式
	long feesForRegis;//挂号费用
	//药品消费（名称+单价+数量+状态Flag）
	class feesForDrug
	{
		String name;
		long fees;
		int num;
		int Flag;//是否拿药
	}
	//项目消费（名称+费用+状态Flag）
	class feesForItem
	{
		String name;
		long fees;
		int Flag;//是否做好该项目
	}
}
