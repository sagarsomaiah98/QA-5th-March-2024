
public class ReadFromExcel {

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\QA-5th-March-2024\\Excel_Parameterization\\src\\TESTDATA\\TESTSUITE.xlsx");
		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
	
		for(int i=1;i<=rowCount;i++) {
	String col1=xls.getCellData("GMAIL", "TCID", i);	
	String col2=xls.getCellData("GMAIL", "TESTCASE", i);
	String col3=xls.getCellData("GMAIL", "STATUS", i);
	System.out.println(col1+"| "+col2+" |"+ col3);
		}
		
	}

}
